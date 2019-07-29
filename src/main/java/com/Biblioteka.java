package com;

import com.slov.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Biblioteka {
    public static void main(String args[]) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("logxml.xml");
        Menu menuS = ctx.getBean(Menu.class);
        menuS.outMenu();

    }
}