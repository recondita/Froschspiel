package gui.oberflaeche;

import gui.GUI;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Fenster extends JFrame {
	private static final long serialVersionUID = 8261841573622507747L;

	private JMenuBar menu = new JMenuBar();
	private JMenu spiel = new JMenu(GuiSteuerung.meldung("spiel"));
	private JMenuItem neu = new JMenuItem(GuiSteuerung.meldung("neu"));
	private JMenuItem beenden = new JMenuItem(GuiSteuerung.meldung("beenden"));
	private GUI gUI;

	public Fenster(GUI gUI) {
		this.gUI = gUI;
		setSize(550, 350);
		setLocation(300, 300);
		setJMenuBar(menu);
		menu.add(spiel);
		spiel.add(neu);
		neu.addActionListener(new ActionListener() {
			public final void actionPerformed(final ActionEvent e) {
				Fenster.this.gUI.clickNeuesSpiel();
			}
		});
		spiel.add(beenden);
		beenden.addActionListener(new ActionListener() {
			public final void actionPerformed(final ActionEvent e) {
				Fenster.this.gUI.clickSpielBeenden();
			}
		});
		setLayout(new BorderLayout());
		setTitle(GuiSteuerung.meldung("froschspiel"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
