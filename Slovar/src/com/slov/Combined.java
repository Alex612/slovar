package com.slov;
import java.util.Map;

public interface Combined{
	
	public Map<String,String> getMap();
	
	public String removeKey(String key);
	
	public String addKey(String key,String value);
	
	public String getKey(String key);
	
	public String iString();
}