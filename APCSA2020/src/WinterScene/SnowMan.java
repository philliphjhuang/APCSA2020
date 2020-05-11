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
		window.fillOval(super.getXPos() + 50, super.getYPos() - 50 , super.getWidth() + 40, super.getHeight() - 25);
		window.fillOval(super.getXPos() + 30, super.getYPos() + 15 , super.getWidth() + 80 , super.getHeight());
		window.fillOval(super.getXPos() - 10, super.getYPos() + 100, super.getWidth() + 160, super.getHeight() + 40);
		window.setColor(Color.black);
		window.fillOval(super.getXPos() + 90, super.getYPos() - 35, super.getWidth() - 85, super.getHeight() - 85);
		window.fillOval(super.getXPos() + 140, super.getYPos() - 35, super.getWidth() - 85, super.getHeight() - 85);
		window.fillOval(super.getXPos() + 120, super.getYPos() , super.getWidth() - 95, super.getHeight() - 95);
		window.fillRect(super.getXPos()+90, super.getYPos()-118, 50, 50);
		window.fillRect(super.getXPos()+40, super.getYPos()-60, 150, 10);
		window.setColor(Color.orange);
		window.fillRect(super.getXPos()+90, super.getYPos()-67, 50, 7);
		int[] x = {super.getXPos() +125, super.getXPos() + 125, super.getXPos()};
		int[] y = {super.getYPos() - 5, super.getYPos() - 20 , super.getYPos()-12};
		window.fillPolygon(x, y, 3);
	}

	public void moveAndDraw(Graphics window) {
		draw(window);
	}
}