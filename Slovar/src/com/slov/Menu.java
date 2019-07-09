package com.slov;
import java.io.IOException;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.*;

public class Menu{ 
	private String MenC="";
	private String MenD="";
	private String key,value,con;
	private Combined un;
	private String c="";
	private boolean pr = true;

	
	
	
	public void printMenu(){
		System.out.println("1.Reading the dictionary List");
		System.out.println("2.Entry search by key");
        System.out.println("3.Delete entry by key");
	    System.out.println("4.Adding entry");
		System.out.println("5.Dictionary selection");
		System.out.println("Press F to display the Menu.");
		
	}
	
	public void pMenu(){
		System.out.println("1.Dictionary Plain1 list");
		System.out.println("2.Dictionary Numeric list");
	}
	
	Menu(Combined un){
		this.un = un;
	}
	
	public void outMenu(){
		
		
		while(true){
		pMenu();
		c="";
		MenD = un.iString(); 
		switch(MenD){
			case "1": c = "1"; pr = true; printMenu(); break;
			case "2": c = "2"; pr = true; printMenu(); break;
		}
		
		while(pr){
			
			
			MenC = un.iString(); 
			switch(MenC){
				case "1": System.out.println("Reading the dictionary List:"); 
				con=c;
				System.out.println(un.getString(con)+"\n\n"+"Press F to display the Menu.");
				break;
				case "2": System.out.println("Entry search by key:"); 
				key = un.iString();
				con=c;
				System.out.println(un.getKey(key,con)+"\n\n"+"Press F to display the Menu.");
				break;
				case "3": System.out.println("Delete entry by key:");  
				key = un.iString();
				con=c;
				System.out.println(un.removeKey(key,con)+"\n\n"+"Press F to display the Menu."); 
				break;
				case "4": System.out.println("Adding key:"); 
				key = un.iString();
				System.out.println("Adding value:");
				value = un.iString();
				con=c;
				System.out.println(un.addKey(key, value,con)+"\n\n"+"Press F to display the Menu.");
				break;
				case "5":pr = false; break;
				case "F":printMenu();
				break;
			}
		}
		}
	}
}