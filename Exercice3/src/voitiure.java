
public class voitiure {
	private int puissance;
	private double vitesse ;
	private boolean estDemmarre ;
	
	public voitiure() {
		puissance = 10;
		vitesse = 2;
		estDemmarre = true ;
	}
	
	public void demmare() {
		if (estDemmarre != true){
			estDemmarre = true;
		}
	}
	
	public void demmare(int vitesse) {
		if (estDemmarre != true && vitesse ==0){
			estDemmarre = true;
		}
	}
	
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
	public boolean isEstDemmarre() {
		return estDemmarre;
	}
	public void setEstDemmarre(boolean estDemmarre) {
		this.estDemmarre = estDemmarre;
	}
	
	
	

}
