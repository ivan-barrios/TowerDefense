package entregable.ataques;

import game.components.Monster;

public class Cantar implements Keloke {
	@Override
	public int damage(Monster monster) {
		System.out.println("Cumbia 420");
		return 999;
	}
}
