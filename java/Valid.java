public class Valid implements IValid{ //класс , отвечающий за валидацию
	Valid(){}
	
	public String addValidInteger(String key){ //Проверка ключа
		if(key.matches("[a-zA-Z]+")){
			if (key.length()==4){
			return "0";
			}
			else return "Ошибка, длина должна быть 4 символа";
		}
		if(key.matches("[0-9]+")){
			if (key.length()==5){
			return "1";
			}
			else return "Ошибка, длина должна быть 5 символов";
		}
		else return "Ошибка, ключ не подходит ни к одному из словарей";
		
	}
}