package gui.oberflaeche;

import javax.swing.JFrame;

public class Fenster extends JFrame{
	private static final long serialVersionUID = 8261841573622507747L;

	public Fenster()
	{
		setSize(400,300);
		setLocation(300,300);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String args[])
	{
		new Fenster();
	}
}
