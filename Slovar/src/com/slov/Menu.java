package com.slov;
import java.io.IOException;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.*;

public class Menu{ 
	private String MenC="";
	private String key,value;
	private Combined un;

	
	
	
	public void printMenu(){
		System.out.println("1.Reading the dictionary list");
		System.out.println("2.Entry search by key");
        System.out.println("3.Delete entry by key");
	    System.out.println("4.Adding entry");
		System.out.println("Press F to display the Menu.");
		System.out.println("Add 2 any symbol to exit");
	}
	
	Menu(Combined un){
		this.un = un;
	}
	
	public void outMenu(){
		printMenu();
		
		while(MenC.length()!=2){
			
			MenC = un.iString(); 
			switch(MenC){
				case "1": System.out.println("Reading the dictionary list:"); 
				System.out.println(un.getMap()+"\n\n"+"Press F to display the Menu.");
				break;
				case "2": System.out.println("Entry search by key:"); 
				key = un.iString();
				System.out.println(un.getKey(key)+"\n\n"+"Press F to display the Menu.");
				break;
				case "3": System.out.println("Delete entry by key:");  
				key = un.iString();
				System.out.println(un.removeKey(key)+"\n\n"+"Press F to display the Menu."); 
				break;
				case "4": System.out.println("Adding key:"); 
				key = un.iString();
				System.out.println("Adding value:");
				value = un.iString();
				System.out.println(un.addKey(key, value)+"\n\n"+"Press F to display the Menu.");
				break;
				case "F":printMenu();
				break;
			}
		}
	}
}