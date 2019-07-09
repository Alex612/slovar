package com.slov;
import java.util.Scanner;
import java.util.Map;

public class Combination implements Combined{ 
	private FileProcessing fp;
	private static Scanner sc = new Scanner(System.in);
	private Validating val1 = new PlainValidation();
	private Validating val2 = new NumericValidation();
	
	
	Combination(FileProcessing fp)
	{
		this.fp=fp;
	}
	
	public Map<String,String> getString(String con){ 
		if(Integer.parseInt(con)==1){
		return fp.getMapString();}
		else
		{return fp.getMapNumber();}
	}
	
	public String listOfDictionaries(String key,String con){
		if (Integer.parseInt(con)==1){
			return val1.validateKey(key);
		}
		if (Integer.parseInt(con)==2){
			return val2.validateKey(key);
		}
		return Const.ERROR;
	}
	
	public String removeKey(String key,String con){
	try{
		if (listOfDictionaries(key,con).equals(key)){
			return fp.removeKey(key);
		}	
		return listOfDictionaries(key,con);
	}catch(Exception e){ return Const.ERROR;}
	}
	
	
	
	public String addKey(String key,String value,String con){  
	try{
		if (listOfDictionaries(key,con).equals(key)){
			return  fp.addKey(key,value);
		}	
		return listOfDictionaries(key,con);
	}catch(Exception e){ return Const.ERROR;}
	}
	
	
	
	public String getKey(String key,String con){ 
	try{
		if (listOfDictionaries(key,con).equals(key)){
			return  fp.getKey(key);
		}	
		return listOfDictionaries(key,con);
		
	}catch(Exception e){ return Const.ERROR;}
	}
	
	public String iString(){ 
		String s = sc.next();
		return  s;
	}
}