package entregable.ataques;

import game.components.Monster;
import game.types.Type;

public class Torpedo implements UnderwaterBeast {

	@Override
	public int damage(Monster monster) {
		if (monster.getTypes().contains(Type.GOD)) {
			return (monster.getLife() * 2); // Si se cruza a messi, lo mata de una
		} else
			return 300;
	}
}