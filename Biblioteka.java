import java.util.*;
import java.io.*;

class Biblioteka{
	public static void main(String args[]){
		ISl sl = new Sl();
		IOb ob = new Ob(sl);
		Menu menu = new Menu(ob);
		menu.OutMenu();
	}
}