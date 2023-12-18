package entregable.ataques;

import game.components.Monster;
import game.random.RandomGenerator;

public class Plancha implements God {

	@Override
	public int damage(Monster monster) {
		return RandomGenerator.getInstance().calculateDamage(400, 500);
	}
}
