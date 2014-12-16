package gui.oberflaeche;

import java.util.ResourceBundle;

public class GuiSteuerung {

	public static String meldung(String key)
	{
		return ResourceBundle.getBundle("gui.oberflaeche.Ausgaben").getString(key);
	}
}
