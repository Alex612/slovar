import java.util.Scanner;
import java.util.Map;

public class Ob implements IOb{ //класс , отвечающий за объединение
	private ISl sl;
	private static Scanner sc = new Scanner(System.in);
	
	
	Ob(ISl sl)
	{
		this.sl=sl;
	}
	
	public Map<String,String> getMap(){  //вывод пар
		return sl.getMap();
	}
	
	public String removeKey(String key){ //удаление ключа
		return sl.removeKey(key);
	}
	
	public String addKey(String key,String value){  //ввод ключа
		return  sl.addKey(key,value);
	}
	
	public String getKey(String key){  //поиск по ключу
			return sl.getKey(key);
	}
	
	public String iString(){ //ввод значения
		String s = sc.next();
		return  s;

	}
}