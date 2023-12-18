package entregable.ataques;

import game.components.Monster;

public class Mordida implements UnderwaterBeast {
	@Override
	public int damage(Monster monster) {
		System.out.println("Ñam");
		return 200;
	}
}
