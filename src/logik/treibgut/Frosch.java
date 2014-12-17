package logik.treibgut;

import logik.Steuerung;

public class Frosch extends Treibgut{
//Diese Vererbung ist Schwachsinn
	private int aVersuche=Steuerung.INIT_VERSUCHE;
	private int aMuenzzahl=0;
	
	public Frosch(int pX, int pY) {
		super(pX,pY);
	}
	
	//aus der Aufgabe
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
	
	public int gibAnzahlMuenzen()
	{
		return aMuenzzahl;
	}
	
	public void incMuenzZahl()
	{
		aMuenzzahl++;
	}
	
	public void decVersuche()
	{
		aVersuche--;
	}
	
	public int gibAnzahlVersuche()
	{
		return aVersuche;
	}
}
