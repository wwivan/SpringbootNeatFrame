package com.longmao.service.example.controller;

import com.longmao.service.example.service.UserService;
import com.longmao.serviceApi.example.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("user")
@CrossOrigin
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("all")
    @ResponseBody
    public List<User> getUser(){
        List<User> list = userService.list();
        return list;
    }

    @RequestMapping("user")
    public User find(@RequestBody User req){
        Integer id = req.getId();
        return userService.find(id);
    }

    @RequestMapping("userWith")
    public User findWith(@RequestBody User req){
        Integer id = req.getId();
        return userService.findWithDept(id);
    }

    @RequestMapping("userby")
    public User findUser(@RequestBody User req){
        String username = req.getUsername();
        return userService.findUser(username).get(0);
    }

    @RequestMapping("insert")
    public void insert(@RequestBody User req){
        userService.save(req);
    }
}
