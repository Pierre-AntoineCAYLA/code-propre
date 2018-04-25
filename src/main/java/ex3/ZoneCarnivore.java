package ex3;

import java.util.List;

public class ZoneCarnivore {

	private List<String> animalCarnivor;
	private final double NOURRITURE=10;

	
	public void addAnimal(String typeAnimal, String nomAnimal, String comportement) {
		animalCarnivor.add(typeAnimal);
		animalCarnivor.add(nomAnimal);
		animalCarnivor.add(comportement);
	}
	
	public void afficherListeAnimaux(){
		for (String nom: animalCarnivor){
			System.out.println(nom);
		}
	}
	
	public double calculerKgsNourritureParJour(){
		return animalCarnivor.size() * NOURRITURE;
	}
}
