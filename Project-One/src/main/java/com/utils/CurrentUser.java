package com.utils;

public class CurrentUser {

    public static CurrentUser currentUser;

    public static Integer employee_id;

    public static String employee_first_name;

    public static String employee_last_name;

    public static String phone_number;

    public static String email;

    public static String user_password;

    public CurrentUser(Integer employee_id, String employee_first_name, String employee_last_name, String phone_number, String email, String user_password){

        CurrentUser.employee_id = employee_id;
        CurrentUser.employee_first_name = employee_first_name;
        CurrentUser.employee_last_name = employee_last_name;
        CurrentUser.phone_number = phone_number;
        CurrentUser.email = email;
        CurrentUser.user_password = user_password;

    }
}
