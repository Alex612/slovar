package com.slov;
import com.slov.*;
import java.util.*;
import java.io.*;

class Biblioteka{
	public static void main(String args[]){
		FileProcessing fp = new ProcessedFiles();
		Combined un = new Combination(fp);
		Menu menu = new Menu(un);
		menu.outMenu();
	}
}