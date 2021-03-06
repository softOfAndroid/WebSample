package com.zxy.sample.controller;


import com.zxy.sample.db.entry.SysUser;
import com.zxy.sample.server.SysUserServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

    @Autowired
    SysUserServer userServer;

    @RequestMapping("login")
    public String loginView() {
        return "login";
    }

    @RequestMapping("login.html")
    public String login(SysUser sysUser) {
        System.out.println(sysUser.getAccount() + "," + sysUser.getPassword());
        SysUser user = userServer.login("admin", "123456");

        return "redirect:index";
    }
}
