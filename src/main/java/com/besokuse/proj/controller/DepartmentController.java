package com.besokuse.proj.controller;

import com.besokuse.proj.dto.ResultDto;
import com.besokuse.proj.pojo.Department;
import com.besokuse.proj.pojo.Employee;
import com.besokuse.proj.service.DepartmentService;
import com.besokuse.proj.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;

/**
 * @author: besokuse
 * @since: 2020/9/27 10:20
 */
@RestController
@RequestMapping("/dept")
public class DepartmentController {

    @ExceptionHandler
    public String empException(HttpServletRequest request, Exception e){
        return e.getMessage();
    }


    @Autowired
    private DepartmentService departmentService;


    @RequestMapping(value = "/getAll")
    public ResultDto<Department> getAllEmployee() {
        Department rootSources = departmentService.findRootSourcesWithChildren(departmentService.findRootSources());
        ArrayList<Department> objects = new ArrayList<>();
        objects.add(rootSources);
        return new ResultDto<>(200,"查询成功",objects);
    }

    @RequestMapping(value = "/addEmp")
    public ResultDto<Employee> addEmployee(@RequestBody Department employee) {
        try {
            departmentService.addSources(employee);
            return new ResultDto<>(200,"添加成功",null);
        }catch (Exception e){
            return new ResultDto<>(400,"未知错误",null);
        }
    }
    @RequestMapping(value = "/updateEmp")
    public ResultDto<Employee> updateEmployee(@RequestBody Department employee) {
        try {
            departmentService.updateSources(employee);
            return new ResultDto<>(200,"修改成功",null);
        }catch (Exception e){
            return new ResultDto<>(400,"未知错误",null);
        }
    }
    @RequestMapping(value = "/delOneEmp")
    public ResultDto<Employee> delOneEmployee(@RequestBody Department employee) {
        try {
            departmentService.delByIdSources(employee);
            return new ResultDto<>(200,"删除成功",null);
        }catch (Exception e){
            return new ResultDto<>(400,"未知错误",null);
        }
    }
}
