package game.components;

import javax.swing.*;
import java.awt.*;

public class PathBox {
    private Monster monster;
    private PathBox southBox;
    private PathBox northBox;
    private String name;
    private JLabel labelUI;

    public PathBox(JLabel labelUI, String name) {
        this.labelUI = labelUI;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Monster getMonster() {
        return monster;
    }

    public void setMonster(Monster monster) {
        this.monster = monster;
    }

    public JLabel getLabelUI() {
        return labelUI;
    }

    public void setLabelUI(JLabel labelUI) {
        this.labelUI = labelUI;
    }

    public PathBox getSouthBox() {
        return southBox;
    }

    public void setSouthBox(PathBox southBox) {
        this.southBox = southBox;
    }

    public PathBox getNorthBox() {
        return northBox;
    }

    public void setNorthBox(PathBox northBox) {
        this.northBox = northBox;
    }

    public void update() {
    	if(this.monster != null) {
            ImageIcon originalIcon = monster.getLinkToImage(); // Asume que devuelve ImageIcon
            Image image = originalIcon.getImage();
            // Escalar imagen, manteniendo proporciones si es necesario
            ImageIcon scaledIcon = new ImageIcon(image.getScaledInstance(40, 40, Image.SCALE_SMOOTH)); // Ajusta tamaño según necesidad
            labelUI.setIcon(scaledIcon);
            labelUI.setSize(300, 300);
            labelUI.revalidate(); // Asegúrate de que el contenedor se ajuste al nuevo tamaño
            labelUI.repaint(); // Redibuja el componente

            labelUI.setVisible(true);
        } else {
            labelUI.setIcon(null);
            labelUI.setVisible(false);
        }
    }

}
