package com.besokuse.proj.pojo;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author: besokuse
 * @since: 2020/9/27 10:14
 */
@Data
@ToString
public class Employee implements Serializable {
    private Integer id;
    private String name;
    private Integer age;
    private String sex;
    private String address;
}
