package com.slov;
import java.util.Map;

public interface FileProcessing{
	
	public String addKey(String key,String value);
	
	public String removeKey(String key);
	
	public String getKey(String key);
	
	public Map<String,String> getMapNumber();
	
	public Map<String,String> getMapString();
}