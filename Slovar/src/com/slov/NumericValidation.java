package com.slov;
public class NumericValidation implements Validating{ 
	NumericValidation(){}
	
	public String validateKey(String key){
		if(key.matches("[0-9]+")){
		if(key.length() == 5){
				 return key;
		}
		return "Invalid length";
		}
		return "Invalid characters";
	}
}