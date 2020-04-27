package com.xiao.blogutimate.service;

import com.xiao.blogutimate.po.User;

public interface UserService {
    User checkUser(String username, String password);
}
