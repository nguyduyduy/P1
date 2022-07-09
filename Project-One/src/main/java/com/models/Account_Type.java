package com.models;

public class Account_Type {

    private Integer acc_id_serial;

    private String type;

    public Account_Type() {
    }

    public Account_Type(Integer acc_id_serial, String type) {
        this.acc_id_serial = acc_id_serial;
        this.type = type;
    }

    public Integer getAcc_id_serial() {
        return acc_id_serial;
    }

    public void setAcc_id_serial(Integer acc_id_serial) {
        this.acc_id_serial = acc_id_serial;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
