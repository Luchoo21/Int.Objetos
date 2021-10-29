package View;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {
	private JTextField ventana;
	private JLabel label1, label2;
	private JButton boton1;
	public static String texto =" ";
	
	public Login() {
		setLayout(null);
		setTitle("Bienvenida");
		getContentPane().setBackground(new Color(100,100,100));
		
		label1 = new JLabel("Sistema Reserva de Turnos");
		label1.setBounds(25,15,300,150);
		add(label1);
		
		label2 = new JLabel("Trabajo Práctico IOO");
		label2.setBounds(85,375,300,30);
		label2.setFont(new Font("Andale Mono", 3,18));
		add(label2);
		
		boton1 = new JButton("Ingresar");
		boton1.setBounds(45,212,200,30);
		boton1.setBackground(new Color(120,120,120));
		boton1.setFont(new Font("Andale Mono", 1, 14));
		boton1.setForeground(new Color(230,140,23));
		boton1.addActionListener(this);
		add(boton1);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String args[]){
		Login interfaz = new Login();
		interfaz.setBounds(0,0,350,450);
		interfaz.setVisible(true);
		interfaz.setResizable(true);
		interfaz.setLocationRelativeTo(null);
	}

	
}
