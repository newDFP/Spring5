package com.dfp.spring5.test;

import com.dfp.spring5.bean.Book;
import com.dfp.spring5.bean.Course;
import com.dfp.spring5.bean.Emp;
import com.dfp.spring5.bean.Stu;
import com.dfp.spring5.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class beanTest {
    @Test
    public void testBean1() {
        //1 加载spring配置文件
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean2.xml");
        //2 获取配置创建的对象
        UserService userService = context.getBean("userService", UserService.class);
        userService.add();
    }

    @Test
    public void testBean2() {
        //1 加载spring配置文件
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean3.xml");
        //2 获取配置创建的对象
        Emp emp = context.getBean("emp", Emp.class);
        emp.add();
    }

    @Test
    public void testBean3() {
        //1 加载spring配置文件
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean2.xml");
        //2 获取配置创建的对象
        Stu emp = context.getBean("stu", Stu.class);
        emp.test();
    }
    @Test
    public void testBeanBookList() {
        //1 加载spring配置文件
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean1.xml");
        //2 获取配置创建的对象
        Book book = context.getBean("book", Book.class);
        book.test();
    }
    @Test
    public void factoryBeanTest(){
        ApplicationContext context
                =new ClassPathXmlApplicationContext("mybean.xml");
        Course mybean = context.getBean("mybean", Course.class);
        System.out.println(mybean);
    }
    @Test
    public void moreBean() {
        //1 加载spring配置文件
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean1.xml");
        //2 获取配置创建的对象
        Book book = context.getBean("book", Book.class);
        book.test();
    }
}
