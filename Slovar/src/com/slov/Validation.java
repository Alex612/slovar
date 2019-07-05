package com.slov;
public class Validation implements Validating{ 
	Validation(){}
	
	public String addValidInteger(String key){ 
		if(key.matches("[a-zA-Z]+")){
			if (key.length()==4){
			return "0";
			}
			else return "Error, length must be 4 characters";
		}
		if(key.matches("[0-9]+")){
			if (key.length()==5){
			return "1";
			}
			else return "Error, length must be 5 characters";
		}
		else return "Error, the key does not match any of the dictionaries.";
		
	}
}