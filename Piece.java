import java.util.ArrayList;


public class Piece {
	private int x;
	private int y;
	
	private ArrayList <Bloc> blocs;
	
	private Boolean equals(Piece autrePiece)
	{
		
		return true; // Fixme
	}
	
	
	public void appendBloc(int x, int y)
	{
		Bloc nouveauBloc = new Bloc(x, y);
		nouveauBloc.setPiece(this);
		this.blocs.add(nouveauBloc);
		
	}
	public void setX(int x)
	{
		this.x = x;
	}
	public void setY(int y)
	{
		this.y = y;
	}
	public int getX()
	{
		return this.x;
	}
	public int getY()
	{
		return this.y;
	}
	
	
	
}
