package com.servlets;

import com.persistence.EmployeeInfoDAO;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class EmployeeLoginServlet extends HttpServlet {

    EmployeeInfoDAO employeeInfoDAO = new EmployeeInfoDAO();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doGet(req, resp);
        System.out.println(resp.getStatus());
        req.getRequestDispatcher("employeeLogin.html").forward(req,resp);


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doPost(req, resp);
    }


}

