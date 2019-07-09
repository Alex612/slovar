package com.slov;
public class PlainValidation implements Validating{ 
	PlainValidation(){}
	
	public String validateKey(String key){
		if(key.matches("[a-zA-Z]+")){
		if(key.length() == 4){
				 return key;
		}
		return "Invalid length";
		}
		return "Invalid characters";
	}
}
