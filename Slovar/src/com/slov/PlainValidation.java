package com.slov;
public class PlainValidation implements Validating{ 
	PlainValidation(){}
	
	public String validateKey(String key){
		if(key.matches(Const.V_PL)){
		if(key.length() == Const.I_PL){
				 return key;
		}
		return Const.SIZE_PLAIN_ERROR;
		}
		return Const.INVALID_DICTIONARY_CHARACTERS;
	}
}
