package main.java.classes;

public final class StrategieFactory {
	private static StrategieFactory instance;

	private StrategieFactory() {
	}

	public static StrategieFactory getStrategieFactory() {
		if (instance==null) {
			instance = new StrategieFactory();
		}
		return instance;
	}

	public Strategie createStrategie(String strategie) {

		switch (strategie) {
		case "Gentil":
			return new Gentil();
		case "Mechant":
			return new Mechant();
		case "Alternant":
			return new Alternant();
		case "DonnantDonnant":
			return new DonnantDonnant();
		default:
			return null;
		}


	}
}
