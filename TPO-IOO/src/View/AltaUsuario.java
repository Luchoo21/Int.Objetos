package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AltaUsuario extends JFrame {
    private JPanel panel1;
    private JFrame frame;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField6;
    private JPasswordField passwordField1;
    private JButton cancelarButton;
    private JButton aceptarButton;
    private JTextField textField5;

    public AltaUsuario(){

        // Configuracion de Ventanas

        frame = new JFrame("Alta Usuario");
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(500,400));
        frame.setResizable(false);
        frame.getContentPane().setBackground(new Color(100,100,100));


        // Agregamos el otro panel

        frame.add(panel1);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        // Configuracion Botones

        aceptarButton.setBackground(new Color(120,120,120));
        aceptarButton.setFont(new Font("Andale Mono",1,14));
        aceptarButton.setForeground(new Color(230,140,23));

        cancelarButton.setBackground(new Color(120,120,120));
        cancelarButton.setFont(new Font("Andale Mono",1,14));
        cancelarButton.setForeground(new Color(230,140,23));

        // Agregamos Acciones

        aceptarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        cancelarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new Login().setVisible(true);
            }
        });
    }

//    public static void main(String[] args) {
//        AltaUsuario alta = new AltaUsuario();
//        alta.setVisible(true);
//    }

}
