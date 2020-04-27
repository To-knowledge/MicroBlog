package com.xiao.blogutimate.service;

import com.xiao.blogutimate.dao.UserRepository;
import com.xiao.blogutimate.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User checkUser(String username, String password) {

        User user = userRepository.findByUsernameAndPassword(username, password);

        return user;
    }
}
