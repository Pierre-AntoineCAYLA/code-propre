package ex3;

import java.util.List;

public class SavaneAfricaine {


	private List<String> animalSavane;
	private final int NOURRITURE=10;
	
	public void addAnimal(String typeAnimal, String nomAnimal, String comportement) {
		animalSavane.add(typeAnimal);
		animalSavane.add(nomAnimal);
		animalSavane.add(comportement);
	}
	
	public void afficherListeAnimaux(){
		for (String nom: animalSavane){
			System.out.println(nom);
		}
	}
	
	public int compterAnimaux(){
		return animalSavane.size();
	}
	
	public int calculerKgsNourritureParJour(){
		return animalSavane.size() * NOURRITURE;
	}
}
