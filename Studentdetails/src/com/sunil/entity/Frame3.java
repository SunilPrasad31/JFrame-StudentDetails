package com.sunil.entity;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

class Frame3 extends JFrame {
	JLabel l1, l2, l3, l4, l5, l6, l7;
	JTextField t1, t2, t3, t4, t5;
	JButton b1, b2, b3;
	String data;

	public Frame3() {
		super("STUDENT DETAILS");
		setSize(500, 500);
		setResizable(true);
		setLocation(200, 50);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		l1 = new JLabel("ENTER FIRST NAME ");
		l1.setBounds(80, 50, 150, 30);
		add(l1);
		t1 = new JTextField();
		t1.setBounds(230, 50, 200, 30);
		add(t1);
		l2 = new JLabel("ENTER LAST NAME ");
		l2.setBounds(80, 100, 150, 30);
		add(l2);
		t2 = new JTextField();
		t2.setBounds(230, 100, 200, 30);
		add(t2);

		l3 = new JLabel("SELECT GENDER ");
		l3.setBounds(80, 150, 150, 30);
		add(l3);
		t5 = new JTextField();
		t5.setBounds(230, 150, 200, 30);
		add(t5);
		l4 = new JLabel(" ENTER BRANCH ");
		l4.setBounds(80, 190, 150, 30);
		add(l4);
		t3 = new JTextField();
		t3.setBounds(230, 190, 200, 30);
		add(t3);
		l5 = new JLabel("ENTER ADDRESS ");
		l5.setBounds(80, 230, 150, 30);
		add(l5);
		t4 = new JTextField();
		t4.setBounds(230, 230, 200, 30);
		add(t4);
		b2 = new JButton("SUBMIT DETAILS");
		b2.setBounds(150, 330, 150, 30);
		add(b2);
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				if (t1.getText().equals("")) {

					JOptionPane.showMessageDialog(Frame3.this, "Please Enter FIRST NAME", "ALERT",
							JOptionPane.PLAIN_MESSAGE);
					return;
				} else if (t2.getText().equals("")) {
					JOptionPane.showMessageDialog(Frame3.this, "Please Enter LAST NAME", "ALERT",
							JOptionPane.PLAIN_MESSAGE);
				} else if (t5.getText().equals("")) {

					JOptionPane.showMessageDialog(Frame3.this, "Please Enter GENDER", "ALERT",
							JOptionPane.PLAIN_MESSAGE);
				} else if (t3.getText().equals("")) {

					JOptionPane.showMessageDialog(Frame3.this, "Please Enter DEPARTMENT", "ALERT",
							JOptionPane.PLAIN_MESSAGE);
				} else if (t4.getText().equals("")) {

					JOptionPane.showMessageDialog(Frame3.this, "Please Enter ADDRESS", "ALERT",
							JOptionPane.PLAIN_MESSAGE);
				} else {
					String s1 = "STUDENT NAME : " + t1.getText().trim() + " " + t2.getText().trim() + "\n";
					String s2 = "ADDRESS : " + t4.getText().trim();
					String s3 = "BRANCH : " + t3.getText().trim();
					String s4 = "GENDER : " + t5.getText().trim();

					Frame3.this.setVisible(false);
					new Frame4(s1, s2, s3, s4);
				}
			}
		});
		setVisible(true);
	}
}