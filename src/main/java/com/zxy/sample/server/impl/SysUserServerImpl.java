package com.zxy.sample.server.impl;

import com.zxy.sample.exception.CustomException;
import com.zxy.sample.db.dao.SysUserDao;
import com.zxy.sample.db.entry.SysUser;
import com.zxy.sample.server.SysUserServer;
import com.zxy.sample.server.base.BaseServerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import static com.zxy.sample.exception.NullUtil.$;

@Service
public class SysUserServerImpl extends BaseServerImpl<SysUser, Integer> implements SysUserServer {
    @Autowired
    private SysUserDao userDao;

    @Override
    public SysUser login(String account, String password) {
        account = $("账户不能为空", account);
        password = $("密码不能为空", password);
        SysUser sysUser = userDao.findSysUserByAccount(account);
        if (sysUser == null) {
            throw new CustomException("账户不存在");
        }
        if (!sysUser.getPassword().equals(password)) {
            throw new CustomException("密码不正确");
        }
        return sysUser;
    }
}
