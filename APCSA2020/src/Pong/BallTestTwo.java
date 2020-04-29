package Pong;
//(c) A+ Computer Science

//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class BallTestTwo extends Canvas implements Runnable {
	private Ball[] balls = new Ball[5];

	public BallTestTwo() {
		setBackground(Color.WHITE);
		setVisible(true);

		// instantiate a new Ball
		Ball zero = new Ball();
		// test the Ball thoroughly
		balls[0] = zero;

		// test all constructors
		Ball one = new Ball(20, 20);
		balls[1] = one;

		Ball two = new Ball(30, 30, 30, 30);
		balls[2] = two;

		Ball three = new Ball(10, 10, 10, 10, Color.RED);
		balls[3] = three;

		Ball four = new Ball(15, 15, 15, 15, Color.blue, 2, 2);
		balls[4] = four;

		new Thread(this).start();
	}

	public void update(Graphics window) {
		paint(window);
	}

	public void paint(Graphics window) {
		for (Ball ball : balls) {
			ball.moveAndDraw(window);

			if (!(ball.getX() >= 10 && ball.getX() <= 550)) {
				ball.setXSpeed(-ball.getXSpeed());
			}

			if (!(ball.getY() >= 10 && ball.getY() <= 450)) {
				ball.setYSpeed(-ball.getYSpeed());
			}
		}
	}

	public void run() {
		try {
			while (true) {
				Thread.currentThread().sleep(19);
				repaint();
			}
		} catch (Exception e) {
		}
	}
}