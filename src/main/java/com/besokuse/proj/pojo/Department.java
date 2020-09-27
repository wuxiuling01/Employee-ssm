package com.besokuse.proj.pojo;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

/**
 * @author: besokuse
 * @since: 2020/9/27 11:36
 */
@Data
@ToString
public class Department implements Serializable {
    private Integer id;
    private String name;
    private Integer pid;
    private List<Department> children;
}
