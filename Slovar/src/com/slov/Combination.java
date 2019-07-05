package com.slov;
import java.util.Scanner;
import java.util.Map;

public class Combination implements Combined{ 
	private FileProcessing fp;
	private static Scanner sc = new Scanner(System.in);
	private Validating val = new Validation();
	
	
	Combination(FileProcessing fp)
	{
		this.fp=fp;
	}
	
	public Map<String,String> getMapString(){ 
		return fp.getMapString();
	}
	
	public Map<String,String> getMapNumber(){ 
		return fp.getMapNumber();
	}
	
	public String removeKey(String key){
	try{
		if("0".equals(val.addValidInteger(key))){
		return  fp.removeKey(key)+" (Plain string)";
		}	
		if("1".equals(val.addValidInteger(key))){
		return  fp.removeKey(key)+" (Numeric string)";
		}	
		return val.addValidInteger(key);
	}catch(Exception e){ return "error";}
	}
	
	public String addKey(String key,String value){  
	try{
		if("0".equals(val.addValidInteger(key))){
		return  fp.addKey(key,value)+" (Plain string)";
		}	
		if("1".equals(val.addValidInteger(key))){
		return  fp.addKey(key,value)+" (Numeric string)";
		}	
		return val.addValidInteger(key);
	}catch(Exception e){ return "error";}
	}
	
	public String getKey(String key){ 
	try{
		if("0".equals(val.addValidInteger(key))){
		return  fp.getKey(key)+" (Plain string)";
		}	
		if("1".equals(val.addValidInteger(key))){
		return  fp.getKey(key)+" (Numeric string)";
		}	
		return val.addValidInteger(key);
	}catch(Exception e){ return "error";}
	}
	
	public String iString(){ 
		String s = sc.next();
		return  s;
	}
}