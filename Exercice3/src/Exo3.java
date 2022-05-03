
public class Exo3 {

	public static void main(String[] args) {
		voitiure voiture1 = new voitiure();
		
		voiture1.setPuissance(50);
		
		System.out.println( voiture1.getPuissance());
		voiture1 = null;
		System.gc();
	}

}
