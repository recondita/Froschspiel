package logik.treibgut;

public class Muenze extends Treibgut {

	private boolean aGeholt = false;

	public Muenze(int pX, int pY) {
		super(pX, pY);
	}

	public void treiben() {
		super.aX++;
	}

	public boolean gibGeholt() {
		return this.aGeholt;
	}
}
