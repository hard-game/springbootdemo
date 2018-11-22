package com.shilei.springbootdemo.mapper;


import com.shilei.springbootdemo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Mapper
//可以忽略，忽略后service实现层会报错，但是不影响使用
@Component(value = "userMapper")
public interface UserMapper {

    User find(@Param("id") int id);
    User findByName(String name);

}
