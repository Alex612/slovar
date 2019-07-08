package com.slov;
public class Validation implements Validating{ 
	Validation(){}
	
	public String addValidString(String key){ 
		if(key.matches("[a-zA-Z]+")){
			return "0";
		}
		else return "Error";
	}	
	
	public String addValidInteger(String key){
	if(key.matches("[0-9]+")){
			return "1";
		}
		else return "Error";
	}	
	
	 public boolean addValidKey(String key,int dl){
        if (key.length() == dl){
			return true;
	 }
	 return false;
	 }
}
