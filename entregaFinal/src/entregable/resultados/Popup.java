package entregable.resultados;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;

public class Popup extends JFrame {

	public Popup() {
		super("Alerta Empate");
		JLabel label = new JLabel("Hubo un empate!");
		this.setSize(500, 250);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setVerticalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 32));
		getContentPane().setBackground(Color.GRAY);
		this.add(label);
		setLocationRelativeTo(null);
	}
}