package com.models;

import com.persistence.EmployeeInfoDAO;

public class Employee_Info {

    private Integer employee_id;

    private String employee_first_name;

    private String employee_last_name;

    private String phone_number;

    private String email;

    private String user_password;

    public Employee_Info() {
    }

    public Employee_Info(Integer employee_id, String employee_first_name, String employee_last_name, String phone_number, String email, String user_password) {
        this.employee_id = employee_id;
        this.employee_first_name = employee_first_name;
        this.employee_last_name = employee_last_name;
        this.phone_number = phone_number;
        this.email = email;
        this.user_password = user_password;
    }

    public Employee_Info(String employee_first_name, String employee_last_name, String phone_number, String email, String user_password) {
        this.employee_first_name = employee_first_name;
        this.employee_last_name = employee_last_name;
        this.phone_number = phone_number;
        this.email = email;
        this.user_password = user_password;
    }

    public Integer getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(Integer employee_id) {
        this.employee_id = employee_id;
    }

    public String getEmployee_first_name() {
        return employee_first_name;
    }

    public void setEmployee_first_name(String employee_first_name) {
        this.employee_first_name = employee_first_name;
    }

    public String getEmployee_last_name() {
        return employee_last_name;
    }

    public void setEmployee_last_name(String employee_last_name) {
        this.employee_last_name = employee_last_name;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }
}
