package main.java.classes;

import java.util.List;
public class Alternant implements Strategie {
	public String execute(List<String> historiquej, List<String> historiqueadverse) {
		if (historiquej.size()%2!=0) {
			return "trahison";
		}
		return "cooperation";
		
	}
} 	