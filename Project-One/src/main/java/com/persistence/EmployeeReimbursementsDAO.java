package com.persistence;

import com.models.Employee_Reimbursements;
import com.utils.ConnectionManager;
import com.utils.CustomCRUDInterface;

import java.sql.Connection;

public class EmployeeReimbursementsDAO implements CustomCRUDInterface<Employee_Reimbursements> {

    Connection connection;

    public EmployeeReimbursementsDAO(){

        connection = ConnectionManager.getConnection();
    }
    @Override
    public Integer create(Employee_Reimbursements employee_reimbursements) {
        return null;
    }

    @Override
    public Employee_Reimbursements read(Integer id) {
        return null;
    }

    @Override
    public Employee_Reimbursements update(Employee_Reimbursements employee_reimbursements) {
        return null;
    }

    @Override
    public boolean delete(Integer id) {
        return false;
    }
}
