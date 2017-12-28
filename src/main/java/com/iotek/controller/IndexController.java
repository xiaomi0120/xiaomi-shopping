package com.iotek.controller;

import com.iotek.po.Customer;
import com.iotek.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by xiaohuang on 2017/12/26.
 */

@Controller
public class IndexController {
    @Autowired
    CustomerService customerService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(HttpServletRequest request,
                        HttpSession httpSession) {
        Cookie[] cookies = request.getCookies();
        System.out.println("cookies:" + cookies);
        if (cookies == null) {

//         重定向到 指定请求   如果想重定向到某个页面 则先重定向到请求再到页面
//          如果请求路径前加  /    代表请求是从应用服务器 根目录
//            如果请求前不加   /   代表请求是从当前目录开始
            return "redirect:/customer/login.view";
        }

        String customerName = null;
        String customerPassword = null;

        for (Cookie cookie : cookies) {
            if (cookie != null) {
                if (cookie.getName() != null
                        && "customerName".equals(cookie.getName())) {
                    customerName = cookie.getValue();

                }

                if (cookie.getName() != null
                        && "customerPassword".equals(cookie.getName())) {
                    customerPassword = cookie.getValue();

                }
            }
        }

        Customer customer = new Customer();
        customer.setCustomerName(customerName);
        customer.setCustomerPassword(customerPassword);
        customer = customerService.query(customer);
        if (customer == null) {
            return "redirect:/customer/login.view";
        }

        httpSession.setAttribute("customer", customer);
        return "customer/customerIndex";

    }
}
