package View;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuPrincipal extends JFrame implements ActionListener {
    private JTextField ventana;
    private JLabel label1, label2;
    private JButton boton1;
    public static String texto =" ";

    public MenuPrincipal(){
        setLayout(null);
        setSize(500,600);
        setTitle("Bienvenido Al Sistema de turnos");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        getContentPane().setBackground(new Color(100,100,100));

        label1 = new JLabel("Sistema Reserva de Turnos");
        label1.setBounds(25,15,300,150);
        add(label1);

        boton1 = new JButton("Registrar Turno");
        boton1.setBounds(45,212,200,30);
        boton1.setBackground(new Color(120,120,120));
        boton1.setFont(new Font("Andale Mono", 1, 14));
        boton1.setForeground(new Color(230,140,23));
        boton1.addActionListener(this);
        add(boton1);
    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

