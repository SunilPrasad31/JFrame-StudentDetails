package com.sunil.entity;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Frame4 extends JFrame {
	JLabel l1, l2, l3, l4, l5, l6, l7;
	JTextField t1, t2, t3, t4, t5;
	JButton b1, b2, b3;
	String data;

	public Frame4(String s1, String s2, String s3, String s4) {
		super("STUDENT DETAILS");
		setSize(500, 500);
		setResizable(true);
		setLocation(200, 50);
		setLayout(null);
		final String s5 = s1;
		final String s6 = s2;
		final String s7 = s3;
		final String s8 = s4;
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		l1 = new JLabel("ENTER SSC PERCENTAGE: ");
		l1.setBounds(40, 50, 150, 30);
		add(l1);
		t1 = new JTextField();
		t1.setBounds(270, 50, 200, 30);
		add(t1);
		l2 = new JLabel("ENTER HSC PERCENTGE: ");
		l2.setBounds(40, 100, 150, 30);
		add(l2);
		t2 = new JTextField();
		t2.setBounds(270, 100, 200, 30);
		add(t2);
		l3 = new JLabel("ENTER YOUR AVERAGE POINTER: ");
		l3.setBounds(40, 150, 200, 30);
		add(l3);
		t5 = new JTextField();
		t5.setBounds(270, 150, 200, 30);
		add(t5);
		l4 = new JLabel(" HAVE ENROLED FOR NTPEL:");
		l4.setBounds(40, 190, 200, 30);
		add(l4);
		t3 = new JTextField();
		t3.setBounds(270, 190, 200, 30);
		add(t3);
		l5 = new JLabel("HAVE YOU JIONED ANY COMMITIE: ");
		l5.setBounds(40, 230, 200, 30);
		add(l5);
		t4 = new JTextField();
		t4.setBounds(270, 230, 200, 30);
		add(t4);
		b2 = new JButton("CONTINUE");
		b2.setBounds(150, 330, 150, 30);
		add(b2);

		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				if (t1.getText().equals("")) {

					JOptionPane.showMessageDialog(Frame4.this, "Please Enter SSLC PERCENTAGE", "ALERT",
							JOptionPane.PLAIN_MESSAGE);
					return;
				} else if (t2.getText().equals("")) {

					JOptionPane.showMessageDialog(Frame4.this, "Please Enter HSC MARKS", "ALERT",
							JOptionPane.PLAIN_MESSAGE);
				} else if (t5.getText().equals("")) {

					JOptionPane.showMessageDialog(Frame4.this, "Please Enter AVERAGE POINTER", "ALERT",
							JOptionPane.PLAIN_MESSAGE);
				} else if (t3.getText().equals("")) {

					JOptionPane.showMessageDialog(Frame4.this, "Please Enter COMMITTE NAME", "ALERT",
							JOptionPane.PLAIN_MESSAGE);
				} else if (t4.getText().equals("")) {

					JOptionPane.showMessageDialog(Frame4.this, "Please Enter NTEPL COURSE", "ALERT",
							JOptionPane.PLAIN_MESSAGE);
				} else {
					String s9 = "SSC PERCENTAGE" + t1.getText().trim();
					String s10 = "HSC PERCENTAGE" + t2.getText().trim() + "\n";
					String s11 = " COMMITTE: " + t4.getText().trim();
					String s12 = "NTEPL COURSE NAME :" + t3.getText().trim();
					String s13 = "AVERAGE POINTER :" + t5.getText().trim();

					Frame4.this.setVisible(false);
					new Frame5(s5, s6, s7, s8, s9, s10, s11, s12, s13);
				}
			}
		});
		setVisible(true);
	}

}
