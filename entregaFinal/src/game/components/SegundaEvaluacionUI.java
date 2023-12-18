package game.components;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class SegundaEvaluacionUI extends JFrame {

    private List<JPanel> panelList = new ArrayList<>();

    private List<JLabel> labels = new ArrayList<>();

    private JLabel label1;

    private JLabel label2;

    public SegundaEvaluacionUI init() {
        this.initPanels();
        this.addButtons();
        setContentPane(new BackgroundPanel());
        setTitle("Segunda Evaluacion");
        setSize(600, 900);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GridLayout gridLayout = new GridLayout(20,3);
        panelList.forEach(SegundaEvaluacionUI.this::add);

        setLayout(gridLayout);
        setLocationRelativeTo(null);
        return this;
    }

    public JLabel getLabel(int index) {
        return labels.get(index);
    }

    private void addButtons() {
        // Reemplaza cada JButton por un JLabel con una imagen
        // Asegúrate de que las rutas de las imágenes sean correctas

        JLabel label15 = new JLabel(new ImageIcon("ruta/a/imagen15.png"));
        panelList.get(15).setLayout(new FlowLayout(FlowLayout.RIGHT));
        panelList.get(15).add(label15);
        label15.setVisible(false);
        labels.add(label15);

        JLabel label17 = new JLabel(new ImageIcon("ruta/a/imagen17.png"));
        panelList.get(17).setLayout(new FlowLayout(FlowLayout.LEFT));
        panelList.get(17).add(label17);
        label17.setVisible(false);
        labels.add(label17);

        JLabel label27 = new JLabel(new ImageIcon("ruta/a/imagen27.png"));
        panelList.get(27).setLayout(new FlowLayout(FlowLayout.RIGHT));
        panelList.get(27).add(label27);
        label27.setVisible(false);
        labels.add(label27);

        JLabel label29 = new JLabel(new ImageIcon("ruta/a/imagen29.png"));
        panelList.get(29).setLayout(new FlowLayout(FlowLayout.LEFT));
        panelList.get(29).add(label29);
        label29.setVisible(false);
        labels.add(label29);

        JLabel label39 = new JLabel(new ImageIcon("ruta/a/imagen39.png"));
        panelList.get(39).setLayout(new FlowLayout(FlowLayout.RIGHT));
        panelList.get(39).add(label39);
        label39.setVisible(false);
        labels.add(label39);
    JLabel label41 = new JLabel(new ImageIcon("ruta/a/imagen41.png"));
        panelList.get(41).setLayout(new FlowLayout(FlowLayout.LEFT));
        panelList.get(41).add(label41);
        label41.setVisible(false);
        labels.add(label41);

        // Configuración de las etiquetas de vidas
        label1 = new JLabel("Vidas: 3");
        label1.setForeground(Color.RED);
        label1.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 30));
        panelList.get(0).setLayout(new FlowLayout(FlowLayout.LEFT));
        panelList.get(0).add(label1);

        label2 = new JLabel("Vidas: 3");
        label2.setForeground(Color.BLUE);
        label2.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 30));
        panelList.get(57).setLayout(new FlowLayout(FlowLayout.LEFT));
        panelList.get(57).add(label2);
    }

    public JLabel getVidasPlayerOneLabel() {
        return label1;
    }

    public JLabel getVidasPlayerTwoLabel() {
        return label2;
    }

    public void refresh() {
        this.revalidate();
        this.repaint();
    }

    private void initPanels() {
        for(int i=0; i < 60; i++) {
            JPanel panel = new JPanel();
            panel.setOpaque(true);
            panel.setBackground(new Color(0,0,0,0));
//            panel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            panelList.add(panel);
        }
    }
}
