package com.besokuse.proj.service.impl;

import com.besokuse.proj.dao.EmployeeMapper;
import com.besokuse.proj.pojo.Employee;
import com.besokuse.proj.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author: besokuse
 * @since: 2020/9/27 10:18
 */
@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public List<Employee> findAllEmployee() {
        return employeeMapper.findAllEmployee();
    }

    @Override
    public void addEmployee(Employee employee) {
        employeeMapper.addEmployee(employee);
    }

    @Override
    public void updateEmployee(Employee employee) {
        employeeMapper.updateEmployee(employee);
    }

    @Override
    public void delOneEmployee(Employee employee) {
        employeeMapper.delOneEmployee(employee);
    }
}
