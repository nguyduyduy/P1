package com.models;

public class Account_Type {

    private Integer acc_id;

    private String type;

    public Account_Type() {
    }

    public Account_Type(Integer acc_id, String type) {
        this.acc_id = acc_id;
        this.type = type;
    }

    public Account_Type(String type) {
        this.type = type;
    }

    public Integer getAcc_id() {
        return acc_id;
    }

    public void setAcc_id(Integer acc_id) {
        this.acc_id = acc_id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
