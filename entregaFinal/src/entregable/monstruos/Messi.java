package entregable.monstruos;

import java.util.Arrays;

import game.components.Monster;
import game.components.PathBox;
import game.types.Type;
import entregable.ataques.*;
import java.util.List;

public class Messi extends Monster {

	private List<God> skills = Arrays.asList(new Plancha(), new Regate());

	public Messi(String name) {
		this.life = 1010101010;
		this.monsterName = name;
		this.activeSkill = skills.get(0);
		this.types = Arrays.asList(Type.GOD, Type.BEAST);
	}

	@Override
	public void move(PathBox oldPathBox, PathBox newPathBox) {
		super.move(oldPathBox, newPathBox);
		if (activeSkill instanceof Plancha) {
			this.activeSkill = skills.get(1);
		} else {
			this.activeSkill = skills.get(0);
		}
	}

	@Override
	public void onDamageReceive(Integer damage, Monster monster) {
		this.life = this.life - (damage / 2);
		if (this.life < 0) {
			this.life = 0;
		}
		System.out.println("Que mira' bobo");
		System.out.println(this + " fue herido, queda con " + this.life + " puntos de vida");
	}

	@Override
	public void attack(Monster enemy) {
		enemy.onDamageReceive(this.activeSkill.damage(enemy), this);
	}
}
