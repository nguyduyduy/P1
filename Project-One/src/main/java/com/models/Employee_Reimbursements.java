package com.models;

import java.sql.Date;
import java.sql.Timestamp;

public class Employee_Reimbursements {

    private Integer reimburse_id;

    private Double reimburse_amount;

    private String description;

    private String status;

    public Employee_Reimbursements() {
    }

    public Employee_Reimbursements(Integer reimburse_id, Double reimburse_amount, String description, String status) {
        this.reimburse_id = reimburse_id;
        this.reimburse_amount = reimburse_amount;
        this.description = description;
        this.status = status;
    }

    public Employee_Reimbursements(Integer reimburse_id, String status) {
        this.reimburse_id = reimburse_id;
        this.status = status;
    }

    public Employee_Reimbursements(Double reimburse_amount, String description) {
        this.reimburse_amount = reimburse_amount;
        this.description = description;
    }

    public Integer getReimburse_id() {
        return reimburse_id;
    }

    public void setReimburse_id(Integer reimburse_id) {
        this.reimburse_id = reimburse_id;
    }

    public Double getReimburse_amount() {
        return reimburse_amount;
    }

    public void setReimburse_amount(Double reimburse_amount) {
        this.reimburse_amount = reimburse_amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
