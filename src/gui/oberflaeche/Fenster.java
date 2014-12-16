package gui.oberflaeche;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Fenster extends JFrame{
	private static final long serialVersionUID = 8261841573622507747L;
	
	private JMenuBar menu=new JMenuBar();
	private JMenu spiel=new JMenu(GuiSteuerung.meldung("spiel"));
	private JMenuItem neu=new JMenuItem(GuiSteuerung.meldung("neu"));
	public Fenster()
	{
		setSize(550,350);
		setLocation(300,300);
		setJMenuBar(menu);
		menu.add(spiel);
		spiel.add(neu);
		setTitle(GuiSteuerung.meldung("froschspiel"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String args[])
	{
		new Fenster();
	}
}
