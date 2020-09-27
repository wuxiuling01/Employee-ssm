package com.besokuse.proj.dao;

import com.besokuse.proj.pojo.Department;

import java.util.List;

/**
 * @author: besokuse
 * @since: 2020/9/27 11:39
 */
public interface DepartmentMapper {
    /**
     * 查询根目录
     *
     * @return
     */
    Department findRootSources();



    /**
     * 根据pid获取父节点id
     *
     * @param pid
     * @return
     */
    List<Department> getChildrenSources(Integer pid);


    /**
     * 添加菜单
     *
     * @param sources
     */
    void addSources(Department sources);


    /**
     * 更改菜单信息
     *
     * @param sources
     */
    void updateSources(Department sources);

    /**
     * 通过id删除菜单
     *
     * @param id
     */
    void delByIdSources(Department id);
}
