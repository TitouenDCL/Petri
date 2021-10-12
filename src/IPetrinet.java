
public interface IPetri {
	
	public void createPlace();
	public void createTransitition();
	public void createArc();
	public void triggerTransition();
	
	
	public void removePlace();
	
	public void removeArc();
	public void removeTransition();
	
	
}
