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

//         �ض��� ָ������   ������ض���ĳ��ҳ�� �����ض��������ٵ�ҳ��
//          �������·��ǰ��  /    ���������Ǵ�Ӧ�÷����� ��Ŀ¼
//            �������ǰ����   /   ���������Ǵӵ�ǰĿ¼��ʼ
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
