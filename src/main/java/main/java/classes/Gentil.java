package main.java.classes;

import java.util.List;

class Gentil implements Strategie {
	@Override
	public String execute(List<String> historiquej,List<String> historiqueadverse) {
		return "cooperation";
	}
}
