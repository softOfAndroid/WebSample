package com.zxy.sample.server;

import com.zxy.sample.db.entry.SysUser;
import com.zxy.sample.server.base.BaseServer;

public interface SysUserServer extends BaseServer<SysUser, Integer> {
    public SysUser login(String account, String password);
}
