import java.util.Scanner;
import java.util.Map;

public class Union implements IUnion{ //класс , отвечающий за объединение
	private IFileProcessing fp;
	private static Scanner sc = new Scanner(System.in);
	private IValid val = new Valid();
	
	
	Union(IFileProcessing fp)
	{
		this.fp=fp;
	}
	
	public Map<String,String> getMap(){  //вывод пар
		return fp.getMap();
	}
	
	public String removeKey(String key){ //удаление ключа
		return fp.removeKey(key);
	}
	
	public String addKey(String key,String value){  //ввод ключа
	try{
		if(val.addValidInteger(key).equals("0")){
		return  fp.addKey(key,value)+" Plain string";
		}	
		if(val.addValidInteger(key).equals("1")){
		return  fp.addKey(key,value)+" Numeric string";
		}	
		return "String does not fit";
	}catch(Exception e){ return "error";}
	}
	
	public String getKey(String key){  //поиск по ключу
			return fp.getKey(key);
	}
	
	public String iString(){ //ввод значения
		String s = sc.next();
		return  s;

	}
}