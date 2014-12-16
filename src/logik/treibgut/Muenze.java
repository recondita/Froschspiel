package logik.treibgut;

import logik.Steuerung;

public class Muenze extends Treibgut {

	private boolean aGeholt = false;

	public Muenze(int pX, int pY) {
		super(pX, pY);
	}

	public void treiben() {
		super.aX=(super.aX+1)%Steuerung.X_LENGTH;
	}

	public boolean gibGeholt() {
		return this.aGeholt;
	}
}
