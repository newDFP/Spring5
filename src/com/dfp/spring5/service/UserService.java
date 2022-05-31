package com.dfp.spring5.service;

import com.dfp.spring5.dao.UserDao;
import com.dfp.spring5.dao.UserDaoImpl;
public class UserService {
    private UserDao dao;
    public void add(){
        System.out.println("service add.......");
        dao.updata();
        //原始注入对象方法
        //UserDao dao=new UserDaoImpl();
        //dao.updata();
    }
    public void setUserDao(UserDao dao) {
        this.dao = dao;
    }
}
