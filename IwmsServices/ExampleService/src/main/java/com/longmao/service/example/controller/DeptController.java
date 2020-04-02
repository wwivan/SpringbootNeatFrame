package com.longmao.service.example.controller;


import com.longmao.service.example.service.DepartmentService;
import com.longmao.serviceApi.example.entity.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("dept")
@CrossOrigin
public class DeptController {
    @Autowired
    DepartmentService departmentService;
    @RequestMapping("add")
    public void add(@RequestBody Department req){
        String departmentName = req.getDepartmentName();
        System.out.println(departmentName);
        departmentService.save(req);
    }
}
