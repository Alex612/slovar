import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.io.BufferedWriter;
import java.util.ArrayList;
import java.util.List;

public class FileProcessing implements IFileProcessing{  //класс, отвечающий за работу с файлами
	private BufferedReader BufR;
	private BufferedWriter BufW;
	private Map<String,String> map = new HashMap<String,String>();
	private List<String> list = new ArrayList<>();
	private String fileName="perv.txt";
	
	//запись в map 
	public void getFile(){
		try{
		FileInputStream str = new FileInputStream(fileName);
		BufR = new BufferedReader(new InputStreamReader(str));
		String strL;
		while ((strL = BufR.readLine()) != null){
			String[] count = strL.split(" ");
			if (count.length==2){
			map.put(count[0], count[1]);
			}	    
			}	
		}catch(Exception e){}	
	}
	
	//вывод всех пар 
	public Map<String,String> getMap(){
	getFile();	
	return map;}
	
	//запись без удаленного ключа в лист
	public void searchKey(String key){  
		try{
		FileInputStream str = new FileInputStream(fileName);
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
	
	//поиск ключа для удаления
	public String removeKey (String key){
		try{
			FileInputStream str = new FileInputStream(fileName);
		    BufR = new BufferedReader(new InputStreamReader(str));
		    String strL;
		    while ((strL = BufR.readLine()) != null){ //проверяем есть ли такой ключ
			String[] count = strL.split(" ");
			if (count.length==2){
				String st=count[0];
				if (st.equals(key)){  //если такой ключ есть - удаляем запись
				BufferedWriter BufW  = new BufferedWriter(new FileWriter(fileName, true));
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
	
	
	//добавление записи по ключу
	public String addKey(String key, String value){
		try {
			FileInputStream str = new FileInputStream(fileName);
		    BufR = new BufferedReader(new InputStreamReader(str));
		    String strL;
		    while ((strL = BufR.readLine()) != null){ //проверяем есть ли такой ключ
			String[] count = strL.split(" ");
			if (count.length==2){
				String st=count[0];
				if (st.equals(key)){
				return "Key already exists";	
			}}}	
			BufferedWriter BufW  = new BufferedWriter(new FileWriter(fileName, true));//добавляем запись в конец файла
			BufW.write(key+" "+value+"\n");		
            BufW.flush();			
			BufW.close();
			//String t= key+" "+value+"\n";
			//Files.write(Paths.get("tbib.txt"), t.getBytes(), StandardOpenOption.APPEND);
			return "Entry added";	
				} catch (Exception e){return "Error";}
				
	}	
	
	
	//чтение записи по ключу
	public String getKey(String key){
		try{
		FileInputStream str = new FileInputStream(fileName);
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