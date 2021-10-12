import java.util.LinkedList;

public class Transition {
	private LinkedList <Arc> arc_e;
	private LinkedList <Arc> arc_s;
	
	public Transition(LinkedList<Arc> arc_e, LinkedList<Arc> arc_s) {
		super();
		this.arc_e = arc_e;
		this.arc_s = arc_s;
	}
	
	public boolean trigger_transition() {
		for (Arc arc : arc_e) {
			if (arc.arc_valide()==false) {
				return false;
			}
		}
		for (Arc arc : arc_e) {
			arc.apply_transition(false);
		}
		for (Arc arc : arc_s) {
			arc.apply_transition(true);
		}
		
		return true;
	}
}
