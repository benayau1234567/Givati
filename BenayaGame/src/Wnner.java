import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Wnner extends JFrame{
	final int GH = 150;
	final int GW = 600;
	JLabel l = new JLabel();
	
	Wnner(){
		 
		this.setFocusable(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("THE GAME");
		this.setResizable(false);
		this.setSize(GW, GH);
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		this.add(l);
		
		l.setBackground(Color.black);
		l.setText("Game Over!!");
		l.setHorizontalTextPosition(JLabel.CENTER);
		l.setVerticalTextPosition(JLabel.TOP);
		l.setForeground(Color.red);
		l.setFont(new Font("mv boli", Font.PLAIN, 40));
		l.setIconTextGap(-75);
		l.setOpaque(true);
		l.setVerticalAlignment(JLabel.CENTER);
		l.setHorizontalAlignment(JLabel.CENTER);
		 
}}
