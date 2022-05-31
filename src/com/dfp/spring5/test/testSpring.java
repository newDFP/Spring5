package com.dfp.spring5.test;


import com.dfp.spring5.Order;
import com.dfp.spring5.User;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class testSpring {
    @Test
    public void soutAdd(){
        ApplicationContext context
                = new ClassPathXmlApplicationContext("bean1.xml");
        User user = context.getBean("user", User.class);
        user.add();
        System.out.println(user.getUname());
        System.out.println(user.getNo());

    }
    @Test
    public void OrderAdd(){
        ApplicationContext context
                = new ClassPathXmlApplicationContext("bean1.xml");
        Order order = context.getBean("order", Order.class);
        System.out.println(order.getNo());
        System.out.println(order.getPhone());

    }
}
