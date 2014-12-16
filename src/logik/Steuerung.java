package logik;

import gui.GUI;

public class Steuerung {

	//gegeben
	private int aVersuche;
	private int aMuenzzahl;
	private int aBlattzahl;
	private int aZustand;
	
	//aus den aufgaben
	private GUI aGUI;
	
	//Ganz hardcoden wollte ich das jetzt nicht in den anderen Klassen... 
	public final static int X_LENGTH=20;
	public final static int Y_LENGTH=10;
	public final static int START_VERSUCHE=3;
	public final static int ANZ_MUENZEN=10;
	
	public Steuerung(GUI pGUI) {
		this.aGUI=pGUI;
	}

	public void main(String[] args)
	{
		new Steuerung(new GUI(X_LENGTH,Y_LENGTH));
	}
}
