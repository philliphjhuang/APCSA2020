package WinterScene;
//(c) A+ Computer Science

//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Tree extends AbstractShape {
	public Tree(int x, int y, int w, int h) {
		super(x, y, w, h, Color.WHITE, 0, 0);
	}

	public void draw(Graphics window) {
		int[] x = { super.getXPos(), (int) (super.getXPos() + 125), (int) (super.getXPos() - 125) };
		int[] y = { super.getYPos(), super.getYPos() +100, super.getYPos() + 100 };
		int z = x.length;
		window.setColor(Color.green);
		window.fillPolygon(x, y, z);
	}

	public void draw(Graphics window, Color col) {
		int[] x = { super.getXPos(), (int) (super.getXPos() + 125), (int) (super.getXPos() - 125) };
		int[] y = { super.getYPos()-100, super.getYPos() +100, super.getYPos() +100 };
		int z = x.length;
		window.setColor(new Color(139,69,19));
		window.fillRect(super.getXPos()-25, super.getYPos()+40, 50, 100);
		window.setColor(col);
		window.fillPolygon(x, y, z);
	}
	
	public void drawLight(Graphics window, Color col) {
		window.setColor(col);
		for(int i = 0; i < 20 ; i++) {
			int x = (int)(Math.random()*200);
			int y = (int)(Math.random()*175);
			window.fillOval(super.getXPos()-100+x, super.getYPos()-100+y, 10, 10);
		}
		window.setColor(Color.yellow);
		int[] x = {210+40,210+48,210+69,210+50,210+63,210+40,210+15,210+28,210+9,210+32,210+40};
		int[] y = {32+13 ,60+13 ,60+13 ,75+13 ,105+13,85+13 ,105+13,75+13 ,60+13,60+13 ,32+13};
		window.fillPolygon(x , y, 11);
	}

	public void moveAndDraw(Graphics window) {
		draw(window, new Color(0, 100, 0));
		int r = (int)(Math.random()*256);	
		int g = (int)(Math.random()*256);
		int b = (int)(Math.random()*256);
		drawLight(window, new Color(r,g,b));
	}
	
}