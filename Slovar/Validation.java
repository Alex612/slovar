package com.slov;
public class Validation implements Validating{ 
	Validation(){}
	
	public boolean addValidString(String key){
		  if (key.matches("[a-zA-Z]+")){
			return true;
	}
	return false;
	}
	
	public boolean addValidInteger(String key){
	if(key.matches("[0-9]+")){
			return true;
		}
		else return false;
	}	
	
	public boolean addValidKey(String key,int dl){
        if (key.length() == dl){
			return true;
	}
	return false;
	}
}
