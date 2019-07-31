package com;

import com.slov.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Biblioteka {
    public static void main(String args[]) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppContext.class);
        Menu menuS = ctx.getBean(Menu.class);
        menuS.outMenu();

    }
}