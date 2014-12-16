package logik.treibgut;

public class Treibgut {

	protected int aX;
	protected int aY;
	
	public Treibgut(int aX, int aY) {
		this.aX=aX;
		this.aY=aY;
	}

	public int gibX()
	{
		return aX;
	}
	
	public int giby()
	{
		return aY;
	}
	
	public boolean hatGleichesXY(int pX, int pY)
	{
		return pX==this.aX&&pY==this.aY;
	}
}
