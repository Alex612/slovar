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
	
	public Map<String,String> getString(String con){ 
		if("1".equals(con)){
		return fp.getMapString();}
		else
		{return fp.getMapNumber();}
	}
	
	
	public String removeKey(String key,String con){
	try{
		if("1".equals(con)){
			if("0".equals(val.addValidString(key))){
				if(val.addValidKey(key,4)){
				return fp.removeKey(key);}
			}
		}
		if("2".equals(con)){
			if("1".equals(val.addValidInteger(key))){
				if(val.addValidKey(key,5)){
				return  fp.removeKey(key);}
			}
		}	
		return "No Key";
	}catch(Exception e){ return "error";}
	}
	
	
	
	public String addKey(String key,String value,String con){  
	try{
		if("1".equals(con)){
			if("0".equals(val.addValidString(key))){
				if(val.addValidKey(key,4)){
				return  fp.addKey(key,value);}
			}
		}
		if("2".equals(con)){
			if("1".equals(val.addValidInteger(key))){
				if(val.addValidKey(key,5)){
				return  fp.addKey(key,value);}
			}
		}	
		return "No Key";
	}catch(Exception e){ return "error";}
	}
	
	
	
	public String getKey(String key,String con){ 
	try{
		if("1".equals(con)){
			if("0".equals(val.addValidString(key))){
				if(val.addValidKey(key,4)){
				return  fp.getKey(key);}
			}
		}
		if("2".equals(con)){
			if("1".equals(val.addValidInteger(key))){
				if(val.addValidKey(key,5)){
				return  fp.getKey(key);}
			}
		}	
		return "No Key";
	}catch(Exception e){ return "error";}
	}
	
	public String iString(){ 
		String s = sc.next();
		return  s;
	}
}