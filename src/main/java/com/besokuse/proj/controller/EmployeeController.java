package com.besokuse.proj.controller;

import com.besokuse.proj.dto.ResultDto;
import com.besokuse.proj.pojo.Employee;
import com.besokuse.proj.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * @author: besokuse
 * @since: 2020/9/27 10:20
 */
@RestController
@RequestMapping("/emp")
public class EmployeeController {

    @ExceptionHandler
    public String empException(HttpServletRequest request, Exception e){
        return e.getMessage();
    }


    @Autowired
    private EmployeeService employeeService;


    @RequestMapping(value = "/getAll")
    public ResultDto<Employee> getAllEmployee() {
        return new ResultDto<>(200,"查询成功",employeeService.findAllEmployee());
    }

    @RequestMapping(value = "/addEmp")
    public ResultDto<Employee> addEmployee(@RequestBody Employee employee) {
        try {
            employeeService.addEmployee(employee);
            return new ResultDto<>(200,"添加成功",null);
        }catch (Exception e){
            return new ResultDto<>(400,"未知错误",null);
        }
    }
    @RequestMapping(value = "/updateEmp")
    public ResultDto<Employee> updateEmployee(@RequestBody Employee employee) {
        try {
            employeeService.updateEmployee(employee);
            return new ResultDto<>(200,"修改成功",null);
        }catch (Exception e){
            return new ResultDto<>(400,"未知错误",null);
        }
    }
    @RequestMapping(value = "/delOneEmp")
    public ResultDto<Employee> delOneEmployee(@RequestBody Employee employee) {
        try {
            employeeService.delOneEmployee(employee);
            return new ResultDto<>(200,"删除成功",null);
        }catch (Exception e){
            return new ResultDto<>(400,"未知错误",null);
        }
    }
}
