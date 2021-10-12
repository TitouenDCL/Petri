
public class Place extends Petrinet{
	private int nombre_jetons;

	public Place(int nombre_jetons) {
		this.nombre_jetons = nombre_jetons;
	}
	
	

	public void set_nb_jetons(int nombre_jetons) {
		this.nombre_jetons = nombre_jetons;
	}


	public int get_nb_jetons() {
		return this.nombre_jetons;
	}
	
	public void modify_nb_jetons( int n) {
		this.set_nb_jetons(n);
	}
	
}
