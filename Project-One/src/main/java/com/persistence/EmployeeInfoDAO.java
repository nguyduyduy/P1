package com.persistence;

import com.models.Account_Type;
import com.models.Employee_Info;
import com.utils.ConnectionManager;
import com.utils.CustomCRUDInterface;

import javax.xml.transform.Result;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.concurrent.ExecutionException;

public class EmployeeInfoDAO implements CustomCRUDInterface<Employee_Info> {

    Connection connection;

    public EmployeeInfoDAO(){

        connection = ConnectionManager.getConnection();

    }
    @Override
    public Integer create(Employee_Info employee_info) {

        try {

            String sql = "INSERT INTO employee_info (employee_id, employee_first_name, employee_last_name, phone_number, email, user_password) VALUES (default, ?, ?, ?, ?, ?)";
            PreparedStatement pstmt = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            pstmt.setString(1, employee_info.getEmployee_first_name());
            pstmt.setString(2, employee_info.getEmployee_last_name());
            pstmt.setLong(3, employee_info.getPhone_number());
            pstmt.setString(4, employee_info.getEmail());
            pstmt.setString(5, employee_info.getUser_password());

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
    public Employee_Info read(Integer id) {

        try {
            String sql = "SELECT * FROM employee_info WHERE employee_id = ?";

            PreparedStatement pstmt = connection.prepareStatement(sql);

            pstmt.setInt(1, id);

            Employee_Info employeeInfo = new Employee_Info();

            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                employeeInfo.setEmployee_id(rs.getInt("employee_id"));
                employeeInfo.setEmployee_first_name(rs.getString("employee_first_name"));
                employeeInfo.setEmployee_last_name(rs.getString("employee_last_name"));
                employeeInfo.setPhone_number(rs.getLong("phone_number"));
                employeeInfo.setEmail(rs.getString("email"));
                employeeInfo.setUser_password(rs.getString("user_password"));
            }

        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        return null;
    }

    @Override
    public Employee_Info update(Employee_Info employee_info) {

        try {
            String sql = "UPDATE employee_info SET employee_first_name = ?, employee_last_name = ?, phone_number = ?, email = ?, user_password = ? WHERE acc_id = ?";
            PreparedStatement pstmt = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            pstmt.setInt(1, );

            pstmt.setInt(1, account_type.getAcc_id());
            pstmt.setString(1, account_type.getType());

            pstmt.executeUpdate();

            ResultSet rs = pstmt.getGeneratedKeys();

            while (rs.next()){

                account_type.setType(rs.getString("type"));

            }

        } catch (Exception e){
            System.out.println(e.getMessage());
        }


        return null;
    }

    @Override
    public boolean delete(Integer id) {
        return false;
    }
}
