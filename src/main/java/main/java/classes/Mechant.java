package main.java.classes;

import java.util.List;

public class Mechant implements Strategie {
	@Override
	public String execute(List<String> historiquej,List<String> historiqueadverse) {
		return "trahison";
	}
}