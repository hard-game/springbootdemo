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

    @Override
    public boolean login(String name,String password){
        User user=userMapper.findByName(name);
        if(user==null)
            return false;
        if(user.getPassword().equals(password))
            return true;
        else
            return false;
    }
}
