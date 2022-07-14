package com.servlets;

import com.models.Employee_Reimbursements;
import com.persistence.EmployeeReimbursementsDAO;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class TicketApprovedServlet extends HttpServlet {

    EmployeeReimbursementsDAO employeeReimbursementsDAO = new EmployeeReimbursementsDAO();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doPost(req, resp);
        Integer id = Integer.valueOf(req.getParameter("id-input"));
        String status = String.valueOf(req.getParameter("status"));

        Employee_Reimbursements employee_reimbursements = new Employee_Reimbursements(id, status);
        employeeReimbursementsDAO.update(employee_reimbursements);
        if (status.equals("Approve")){
            req.getRequestDispatcher("ticketApproved.html").forward(req,resp);
        } else {
            req.getRequestDispatcher("ticketDenied.html").forward(req,resp);
        }



    }
}
