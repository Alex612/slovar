package com.slov;
import java.util.Map;

public interface Combined{
	
	public String listOfDictionaries(String key,String con);
	
	public Map<String,String> getString(String con);
	
	public String removeKey(String key,String con);
	
	public String addKey(String key,String value,String con);
	
	public String getKey(String key,String con);
	
	public String iString();
}