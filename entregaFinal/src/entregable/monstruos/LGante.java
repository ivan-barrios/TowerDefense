package entregable.monstruos;

import java.util.Arrays;
import java.util.List;

import entregable.ataques.Cantar;
import entregable.ataques.Keloke;
import entregable.ataques.Termidor;
import game.components.Monster;
import game.random.RandomGenerator;
import game.types.Type;

public class LGante extends Monster {

	private List<Keloke> skills = Arrays.asList(new Cantar(), new Termidor());

	public LGante(String name) {
		this.monsterName = name;
		this.life = 800;
		this.activeSkill = skills.get(0);
		this.types = Arrays.asList(Type.KELOKE);
	}

	@Override
	public void attack(Monster monster) {
		monster.onDamageReceive(this.activeSkill.damage(monster), this);
		if (RandomGenerator.getInstance().calculateDamage(1, 4) == 4) {
			this.activeSkill = skills.get(1);
		} else {
			this.activeSkill = skills.get(0);
		}
	}
}
