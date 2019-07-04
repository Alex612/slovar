import java.util.*;
import java.io.*;

class Biblioteka{
	public static void main(String args[]){
		IFileProcessing fp = new FileProcessing();
		IUnion un = new Union(fp);
		Menu menu = new Menu(un);
		menu.OutMenu();
	}
}