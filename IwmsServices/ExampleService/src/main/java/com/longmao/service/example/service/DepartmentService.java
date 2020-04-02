package com.longmao.service.example.service;


import com.longmao.serviceApi.example.entity.Department;
import com.longmao.service.example.mapper.DepartmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {
    @Autowired
    DepartmentMapper departmentMapper;
    public void save(Department department){
        departmentMapper.insertDept(department);
    }
}
