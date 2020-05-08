package WinterScene;
//(c) A+ Computer Science

//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class SnowMan extends AbstractShape {
	public SnowMan(int x, int y, int w, int h) {
		super(x, y, w, h, Color.WHITE, 0, 0);
	}

	public void draw(Graphics window) {
		// add code here to make a snowman
		window.setColor(Color.white);
		window.fillOval(super.getXPos() + 20, super.getYPos() - 50, super.getWidth() - 25, super.getHeight() - 25);
		window.fillOval(super.getXPos() + 10, super.getYPos() + 15, super.getWidth(), super.getHeight());
		window.fillOval(super.getXPos() - 10, super.getYPos() + 100, super.getWidth() + 40, super.getHeight() + 40);
		window.setColor(Color.black);
		window.fillOval(super.getXPos() + 35, super.getYPos() - 35, super.getWidth() - 85, super.getHeight() - 85);
		window.fillOval(super.getXPos() + 65, super.getYPos() - 35, super.getWidth() - 85, super.getHeight() - 85);
		window.fillOval(super.getXPos() + 50, super.getYPos() - 5, super.getWidth() - 85, super.getHeight() - 85);
	}

	public void moveAndDraw(Graphics window) {
		draw(window);
	}
}