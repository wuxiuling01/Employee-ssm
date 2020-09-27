package com.besokuse.proj.service;

import com.besokuse.proj.pojo.Employee;

import java.util.List;

/**
 * @author: besokuse
 * @since: 2020/9/27 10:18
 */
public interface EmployeeService {
    /**
     * 查看所有员工信息
     * @return
     */
    List<Employee> findAllEmployee();

    /**
     * 添加员工信息
     * @param employee
     */

    void addEmployee(Employee employee);

    /**
     * 修改员工信息
     * @param employee
     */
    void updateEmployee(Employee employee);

    /**
     * 删除一个员工
     * @param employee
     */
    void delOneEmployee(Employee employee);
}
