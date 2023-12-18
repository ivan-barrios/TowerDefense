import game.components.Monster;
import game.components.RumbleGame;
import game.monsters.EvilBeast;
import game.monsters.IceBeast;
import game.monsters.Spartan;

import java.util.Arrays;
import java.util.List;

import entregable.monstruos.LGante;
import entregable.monstruos.Messi;
import entregable.monstruos.MichaelPhelps;
import entregable.monstruos.Ronaldinho;
import comparadores.*;

public class Main {
	public static void main(String[] args) {

		String currentWorkingDirectory = System.getProperty("user.dir");
		System.out.println("Current Working Directory: " + currentWorkingDirectory);

		
		RumbleGame rumbleGame = RumbleGame.getInstance();
		rumbleGame.init();

		List<Monster> monstersOne = Arrays.asList(new LGante("lgante1"));

		// TODO ordenar el listado de monstruos que recibe el jugador uno
		monstersOne.sort(new ComparadorNombre());
		rumbleGame.getPlayerOne().setMonsters(monstersOne);

		List<Monster> monstersTwo = Arrays.asList(new Spartan("Spartan A"), new Messi("Leito"), new Messi("Leito2"));

		// TODO ordenar el listado de monstruos que recibe el jugador dos
		monstersTwo.sort(new ComparadorVida());
		rumbleGame.getPlayerTwo().setMonsters(monstersTwo);

		rumbleGame.startGame();
	}
}