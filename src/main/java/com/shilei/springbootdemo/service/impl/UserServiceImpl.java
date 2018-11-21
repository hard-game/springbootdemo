package com.shilei.springbootdemo.service.impl;


import com.shilei.springbootdemo.entity.User;
import com.shilei.springbootdemo.mapper.UserMapper;
import com.shilei.springbootdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User find(int id){
        return userMapper.find(id);
    }
}
