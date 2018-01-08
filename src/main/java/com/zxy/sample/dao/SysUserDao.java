package com.zxy.sample.dao;

import com.zxy.sample.entry.SysUser;

public interface SysUserDao {

    public SysUser findSysUserByAccount(String account);
}
