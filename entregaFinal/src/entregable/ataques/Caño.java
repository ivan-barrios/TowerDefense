package entregable.ataques;

import game.components.Monster;
import game.random.RandomGenerator;
import game.types.Type;

public class Caño implements Lirico {
	@Override
	public int damage(Monster monster) {
		int damage = RandomGenerator.getInstance().calculateDamage(100, 700);
		if (monster.getTypes().contains(Type.LIRICO)) {
			damage = damage * 2; // Si es otro lirico, se duplica el daño
		}
		return damage;
	}
}
