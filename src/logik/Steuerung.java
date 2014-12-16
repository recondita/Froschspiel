package logik;

import java.util.Random;

import logik.treibgut.Blatt;
import logik.treibgut.Frosch;
import logik.treibgut.Muenze;
import gui.GUI;

public class Steuerung {

	// Ganz hardcoden wollte ich das jetzt nicht in den anderen Klassen...
	public final static int X_LENGTH = 20;
	public final static int Y_LENGTH = 10; // mit Ufer
	public final static int INIT_VERSUCHE = 3;
	public final static int ANZ_MUENZEN = 10;
	public final static int ANZ_BLAETTER = 120;

	// gegeben
	private int aVersuche=INIT_VERSUCHE;
	private int aMuenzzahl=ANZ_MUENZEN;
	private int aBlattzahl=ANZ_BLAETTER;
	private int aZustand;

	// aus den aufgaben
	private GUI dieGUI;
	private Blatt[] dasBlatt = new Blatt[aBlattzahl];
	private Muenze[] dieMuenze = new Muenze[aMuenzzahl];
	private Frosch derFrosch;

	// Optional/Fuer gegebene Methode
	private Random ran = new Random();

	// Aus Klassendiagram gegeben
	public Steuerung(GUI pGUI) {
		this.dieGUI = pGUI;
		neuesSpiel();
	}

	/**
	 * 
	 * @param pUGrenze
	 *            inklusiv!
	 * @param pOGrenze
	 *            exklusiv!
	 * @return pseudo Zufallszahl
	 */
	private int gibZufallsGZ(int pUGrenze, int pOGrenze) {
		return pUGrenze + ran.nextInt(pOGrenze - pUGrenze);
	}

	private void verteileTreibgut() {
		// nicht ganz leicht aus dem gegeben etwas halbwegs Akzeptables zu
		// machen...
		// also eigentlich gar nicht, recht unperfomant und es ist nicht
		// garantiert das diese Methode irgendwann mal terminiert, wenn der
		// Zufall "unguenstig" kommt, oder falls jemand mehr Blaetter als moeglich will
		int x = 0;
		int y = 1;
		boolean belegt = false;
		// .length waere besser, aber das Struktrogramm...
		for (int i = 0; i < aBlattzahl; i++) {
			// das mache ich so sehr, sehr ungern, aber das Struktogramm laesst
			// nicht viel Freiraum...
			while (belegt) {
				x = gibZufallsGZ(0, X_LENGTH);
				y = gibZufallsGZ(1, Y_LENGTH - 1);
				belegt = false;
				for (int j = 0; j < i && !belegt; j++) {
					belegt = dasBlatt[j].hatGleichesXY(x, y);
				}
				dasBlatt[i]=new Blatt(x,y);
				dieGUI.zeichenBlatt(x, y);
			}
			
		}
		
		//soooo redundant
		for (int i = 0; i < aMuenzzahl; i++) {
			while (belegt) {
				x = gibZufallsGZ(0, X_LENGTH);
				y = gibZufallsGZ(1, Y_LENGTH - 1);
				belegt = false;
				for (int j = 0; j < i && !belegt; j++) {
					belegt = dieMuenze[j].hatGleichesXY(x, y);
				}
				dieMuenze[i]=new Muenze(x,y);
				dieGUI.zeichneMuenze(x, y);
			}
			
		}
	}

	public void neuesSpiel()
	{
		dieGUI.loescheAlles();
		verteileTreibgut();
		derFrosch=new Frosch(X_LENGTH/2,Y_LENGTH-1);
		dieGUI.zeichneFrosch(derFrosch.gibX(), derFrosch.gibY());
	}
	// zum starten
	public void main(String[] args) {
		new Steuerung(new GUI(X_LENGTH, Y_LENGTH));
	}
	
	public void bestimmeZustand(int x, int y)
	{
		int dieMuenzZahl=derFrosch.gibAnzahlMuenzen();
		//TODO
	}
	
	/**
	 * 
	 * @param richtung 0=rechts, 1=zurueck, 2=links, 3=vor //glaube ich...
	 */
	public void gedruecktTaste(int richtung)
	{
		dieGUI.loescheFrosch();
		derFrosch.springen(richtung);
		int x=derFrosch.gibX();
		int y=derFrosch.gibY();
		bestimmeZustand(x,y);
	}
}
