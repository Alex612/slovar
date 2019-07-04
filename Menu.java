import java.io.IOException;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.*;

public class Menu{ //класс, отвечающий за пользовательский интерфейс
	private String MenC="";
	private String key,value;
	private IOb ob;
	
	
	
	public void PrintMenu(){
		System.out.println("1.Reading the dictionary list");//Чтение списка пар
		System.out.println("2.Entry search by key");//Поиск записи по ключу
        System.out.println("3.Delete entry by key");//Удаление записи по ключу
	    System.out.println("4.Adding entry");//Добавление записи
		System.out.println("Press F to display the Menu.");//Вызов меню
		System.out.println("Add 2 any symbol to exit");//Ввод 2 любых символов для выхода
	}
	
	Menu(IOb ob){
		this.ob = ob;
	}
	
	public void OutMenu(){
		PrintMenu();
		
		while(MenC.length()!=2){
			
			MenC = ob.iString(); 
			switch(MenC){
				case "1": System.out.println("Reading the dictionary list:");  //Чтение списка пар
				System.out.println(ob.getMap()+"\n\n"+"Press F to display the Menu.");
				break;
				case "2": System.out.println("Entry search by key:"); //Поиск записи по ключу
				key = ob.iString();
				System.out.println("Your key and value"); 
				System.out.println(ob.getKey(key)+"\n\n"+"Press F to display the Menu.");
				break;
				case "3": System.out.println("Delete entry by key:");  //Удаление записи по ключу
				key = ob.iString();
				System.out.println(ob.removeKey(key)+"\n\n"+"Press F to display the Menu."); 
				break;
				case "4": System.out.println("Adding key:"); //Добавление записи
				key = ob.iString();
				System.out.println("Adding value:");
				value = ob.iString();
				System.out.println(ob.addKey(key, value)+"\n\n"+"Press F to display the Menu.");
				break;
				case "F":PrintMenu();//Вызов меню
				break;
			}
		}
	}
}