package com.persistence;

import com.models.Employee_Info;
import com.utils.CustomCRUDInterface;

public class EmployeeInfoDAO implements CustomCRUDInterface<Employee_Info> {
    @Override
    public Integer create(Employee_Info employee_info) {
        return null;
    }

    @Override
    public Employee_Info read(Integer id) {
        return null;
    }

    @Override
    public Employee_Info update(Employee_Info employee_info) {
        return null;
    }

    @Override
    public boolean delete(Integer id) {
        return false;
    }
}
