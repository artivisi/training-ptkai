package belajar.aop;

import belajar.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAop {
    public static void main(String[] xx){
        ApplicationContext aplikasiSpring 
                = new ClassPathXmlApplicationContext("classpath:spring-aop.xml");

        Customer c = new Customer();
        CustomerDao cd = (CustomerDao)aplikasiSpring.getBean("customerDao");

        cd.simpan(c);
    }
}
