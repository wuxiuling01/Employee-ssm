package com.besokuse.proj.service;

import com.besokuse.proj.pojo.Department;

/**
 * @author: besokuse
 * @since: 2020/9/27 11:51
 */
public interface DepartmentService {

    Department findRootSources();


    Department findRootSourcesWithChildren(Department root);

    void addSources(Department sources);


    void updateSources(Department sources);


    void delByIdSources(Department id);
}
