package com.besokuse.proj.service.impl;

import com.besokuse.proj.dao.DepartmentMapper;
import com.besokuse.proj.pojo.Department;
import com.besokuse.proj.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author: besokuse
 * @since: 2020/9/27 11:53
 */
@Transactional
@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    private DepartmentMapper departmentMapper;


    @Override
    public Department findRootSources() {
        return departmentMapper.findRootSources();
    }

    @Override
    public Department findRootSourcesWithChildren(Department root) {
        // 获取子元素
        List<Department> childrenSources = departmentMapper.getChildrenSources(root.getId());
        if (childrenSources != null && childrenSources.size() > 0) {
            root.setChildren(childrenSources);
            for (Department s : childrenSources) {
                findRootSourcesWithChildren(s);
            }
        }
        return root;
    }

    @Override
    public void addSources(Department sources) {
        departmentMapper.addSources(sources);
    }

    @Override
    public void updateSources(Department sources) {
        departmentMapper.updateSources(sources);
    }

    @Override
    public void delByIdSources(Department id) {
        departmentMapper.delByIdSources(id);
    }
}
