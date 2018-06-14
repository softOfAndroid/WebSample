package com.zxy.sample.controller;

import com.zxy.sample.bean.ResponseResult;
import com.zxy.sample.db.entry.SysUser;
import com.zxy.sample.util.ResponseResultUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AppInterfaceController {

    @RequestMapping("login/user")
    @ResponseBody
    public ResponseResult test(){
        SysUser sysUser = new SysUser();
        sysUser.setAccount("1111");
        sysUser.setName("0000");
        sysUser.setPassword("2222");
        return ResponseResultUtil.success(sysUser);
    }
}
