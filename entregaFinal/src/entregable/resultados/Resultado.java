package entregable.resultados;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;

public class Resultado extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L; // Que es esto=???????

	public Resultado(int vidas1, int vidas2) {
		super("Resultados");
		this.setSize(500, 250);

		JLabel label2;
		if (vidas1 <= 0) {
			label2 = new JLabel("Ganador: Jugador 1!");
			getContentPane().setBackground(Color.BLUE);
		} else {
			label2 = new JLabel("Ganador: Jugador 2!");
			getContentPane().setBackground(Color.RED);
		}
		label2.setHorizontalAlignment(SwingConstants.CENTER);
		label2.setVerticalAlignment(SwingConstants.CENTER);
		label2.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 32));
		label2.setForeground(Color.WHITE);
		this.add(label2);
		setLocationRelativeTo(null);
	}
}