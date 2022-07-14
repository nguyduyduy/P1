package com.persistence;

import com.models.Employee_Reimbursements;
import com.utils.ConnectionManager;
import com.utils.CustomCRUDInterface;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class EmployeeReimbursementsDAO implements CustomCRUDInterface<Employee_Reimbursements> {

    Connection connection;

    public EmployeeReimbursementsDAO(){

        connection = ConnectionManager.getConnection();
    }
    @Override
    public Integer create(Employee_Reimbursements employee_reimbursements) {

        try {

            String sql = "INSERT INTO employee_reimbursements (reimburse_id, reimburse_amount, description, status) VALUES (default, ?, ?, default)";
            PreparedStatement pstmt = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            pstmt.setDouble(1, employee_reimbursements.getReimburse_amount());
            pstmt.setString(2, employee_reimbursements.getDescription());
//            pstmt.setString(3, employee_reimbursements.getStatus());

            pstmt.executeUpdate();

            ResultSet rs = pstmt.getGeneratedKeys();

            rs.next();

            return rs.getInt(1);

        } catch (Exception e){
            System.out.println(e.getMessage());

        }
        return null;
    }



    @Override
    public Employee_Reimbursements read(Integer id) {

        try{
            String sql = "SELECT * FROM employee_info WHERE employee_id = ?";
            PreparedStatement pstmt = connection.prepareStatement(sql);

            pstmt.setInt(1, id);

            Employee_Reimbursements reimbursements = new Employee_Reimbursements();

            ResultSet rs = pstmt.executeQuery();

        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public Employee_Reimbursements update(Employee_Reimbursements employee_reimbursements) {

        try {

            String sql = "UPDATE employee_reimbursements SET status = ? WHERE reimburse_id = ?";
            PreparedStatement pstmt = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            pstmt.setString(1, employee_reimbursements.getStatus());
            pstmt.setInt(2, employee_reimbursements.getReimburse_id());

            pstmt.executeUpdate();

            ResultSet rs = pstmt.getGeneratedKeys();

            while (rs.next()){
                employee_reimbursements.setStatus("status");
            }

            return employee_reimbursements;

        } catch (Exception e){
            System.out.println(e.getMessage());
        }



        return null;
    }

    @Override
    public boolean delete(Integer id) {

        try {
            String sql = "DELETE FROM employee_reimbursements WHERE reimburse_id = ?";
            PreparedStatement pstmt = connection.prepareStatement(sql);

            pstmt.setInt(1, id);

            return pstmt.execute();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

}
