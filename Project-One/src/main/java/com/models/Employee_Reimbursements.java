package com.models;

import java.sql.Date;
import java.sql.Timestamp;

public class Employee_Reimbursements {

    private Integer reimburse_id;

    private Double reimburse_amount;

    private Date submission_date;

    private Timestamp submission_time;

    public Employee_Reimbursements() {
    }

    public Employee_Reimbursements(Integer reimburse_id, Double reimburse_amount, Date submission_date, Timestamp submission_time) {
        this.reimburse_id = reimburse_id;
        this.reimburse_amount = reimburse_amount;
        this.submission_date = submission_date;
        this.submission_time = submission_time;
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

    public Date getSubmission_date() {
        return submission_date;
    }

    public void setSubmission_date(Date submission_date) {
        this.submission_date = submission_date;
    }

    public Timestamp getSubmission_time() {
        return submission_time;
    }

    public void setSubmission_time(Timestamp submission_time) {
        this.submission_time = submission_time;
    }
}
