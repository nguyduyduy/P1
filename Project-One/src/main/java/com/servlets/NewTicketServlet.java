package com.servlets;

import com.models.Employee_Reimbursements;
import com.persistence.EmployeeReimbursementsDAO;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class NewTicketServlet extends HttpServlet {

    EmployeeReimbursementsDAO newTicket = new EmployeeReimbursementsDAO();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doGet(req, resp);
        req.getRequestDispatcher("newTicket.html").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doPost(req, resp);
        Double reimburse_amount = Double.valueOf(req.getParameter("ticket-amount"));
        String description = String.valueOf(req.getParameter("ticket-description"));

        Employee_Reimbursements ticket = new Employee_Reimbursements(reimburse_amount, description);
        newTicket.create(ticket);
        System.out.println(ticket.getReimburse_amount());
        System.out.println(ticket.getDescription());
        req.getRequestDispatcher("ticketSuccess.html").forward(req, resp);


    }
}
