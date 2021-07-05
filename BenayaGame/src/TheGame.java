import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class TheGame extends JFrame implements KeyListener, ActionListener {

	Timer t = new Timer(2, this);//timer for loop game and repaint

	int B_1_XL = 700;//start x location of the red ball
	int B_2_XL = 50;//start x location of the blue ball
	int B_1_YL = 275;//start y location of the blue ball
	int B_2_YL = 275;//start y location of the red ball
	int BallSize = 40;
	int G_W = 800;//game width
	int G_H = 600;//game high
	int move = 15;//how fast the ball move in any time that key pressed
	int rect1 = 100;//obstacles high
	int rect2 = 20;//obstacles width
	
  
	public TheGame() {

		this.init();

	}

	public void init() {
  
		this.setFocusable(true);
		t.start();
		addKeyListener(this);
		
		
		this.setVisible(true);
		this.setSize(G_W, G_H);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.getContentPane().setBackground(Color.black);

	}

	public void paint(Graphics g) {
		super.paint(g);
		
		//initializ ball
		g.setColor(Color.red);
		g.fillOval(B_1_XL, B_1_YL, BallSize, BallSize);
		g.setColor(Color.blue);
		g.fillOval(B_2_XL, B_2_YL, BallSize, BallSize);
		

		//red obstacles
		g.setColor(Color.red);
		
		g.fillRect(140, 250, rect2, rect1);
		g.fillRect(250, 100, rect2, rect1);
		g.fillRect(400, 250, rect2, rect1);
		g.fillRect(500, 30, rect2, rect1);
		
		//blue obstacles
		g.setColor(Color.blue);
		
		g.fillRect(450, 200, rect1, rect2);
		g.fillRect(240, 300, rect1, rect2);
		g.fillRect(500, 500, rect1, rect2);
		g.fillRect(650,250, rect2, rect1);
		
		//initialize gates
		g.setColor(Color.blue);
		g.fillRect(0, 250, 50, 100);
		g.setColor(Color.red);
		g.drawRect(12, 260, 30,80);
		g.setColor(Color.red);
		g.fillRect(750,250, 50,100);
		g.setColor(Color.blue);
		g.drawRect(755, 260, 30,80);
		
		
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		//check collision off the red ball
		if(new Rectangle(B_1_XL,B_1_YL,BallSize,BallSize).intersects(new Rectangle(B_2_XL, B_2_YL, BallSize, BallSize))) {
			B_2_YL = -B_2_YL;
			B_2_XL = -B_2_XL;
			
			this.dispose();
			Wnner win = new Wnner();
		}

		
		if (new Rectangle(450, 200, rect1, rect2).intersects(new Rectangle(B_1_XL, B_1_YL, BallSize, BallSize))) {
			B_1_YL = -B_1_YL;
			B_1_XL = -B_1_XL;

			this.dispose();
			Wnner win = new Wnner();
		}
		if (new Rectangle(240, 300, rect1, rect2).intersects(new Rectangle(B_1_XL, B_1_YL, BallSize, BallSize))) {
			B_1_YL = -B_1_YL;
			B_1_XL = -B_1_XL;

			this.dispose();
			Wnner win = new Wnner();
		}
		if (new Rectangle(500, 500, rect1, rect2).intersects(new Rectangle(B_1_XL, B_1_YL, BallSize, BallSize))) {
			B_2_YL = -B_2_YL;
			B_2_XL = -B_2_XL;

			this.dispose();
			Wnner win = new Wnner();
		}
		if (new Rectangle(650, 250, rect2, rect1).intersects(new Rectangle(B_1_XL, B_1_YL, BallSize, BallSize))) {
			B_1_YL = -B_1_YL;
			B_1_XL = -B_1_XL;

			this.dispose();
			Wnner win = new Wnner();
		}
		
		
		//the blue gate check collision / winner
		if(new Rectangle(0,250,25,100).intersects(new Rectangle(B_1_XL, B_1_YL, BallSize, BallSize))) {
			B_1_YL = -B_1_YL;
			B_1_XL = -B_1_XL;
			
			this.dispose();
			theWinner winner = new theWinner();
		}
		

		//check collision of blue ball 
		if (new Rectangle(140, 250, rect2, rect1).intersects(new Rectangle(B_2_XL, B_2_YL, BallSize, BallSize))) {
			B_2_YL = -B_2_YL;
			B_2_XL = -B_2_XL;

			this.dispose();
			Wnner win = new Wnner();
		}
		if (new Rectangle(250, 100, rect2, rect1).intersects(new Rectangle(B_2_XL, B_2_YL, BallSize, BallSize))) {
			B_2_YL = -B_2_YL;
			B_2_XL = -B_2_XL;

			this.dispose();
			Wnner win = new Wnner();
		}
		if (new Rectangle(400, 250, rect2, rect1).intersects(new Rectangle(B_2_XL, B_2_YL, BallSize, BallSize))) {
			B_2_YL = -B_2_YL;
			B_2_XL = -B_2_XL;

			this.dispose();
			Wnner win = new Wnner();
		}
		if (new Rectangle(500, 30, rect2, rect1).intersects(new Rectangle(B_2_XL, B_2_YL, BallSize, BallSize))) {
			B_2_YL = -B_2_YL;
			B_2_XL = -B_2_XL;

			this.dispose();
			Wnner win = new Wnner();
		}
	
		//the red gate check collision / winner.
		if(new Rectangle(750,250,25,100).intersects(new Rectangle(B_2_XL, B_2_YL, BallSize, BallSize))) {
			B_2_YL = -B_2_YL;
			B_2_XL = -B_2_XL;
			
			this.dispose();
			theWinner winner = new theWinner();
		}
		repaint();

	}
	

	@Override
	public void keyTyped(KeyEvent e) {
		
	}

	
	@Override
	public void keyReleased(KeyEvent e) {

		
			}

	@Override
	public void keyPressed(KeyEvent e) {

		if (e.getKeyCode() == KeyEvent.VK_LEFT) {

			if (B_1_XL <= 5) {
				B_1_XL = 5;
			} else {
				B_1_XL = B_1_XL - move;
			}
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {

			if (B_1_XL >= G_W - BallSize) {
				B_1_XL = G_W - BallSize;
			} else {
				B_1_XL = B_1_XL + move;
			}
		}
		if (e.getKeyCode() == KeyEvent.VK_UP) {

			if (B_1_YL <= BallSize) {
				B_1_YL = BallSize;
			} else {
				B_1_YL = B_1_YL - move;
			}
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN) {

			if (B_1_YL >= G_H - BallSize) {
				B_1_YL = G_H - BallSize;
			} else {
				B_1_YL = B_1_YL + move;
			}
		}
		if (e.getKeyCode() == KeyEvent.VK_A) {

			if (B_2_XL <= 5) {
				B_2_XL = 5;
			} else {
				B_2_XL = B_2_XL - move;
			}
		}
		if (e.getKeyCode() == KeyEvent.VK_D) {

			if (B_2_XL >= G_W - BallSize) {
				B_2_XL = G_W - BallSize;
			} else {
				B_2_XL = B_2_XL + move;
			}
		}
		if (e.getKeyCode() == KeyEvent.VK_W) {

			if (B_2_YL <= BallSize) {
				B_2_YL = BallSize;
			} else {
				B_2_YL = B_2_YL - move;
			}
		}
		if (e.getKeyCode() == KeyEvent.VK_S) {

			if (B_2_YL >= G_H - BallSize) {
				B_2_YL = G_H - BallSize;
			} else {
				B_2_YL = B_2_YL + move;
			}
		}
	
	
		
	}
}
