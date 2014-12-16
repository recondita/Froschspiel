package logik;

import gui.GUI;

public class Steuerung {

	private int aVersuche;
	private int aMuenzzahl;
	private int aBlattzahl;
	private int aZustand;
	
	//Ganz hardcoden wollte ich das jetzt nicht in den anderen Klassen... 
	public final static int X_LENGTH=20;
	public final static int Y_LENGTH=10;
	
	public Steuerung() {
		new GUI(X_LENGTH,Y_LENGTH);
	}

	public void main(String[] args)
	{
		new Steuerung();
	}
}
