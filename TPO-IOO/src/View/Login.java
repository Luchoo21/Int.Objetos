package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;

public class Login extends JFrame {
    private JTextField JTFUsuario;
    private JPanel panel1;
    private JPasswordField JPFContra;
    private JButton registrarseButton;
    private JButton inicioButton;
    private JFrame frame;


    public Login(){

            // Configuracion Ventana
            frame = new JFrame("Sistema de reserva de turnos");
            frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
            frame.setPreferredSize(new Dimension(356,256));
            frame.setResizable(false);
            frame.getContentPane().setBackground(new Color(100,100,100));

            // Agregamos el otro panel

            frame.add(panel1);
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);

            // Configuracion Botones

            inicioButton.setBackground(new Color(120,120,120));
            inicioButton.setFont(new Font("Andale Mono",1,14));
            inicioButton.setForeground(new Color(230,140,23));

            registrarseButton.setBackground(new Color(120,120,120));
            registrarseButton.setFont(new Font("Andale Mono",1,14));
            registrarseButton.setForeground(new Color(230,140,23));

            // Agregamos Acciones

            inicioButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(String.valueOf(JTFUsuario.getText()).compareTo("admin")==0){
                        if(String.valueOf(JPFContra.getPassword()).compareTo("1234")==0){}
                        dispose();
                        new MenuPrincipal().setVisible(true);

                    } else {
                        JOptionPane.showMessageDialog(null,"Datos Incorrectos");
                        getToolkit();
                        inicioButton.setEnabled(true);
                    }
                }
            });

            registrarseButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    dispose();
                    new AltaUsuario().setVisible(true);
                }
            });
    }

    public static void main(String[] args) {
        Login interfaz = new Login();
    }

}

