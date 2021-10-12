import java.util.LinkedList;

public class Petrinet {
	
	private LinkedList <Place> places;
	private LinkedList <Arc> arcs;
	private LinkedList <Transition> transitions;
	

	public void createPlace(int n) {
		Place p = new Place(n);
		places.add(p);
		
		
	}
	public void createArc(Place place, String type) throws TypeExeption {
		if (type=="videur") {
			Arc arc = new arc_videur(Place place);
		}
		if (type=="classique") {
			Arc arc = new arc_classique();
		}
		if (type=="zéro"  | type=="zero") {
			
		}
		else {
			throw TypeExeption();
		}
	}
	public void createTransitition() {
		Transition t = new Transition();
		
		
	}

	@Override


	@Override
	public void triggerTransition() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removePlace() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeArc() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeTransition() {
		// TODO Auto-generated method stub
		
	}
	
	

}
