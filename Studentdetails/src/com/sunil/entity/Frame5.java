package com.sunil.entity;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Frame5 extends JFrame {
	JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10;
	JButton b1, b2;

	public Frame5(String s1, String s3, String s2, String s4, String s5, String s6, String s7, String s8, String s9) {
		super("STUDENT");
		setSize(1000, 900);
		setResizable(true);
		setLocation(200, 70);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		l1 = new JLabel(s1);
		l1.setBounds(50, 20, 300, 30);
		add(l1);
		l4 = new JLabel(s4);
		l4.setBounds(50, 70, 300, 30);
		add(l4);
		l2 = new JLabel(s2);
		l2.setBounds(50, 120, 300, 30);
		add(l2);
		l3 = new JLabel(s3);
		l3.setBounds(50, 170, 300, 30);
		add(l3);
		l5 = new JLabel(s5);
		l5.setBounds(50, 220, 300, 30);
		add(l5);
		l6 = new JLabel(s6);
		l6.setBounds(50, 270, 300, 30);
		add(l6);
		l7 = new JLabel(s7);
		l7.setBounds(50, 320, 300, 30);
		add(l7);
		l8 = new JLabel(s8);
		l8.setBounds(50, 370, 300, 30);
		add(l8);
		l9 = new JLabel(s9);
		l9.setBounds(50, 420, 300, 30);
		add(l9);
		b1 = new JButton(" MAKE A NEW ENTERY ");
		b1.setBounds(250, 400, 150, 50);
		add(b1);
		b2 = new JButton(" EXIT ");
		b2.setBounds(400, 400, 150, 50);
		add(b2);

		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new Frame3();
			}
		});
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		setVisible(true);
	}
}
