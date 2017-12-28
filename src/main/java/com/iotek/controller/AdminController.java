package com.iotek.controller;

import com.iotek.po.Admin;
import com.iotek.service.AdminService;
import com.iotek.util.Validate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

/**
 * Created by xiaohuang on 2017/12/27.
 */
@Controller
@RequestMapping(value = "/admin")
public class AdminController {
    @Autowired
    AdminService adminService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String IndexView() {

        return "admin/index";
    }

    @RequestMapping(value = "/login.view", method = RequestMethod.GET)
    public String loginView() {
        return "admin/login";

    }

    @RequestMapping(value = "/login.do", method = RequestMethod.POST)
    public String login(@ModelAttribute Admin admin,
                        HttpSession httpSession
    ) {
        if (admin == null) {
            Validate.checkNull("�û���ϢΪ��");
        }
        admin = adminService.query(admin);
        if (admin == null) {
            httpSession.setAttribute("info", "��¼ʧ��");
            return "redirect:/admin/login.view";
        }
        httpSession.setAttribute("info", "��ӭ" + admin.getAdminName());
        httpSession.setAttribute("admin", admin);
        return "redirect:/admin/";
    }
}
