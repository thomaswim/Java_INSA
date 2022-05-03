
public class Voiture34 {
	
	//Déclaration des attributs
	
	private int puissance;
	private double vitesse ;
	private boolean estDemarre ;
	private char nom;
	
	//Variable de classe 
	
	public static int nbVoitures = 0;
	public static Voiture34[] listeVoitures = new Voiture34[10];
	
	//constructeur 
	public Voiture34() {
		puissance = 10;
		vitesse = 0;
		estDemarre = false ;
		//mise a jour de liste de voiture 
		listeVoitures[nbVoitures] = this;
		nbVoitures ++ ;
	}
	
	//methodes de classe
	
	public static int getNbVoitures() {
		return nbVoitures;
	}

	public static Voiture34[] getListeVoitures() {
		return listeVoitures;
	}
	
	//methodes
	public void demarre() {
		if (estDemarre != true){
			estDemarre = true;
		}
	}
	
	public void demmare(int vitesse) {
		if (estDemarre != true && vitesse ==0){
			estDemarre = true;
		}
	}
	
	//assesseurs
	
	public int getPuissance() {
		return puissance;
	}
	public void setPuissance(int puissance) {
		this.puissance = puissance;
	}
	public double getVitesse() {
		return vitesse;
	}
	public void setVitesse(double vitesse) {
		this.vitesse = vitesse;
	}
	public boolean isEstDemarre() {
		return estDemarre;
	}
	public void setEstDemarre(boolean estDemmarre) {
		this.estDemarre = estDemmarre;
	}

	public char getNom() {
		return nom;
	}

	public void setNom(char nom) {
		this.nom = nom;
	}
	
	
	
}
