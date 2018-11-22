package com.shilei.springbootdemo.service;

import com.shilei.springbootdemo.entity.User;

public interface UserService {
    public User find(int id);
    public boolean login(String name,String password);
}
