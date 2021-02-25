/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author USER
 */
public class VantanaPuntaje extends JFrame {

    public JPanel p = new JPanel();
    public JTextArea puntaje = new JTextArea();
    public JButton reiniciar = new JButton("Reiniciar");
    public JButton cancelar = new JButton("Salir");

    public VantanaPuntaje() {
        this.setTitle("Puntajes");
        this.setLayout(null);
        this.setSize(500, 500);
        p.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(p);
        p.setLayout(null);
        p.setForeground(Color.WHITE);

        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        int height = pantalla.height;
        int width = pantalla.width;
        setSize((width / 2) - 200, (height / 2));

        setLocationRelativeTo(null);
        setVisible(true);
        puntaje.setBounds(150, 50, 200, 200);
        reiniciar.setBounds(100, 300, 100, 25);
        cancelar.setBounds(300, 300, 100, 25);
        puntaje.setEditable(false);
        p.add(puntaje);
        p.add(reiniciar);
        p.add(cancelar);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

}
