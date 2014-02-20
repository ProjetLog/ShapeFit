
public class Bloc {
	private int x;
	private int y;
	
	private Piece piece;
	
	public Bloc(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	public void setX(int x)
	{
		this.x = x;
	}
	public void setY(int y)
	{
		this.y = y;
	}
	public void setPiece(Piece piece)
	{
		this.piece = piece;
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
