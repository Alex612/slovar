  package com.slov;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.io.BufferedWriter;
import java.util.ArrayList;
import java.util.List;

public class ProcessedFiles implements FileProcessing{  
	private BufferedReader BufR;
	private BufferedWriter BufW;
	private Map<String,String> map = new HashMap<String,String>();
	private List<String> list = new ArrayList<>();
	private String fileName="perv.txt";
	private String directory = "resourses";	
	
	public void getFileNumber(){
		try{
		FileInputStream str = new FileInputStream(directory+"//"+fileName);
		BufR = new BufferedReader(new InputStreamReader(str));
		String strL;
		map.clear();
		while ((strL = BufR.readLine()) != null){
			String[] count = strL.split(" ");
			if (count.length==2){
				if(count[0].length()==5){
				map.put(count[0], count[1]);}
			}	    
			}	
		}catch(Exception e){}	
	}
	
	public void getFileString(){
		try{
		FileInputStream str = new FileInputStream(directory+"//"+fileName);
		BufR = new BufferedReader(new InputStreamReader(str));
		String strL;
		map.clear();
		while ((strL = BufR.readLine()) != null){
			String[] count = strL.split(" ");
			if (count.length==2){
				if(count[0].length()==4){
				map.put(count[0], count[1]);}
			}	    
			}	
		}catch(Exception e){}	
	}
	
	public Map<String,String> getMapString(){
	getFileString();	
	return map;}
	
	public Map<String,String> getMapNumber(){
	getFileNumber();	
	return map;}
	
	public void searchKey(String key){  
		try{
		FileInputStream str = new FileInputStream(directory+"//"+fileName);
		BufR = new BufferedReader(new InputStreamReader(str));
		String strL;
		while ((strL = BufR.readLine()) != null){
			String[] count = strL.split(" ");
			String line;
			if (count.length==2){
				String st=count[0];
				if (!st.equals(key)){
				line=count[0]+" "+ count[1];
				list.add(line);	
				}}}	
	    }catch(Exception e){}
	
	}
	
	public String removeKey (String key){
		try{
			FileInputStream str = new FileInputStream(directory+"//"+fileName);
		    BufR = new BufferedReader(new InputStreamReader(str));
		    String strL;
		    while ((strL = BufR.readLine()) != null){ 
			String[] count = strL.split(" ");
			if (count.length==2){
				String st=count[0];
				if (st.equals(key)){  
				BufferedWriter BufW  = new BufferedWriter(new FileWriter(directory+"//"+fileName, true));
					searchKey(key);
					new FileWriter(fileName).close();
					for (String lists : list) {
						if (lists != null) {
						BufW.write(lists+"\n");}}
						list.removeAll(list);
						BufW.flush();			
			            BufW.close();
				        return "Delete";}}}	
			return "No Kay";
			}catch(Exception e){return "Error";}		
	}
	
	
	public String addKey(String key, String value){
		try {
			FileInputStream str = new FileInputStream(directory+"//"+fileName);
		    BufR = new BufferedReader(new InputStreamReader(str));
		    String strL;
		    while ((strL = BufR.readLine()) != null){ 
			String[] count = strL.split(" ");
			if (count.length==2){
				String st=count[0];
				if (st.equals(key)){
				return "Key already exists";	
			}}}	
			BufferedWriter BufW  = new BufferedWriter(new FileWriter(directory+"//"+fileName, true));
			BufW.write(key+" "+value+"\n");		
            BufW.flush();			
			BufW.close();
			return "Entry added";	
				} catch (Exception e){return "Error";}
				
	}	
	
	
	public String getKey(String key){
		try{
		FileInputStream str = new FileInputStream(directory+"//"+fileName);
		BufR = new BufferedReader(new InputStreamReader(str));
		String strL;
		while ((strL = BufR.readLine()) != null){
			String[] count = strL.split(" ");
			if (count.length==2){
				String st=count[0];
				if (st.equals(key)){
				return count[0] + " = " + count[1];}}		    
		}
        return "No Key and Value";			
	    }catch(Exception e){return "Error";}
	}
}