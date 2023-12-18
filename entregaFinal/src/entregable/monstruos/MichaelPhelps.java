package entregable.monstruos;

import java.util.Arrays;
import java.util.List;

import javax.swing.ImageIcon;

import entregable.ataques.Mordida;
import entregable.ataques.Torpedo;
import entregable.ataques.UnderwaterBeast;
import game.components.Monster;
import game.types.Type;

public class MichaelPhelps extends Monster {

	private List<UnderwaterBeast> skills = Arrays.asList(new Mordida(), new Torpedo());

	public MichaelPhelps(String name) {
		this.life = 2000;
		this.monsterName = name;
		this.activeSkill = skills.get(0);
		this.types = Arrays.asList(Type.UNDERWATERBEAST);
		this.linkToImage = new ImageIcon("entregaFinal/assets/michaelp.jpeg");
	}

	@Override
	public void onDamageReceive(Integer damage, Monster monster) {
		this.life = this.life - damage;
		if (this.life < 1000) {
			this.activeSkill = skills.get(1);
		}
		if (this.life < 0) {
			this.life = 0;
		}
		System.out.println(this + " fue herido, queda con " + this.life + " puntos de vida");
	}

	@Override
	public void attack(Monster enemy) {
		enemy.onDamageReceive(this.activeSkill.damage(enemy), this);
	}
}
