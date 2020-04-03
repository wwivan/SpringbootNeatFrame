package com.longmao.service.example.controller;


import com.longmao.service.example.service.DepartmentService;
import com.longmao.serviceApi.example.entity.Department;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
    private final Logger log= LoggerFactory.getLogger(DeptController.class);
    @RequestMapping("add")
    public void add(@RequestBody Department req){
        String departmentName = req.getDepartmentName();
        System.out.println(departmentName);
        log.info(departmentName+"添加成功");
        departmentService.save(req);
    }
}
