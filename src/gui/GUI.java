package gui;

import gui.oberflaeche.Fenster;


public class GUI{

	private int aAktXFrosch;
	private int aAktYFrosch;
	
	//Nur da um die Werte nicht Richard-Style hardzucoden
	public final int xLength,yLength;
	
	public GUI(int xLength, int yLength) {
		this.xLength=xLength;
		this.yLength=yLength;
		new Fenster(this);
	}

	public void clickNeuesSpiel()
	{
		//TODO
	}
	
	public void clickSpielBeenden()
	{
		System.exit(0);
	}
	
	public void loescheAlles()
	{
		//TODO
	}
	
	public void zeichenBlatt(int pX, int pY)
	{
		//TODO
	}
	
	public void zeichneMuenze(int pX, int pY)
	{
		//TODO
	}
}
