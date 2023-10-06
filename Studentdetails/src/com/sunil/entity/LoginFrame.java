package com.sunil.entity;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class LoginFrame extends JFrame {
	JButton b1, b2;
	JLabel l1;

	public LoginFrame() {
		super("LOGIN PAGE");
		setSize(800, 550);
		setResizable(true);
		setLocation(200, 50);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		b1 = new JButton(" START YOUR REGISTRATION FORM ");
		b1.setBounds(250, 400, 300, 50);
		add(b1);
		l1 = new JLabel();
		l1.setBounds(200, 30, 700, 300);
		l1.setIcon(new ImageIcon("9.jpg"));
		add(l1);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginFrame.this.setVisible(false);
				new Frame2();
			}
		});
		setVisible(true);
	}
}