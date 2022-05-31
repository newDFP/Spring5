package com.dfp.spring5;

public class Order {
    private String No;
    private String Phone;
    public Order(String no, String phone) {
        No = no;
        Phone = phone;
    }
    public String getNo() {return No;
    }
    public void setNo(String no) {No = no;}

    public String getPhone() {return Phone;}

    public void setPhone(String phone) { Phone = phone;}

}
