import java.util.ArrayList;


public class Silhouette {
	private int x;
	private int y;
	
	ArrayList <Trou> trous;
	
	public void appendTrou(int x, int y)
	{
		Trou nouveauTrou = new Trou(x, y);
		nouveauTrou.setSilhouette(this);
		this.trous.add(nouveauTrou);
		
	}
}
