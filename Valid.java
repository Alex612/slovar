public class Valid implements IValid{ //класс , отвечающий за валидацию
	Valid(){}
	
	public String addValidValue(String value){ //Проверка значения
		if(value.matches("[a-zA-Z]+"||value.matches("[а-яА-Я]+")){
			if (value.length()==4){
			return value;
			}
			else return "Ошибка, длина должна быть 4 символа";
		}
		else return "Ошибка, можно использовать только только буквы латинской раскладки";
	}
	
	public String addValidKey(String key){ //Проверка ключа
		if(key.matches("[0-9]+")){
			if (key.length()==5){
			return key;
			}
			else return "Ошибка, длина должна быть 5 символов";
		}
		else return "Ошибка, можно использовать только цифры";
	}
}