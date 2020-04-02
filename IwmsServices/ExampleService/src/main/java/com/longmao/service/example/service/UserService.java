package com.longmao.service.example.service;


import com.longmao.serviceApi.example.entity.User;
import com.longmao.service.example.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserMapper userMapper;
    @Cacheable(value="users",key = "'userlist'",unless = "#result==null")
    public List<User> list(){
        System.out.println("数据库查询");
        List<User> all = userMapper.findAll();
        return all;
    }
//    @Cacheable(value = "users",key = "'user:'+#id",unless = "#result==null")
    public User find(Integer id){
        System.out.println("数据库查询");
        return userMapper.findById(id);
    }
    public User findWithDept(Integer id){
        System.out.println("数据库查询");
        return userMapper.findByIdWithDept(id);
    }
    @CacheEvict(value = "users",key = "'userlist'")
    public void save(User user){
        System.out.println("插入数据");
        userMapper.insertUser(user);
    }

    public List<User> findUser(String username){
        return userMapper.findByName(username);
    }
}
