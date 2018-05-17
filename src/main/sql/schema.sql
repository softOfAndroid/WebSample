-- 数据库初始化脚本

-- 创建数据库
CREATE DATABASE sample;
-- 使用数据库
USE sample;
-- 创建用户登录表
CREATE TABLE sys_user(
  id INT NOT NULL  AUTO_INCREMENT PRIMARY KEY COMMENT '用户ID',
  account VARCHAR(20) NOT NULL  COMMENT '用户名',
  name VARCHAR(20) NOT NULL  COMMENT '用户类型',
  password VARCHAR(20) NOT NULL  COMMENT '密码'
) ENGINE = InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET = utf8 COMMENT = '用户登录表';

-- 初始化数据
insert into
  sys_user(account,name,password)
values
  ('admin','管理员','123456');
