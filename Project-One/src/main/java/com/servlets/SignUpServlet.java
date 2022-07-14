package com.servlets;

import com.models.Employee_Info;
import com.persistence.EmployeeInfoDAO;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SignUpServlet extends HttpServlet {

    EmployeeInfoDAO employeeInfoDAO = new EmployeeInfoDAO();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doGet(req, resp);
        req.getRequestDispatcher("signUp.html").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doPost(req, resp);
        String firstName = String.valueOf(req.getParameter("sign-up-input"));
        String lastName = String.valueOf(req.getParameter("lastName-input"));
        String phone = String.valueOf(req.getParameter("phone"));
        String email = String.valueOf(req.getParameter("email-input"));
        String password = String.valueOf(req.getParameter("password-input"));

        Employee_Info employee = new Employee_Info(firstName, lastName, phone, email, password);
        employeeInfoDAO.create(employee);
        req.getRequestDispatcher("index.html").forward(req,resp);

    }
}
