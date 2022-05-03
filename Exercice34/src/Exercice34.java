
public class Exercice34 {

	public static void main(String[] args) {
		Voiture34 voiture1 = new Voiture34();
		Voiture34 voiture2 = new Voiture34();
		
		voiture1.setNom('a');
		voiture2.setNom('b');
		
		for (int i =0; i<Voiture34.getNbVoitures();i++) {
			System.out.println("Voiture numéro "+(i+1)+" de nom : "+Voiture34.getListeVoitures()[i].getNom());
		}

	}

}
