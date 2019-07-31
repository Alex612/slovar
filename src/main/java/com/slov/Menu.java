package com.slov;

import java.util.Scanner;


public class Menu {
    private String menuC = "";
    private String menuD = "";
    private String key, value;
    private Integer type;
    private Combined un;
    private boolean pr = true;
    private static Scanner sc = new Scanner(System.in);


    public String iString() {
        String s = sc.next();
        return s;
    }

    public Menu(Combined un) {
        this.un = un;
    }


    public void printMenu() {
        System.out.println("1.Reading the dictionary List");
        System.out.println("2.Entry search by key");
        System.out.println("3.Delete entry by key");
        System.out.println("4.Adding entry");
        System.out.println("5.Dictionary selection");
        System.out.println("Press F to display the Menu.");

    }

    public void pMenu() {
        System.out.println("1.Dictionary Plain list");
        System.out.println("2.Dictionary Numeric list");
    }

    public void outMenu() {
        while (true) {
            pMenu();
            menuD = iString();
            switch (menuD) {
                case "1":
                    type=0;
                    pr = true;
                    printMenu();
                    break;
                case "2":
                    type=1;
                    pr = true;
                    printMenu();
                    break;
            }
            while (pr) {
                menuC = iString();
                switch (menuC) {
                    case "1":
                        System.out.println("Reading the dictionary List:");
                        System.out.println(un.getString(type) + "\n\n" + "Press F to display the Menu.");
                        break;
                    case "2":
                        System.out.println("Entry search by key:");
                        key = iString();
                        System.out.println(un.getKey(key, type) + "\n\n" + "Press F to display the Menu.");
                        break;
                    case "3":
                        System.out.println("Delete entry by key:");
                        key = iString();
                        System.out.println(un.removeKey(key, type) + "\n\n" + "Press F to display the Menu.");
                        break;
                    case "4":
                        System.out.println("Adding key:");
                        key = iString();
                        System.out.println("Adding value:");
                        value = iString();
                        System.out.println(un.addKey(key, value, type) + "\n\n" + "Press F to display the Menu.");
                        break;
                    case "5":
                        pr = false;
                        break;
                    case "F":
                        printMenu();
                        break;
                }
            }
        }
    }
}