package logik.treibgut;

import logik.Steuerung;

public class Frosch extends Treibgut{
//Diese Vererbung ist Schwachsinn
	private int aVersuche=Steuerung.INIT_VERSUCHE;
	private int aMuenzzah=Steuerung.ANZ_MUENZEN;
	
	public Frosch(int pX, int pY) {
		super(pX,pY);
	}
	
	public void springen(int richtung)
	{
		int diff=1-richtung&2;
		if((richtung&1)==0)
		{
			aX=+diff;
		}
		else
		{
			aY=+diff;
		}
	}
	
	public void aufStartPos()
	{
		aX=Steuerung.Y_LENGTH-1;
	}
}
