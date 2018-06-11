package com.zxy.sample.db.dao;

import com.zxy.sample.db.entry.SysUser;

public interface SysUserDao {

    public SysUser findSysUserByAccount(String account);
}
