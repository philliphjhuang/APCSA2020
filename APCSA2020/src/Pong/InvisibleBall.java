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

	public InvisibleBall(int x, int y, int w, int h) {
		super(x, y, w, h);
	}

	public InvisibleBall(int x, int y, int w, int h, Color c) {
		super(x, y, w, h, c);
	}

	public InvisibleBall(int x, int y, int w, int h, int xS, int yS) {
		super(x, y, w, h, xS, yS);
	}

	public InvisibleBall(int x, int y, int w, int h, Color c, int xS, int yS) {
		super(x, y, w, h, c, xS, yS);
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