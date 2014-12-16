package logik.treibgut;

import logik.Steuerung;

public class Frosch extends Treibgut{
//Diese Vererbung ist Schwachsinn
	private int aVersuche=Steuerung.START_VERSUCHE;
	private int aMuenzzah=Steuerung.ANZ_MUENZEN;
	
	public Frosch(int pX, int pY) {
		super(pX,pY);
	}

}
