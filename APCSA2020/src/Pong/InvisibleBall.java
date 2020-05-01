package Pong;

import java.awt.Color;
import java.awt.Graphics;

public class InvisibleBall extends Ball {

	// constructors
	public InvisibleBall() {
		super();
	}

	public InvisibleBall(int x, int y) {
		super(x, y);
	}

	public InvisibleBall(int x, int y, int wid, int ht) {
		super(x, y, wid, ht);
	}

	public InvisibleBall(int x, int y, int wid, int ht, Color c) {
		super(x, y, wid, ht, c);
	}

	public InvisibleBall(int x, int y, int wid, int ht, int xSpd, int ySpd) {
		super(x, y, wid, ht, xSpd, ySpd);
	}

	public InvisibleBall(int x, int y, int wid, int ht, Color col, int xSpd, int ySpd) {
		super(x, y, wid, ht, col, xSpd, ySpd);
	}

	public void setInvisible() {
		if (randomChance() > 200)
			super.setColor(Color.white);
		else
			super.setColor(Color.blue);
	}

	public int randomChance() {
		int r = (int) (Math.random() * 256);
		return r;
	}

	public void moveAndDraw(Graphics window) {
		setInvisible();
		super.moveAndDraw(window);
	}
}