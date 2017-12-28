package com.iotek.controller;

import com.iotek.po.Customer;
import com.iotek.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by xiaohuang on 2017/12/26.
 */
@Controller
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    CustomerService customerService;


    /*@RequestMapping(value = "/login",
    method = RequestMethod.POST)
    public   String  login(
            @ModelAttribute Customer customer,
            HttpSession httpSession
            ){
        customer  = customerService.query(customer);
        if (customer == null) {
            return "error";
        }

        httpSession.setAttribute("customer",customer);
        return  "customerIndex";

    }
*/
    @RequestMapping(value = "/login",
            method = RequestMethod.POST)
    public String login(
            @ModelAttribute Customer customer,
            @RequestParam(required = false) String remember,
            HttpSession httpSession,
            HttpServletResponse response
    ) {
       /* String customerName = request.getParameter("customerName");
        String customerPassword = request.getParameter("customerPassword");
        String remember = request.getParameter("remember");*/
       /* System.out.println(remember);
        Customer customer=new Customer();
        customer.setCustomerName(customerName);
        customer.setCustomerPassword(customerPassword);*/
        customer = customerService.query(customer);
        System.out.println(customer);
        if (customer == null) {
            httpSession.setAttribute("info", "µÇÂ¼Ê§°Ü");

            return "redirect:/customer/login.view";
        }
        System.out.println("remember:" + remember);
        if (remember != null) {
            Cookie cookieName = new Cookie("customerName", customer.getCustomerName());
            Cookie cookiePassword = new Cookie("customerPassword", customer.getCustomerName());
            cookieName.setMaxAge(1 * 60 * 60 * 24 * 7);
//            cookie  ÐèÒª¼ÓsetPath²ÅÄÜ±£´æ
            cookieName.setPath("/");
            cookiePassword.setMaxAge(1 * 60 * 60 * 24);
            cookiePassword.setPath("/");
            response.addCookie(cookieName);
            response.addCookie(cookiePassword);
            System.out.println(remember);

        }


        httpSession.setAttribute("customer", customer);
        return "customer/index";


    }

    @RequestMapping("/login.view")
    public String index() {
        return "customer/login";
    }

    //    ·µ»Ø×¢²áÒ³Ãæ
    @RequestMapping(value = "/register.view", method = RequestMethod.GET)
    public String getRegstierView() {
        return "customer/register";
    }

//    ¼ì²éÓÊÏä

    @RequestMapping(value = "/customerCheckEmail/{customerEmail}", method = RequestMethod.GET)
    public
    @ResponseBody
    String customerCheckEmail(@PathVariable String customerEmail) {
        System.out.println(customerEmail);
        return "is_exist";
    }


    @RequestMapping(value = "/register.do", method = RequestMethod.POST)
    public String register(@ModelAttribute Customer customer,
                           HttpSession httpSession
    ) {
        boolean add = customerService.add(customer);
        if (add) {
//            È¥µÇÂ¼
            httpSession.setAttribute("info", "×¢²á³É¹¦");


            return "redirect:/customer/login.view";
        }
        httpSession.setAttribute("info", "×¢²áÊ§°Ü£¬ÇëÖØÊÔ");
        return "redirect:/customer/register.view";

    }
}
