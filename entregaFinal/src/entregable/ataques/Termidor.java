package entregable.ataques;

import game.components.Monster;

public class Termidor implements Keloke {
	@Override
	public int damage(Monster monster) {
		return -100; // Le da un termidor al enemigo (Se cura)
	}
}
