package com.servlets;

import com.persistence.EmployeeInfoDAO;
import com.utils.CurrentUser;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginSuccessServlet extends HttpServlet {

    EmployeeInfoDAO employeeInfoDAO = new EmployeeInfoDAO();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doGet(req, resp);
        String email = String.valueOf(req.getParameter("email-sign-in"));
        String password = String.valueOf(req.getParameter("password-sign-in"));

        CurrentUser.currentUser = employeeInfoDAO.loginUser(email, password);

//        if (CurrentUser.currentUser == null){
            req.getRequestDispatcher("loginSuccess.html").forward(req,resp);
//        } else {
//            req.getRequestDispatcher("error.html").forward(req, resp);
//        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       //super.doPost(req, resp);
    }
}
