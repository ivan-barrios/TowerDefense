package entregable.monstruos;

import java.util.Arrays;
import java.util.List;

import javax.swing.ImageIcon;

import entregable.ataques.Caño;
import entregable.ataques.Lirico;
import game.components.Monster;
import game.types.Type;

public class Ronaldinho extends Monster {
	private List<Lirico> skills = Arrays.asList(new Caño());

	public Ronaldinho(String name) {
		this.life = 10000;
		this.monsterName = name;
		this.activeSkill = skills.get(0);
		this.types = Arrays.asList(Type.FUTBOLISTA, Type.LIRICO);
		this.linkToImage = new ImageIcon("entregaFinal/assets/ronaldinho.jpg");
	}

	@Override
	public void attack(Monster enemy) {
		enemy.onDamageReceive(this.activeSkill.damage(enemy), this);
	}

}
