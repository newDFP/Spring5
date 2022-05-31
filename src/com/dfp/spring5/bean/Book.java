package com.dfp.spring5.bean;

import java.util.List;

public class Book {
    private  List<String > bName;

    public List<String> getbName() {
        return bName;
    }
    public void setbName(List<String> bName) {
        this.bName = bName;
    }
    public void test(){
        System.out.println(bName);
    }
}
