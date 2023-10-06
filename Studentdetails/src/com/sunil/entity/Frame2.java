package com.sunil.entity;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Frame2 extends JFrame {
	JLabel l1, l2;
	JTextField t1, t2;
	JButton b1;

	public Frame2() {
		super("LOGIN PAGE");
		setSize(500, 500);
		setResizable(true);
		setLocation(200, 50);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		l1 = new JLabel("USERNAME: ");
		l1.setBounds(80, 150, 150, 30);
		add(l1);
		t1 = new JTextField();
		t1.setBounds(230, 150, 200, 30);
		add(t1);
		l2 = new JLabel(" PASSWORD: ");
		l2.setBounds(80, 190, 150, 30);
		add(l2);
		t2 = new JTextField();
		t2.setBounds(230, 190, 200, 30);
		add(t2);
		b1 = new JButton("LOGIN");
		b1.setBounds(150, 330, 150, 30);
		add(b1);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				if (t1.getText().equals("")) {
					JOptionPane.showMessageDialog(Frame2.this, "Please Enter USERNAME", "ALERT",
							JOptionPane.ERROR_MESSAGE);
					return;
				} else if (t2.getText().equals("")) {
					JOptionPane.showMessageDialog(Frame2.this, "Please Enter PASSWORD", "ALERT",
							JOptionPane.ERROR_MESSAGE);
					return;
				} else if (t1.getText().equals("sunil") && t2.getText().equals("sunil@1234")) {
					Frame2.this.setVisible(false);
					new Frame3();
				} else {
					JOptionPane.showMessageDialog(Frame2.this, "USERID OR WORNG IS WORNG", "ALERT",
							JOptionPane.ERROR_MESSAGE);
					return;
				}
			}
		});
		setVisible(true);
	}
}
