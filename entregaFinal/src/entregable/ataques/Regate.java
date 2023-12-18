package entregable.ataques;

import game.components.Monster;
import game.random.RandomGenerator;

public class Regate implements God {
	@Override
	public int damage(Monster monster) {
		System.out.println("Olee");
		return RandomGenerator.getInstance().calculateDamage(300, 450);
	}
}
