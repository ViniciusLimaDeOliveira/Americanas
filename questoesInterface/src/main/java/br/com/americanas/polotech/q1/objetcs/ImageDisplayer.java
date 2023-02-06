package br.com.americanas.polotech.q1.objetcs;

import javax.swing.*;
import java.awt.*;

// ============================== Parte de mostrar as imagens =====================================
public class ImageDisplayer {

    private JFrame frame;
    private JLabel label;

    public ImageDisplayer() {
        frame = new JFrame();
        label = new JLabel();
    }

    public void displayImage(Image image) {
        frame.setSize(image.getWidth(null), image.getHeight(null));
        label.setIcon(new ImageIcon(image));
        frame.add(label);
        frame.setVisible(true);
    }
}
// ====================================================================================================