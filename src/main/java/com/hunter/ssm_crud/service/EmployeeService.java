package com.hunter.ssm_crud.service;

import com.github.pagehelper.PageInfo;
import com.hunter.ssm_crud.bean.Employee;

public interface EmployeeService {

    PageInfo<Employee> getAll(Integer pageNum);
}