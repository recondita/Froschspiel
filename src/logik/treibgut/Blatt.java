package logik.treibgut;

import logik.Steuerung;

public class Blatt extends Treibgut{

	public Blatt(int pX, int pY) {
		super(pX,pY);
	}
	
	public void treiben()
	{
		super.aX=(super.aX>0?super.aX:Steuerung.X_LENGTH)-1;
	}
}
