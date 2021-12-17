package main.java.classes;

import java.util.List;

public class DonnantDonnant implements Strategie {
	@Override
	public String execute(List<String> historiquejoueur,List<String> historiqueadverse) {
		if(historiqueadverse.get(Integer.min(historiquejoueur.size()-1,historiqueadverse.size()-1)).equals("trahison")) {
			return "trahison";
		}
		return "cooperation";
	}
}