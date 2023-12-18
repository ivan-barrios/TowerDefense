package comparadores;

import java.util.Comparator;

import game.components.Monster;

public class ComparadorVida implements Comparator<Monster> {
	public int compare(Monster m1, Monster m2) {
		return m2.getLife() - m1.getLife(); // Sale el de mayor vida
	}
}