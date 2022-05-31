package com.dfp.spring5;

import java.security.PublicKey;

public class User {
    private String uname;
    private String No;

    public String getNo() {
        return No;
    }

    public void setNo(String no) {
        No = no;
    }

    public void add(){
        System.out.println("add");
    }

    public String getUname() {
        return uname;
    }
    public void setUname(String uname) {
        this.uname=uname;
    }

    public void setNo(Object no) {
    }
}
