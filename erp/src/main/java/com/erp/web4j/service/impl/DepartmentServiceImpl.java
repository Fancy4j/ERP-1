package com.erp.web4j.service.impl;

import com.erp.web4j.bean.Department;
import com.erp.web4j.mapper.DepartmentMapper;
import com.erp.web4j.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by wawawa
 * Date 2019/4/5 Time 18:00
 */
@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    DepartmentMapper departmentMapper;

    @Override
    public Integer countOrderRecords() {
        return departmentMapper.countOrderRecords();
    }

    @Override
    public List<Department> listOrders() {
        return departmentMapper.listOrders();
    }

    @Override
    public boolean insert(Department department) {
        return departmentMapper.insert(department)==1;
    }
}
