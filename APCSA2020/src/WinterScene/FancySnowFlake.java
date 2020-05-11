package WinterScene;
//(c) A+ Computer Science

//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

//extend the AbstractShape class to make a FancySnowFlake class
public class FancySnowFlake extends AbstractShape {

	public FancySnowFlake(int x, int y, int wid, int ht) {
		super(x, y, wid, ht);
	}

	public FancySnowFlake(int x, int y, int wid, int ht, Color col, int xspd, int yspd) {
		super(x, y, wid, ht, col, xspd, yspd);
	}

	@Override
	public void draw(Graphics window) {
		window.setColor(super.getColor());
		window.fillRect(super.getXPos(), super.getYPos(), getWidth(), getHeight());
	}

	public void draw(Graphics window, Color col) {
		int x1  = (int)(42 /10*super.getWidth());
		int x2  = (int)(52 /10*super.getWidth());
		int x3  = (int)(72 /10*super.getWidth());
		int x4  = (int)(59 /10*super.getWidth());
		int x5  = (int)(65 /10*super.getWidth());
		int x6  = (int)(42 /10*super.getWidth());
		int x7  = (int)(23 /10*super.getWidth());
		int x8  = (int)(35 /10*super.getWidth());
		int x9  = (int)(12 /10*super.getWidth());
		int x10 = (int)(32 /10*super.getWidth());
		int x11 = (int)(42 /10*super.getWidth());
		
		int y1  = (int)(38 /10*super.getWidth());
		int y2  = (int)(62 /10*super.getWidth());
		int y3  = (int)(62 /10*super.getWidth());
		int y4  = (int)(75 /10*super.getWidth());
		int y5  = (int)(105/10*super.getWidth());
		int y6  = (int)(85 /10*super.getWidth());
		int y7  = (int)(105/10*super.getWidth());
		int y8  = (int)(75 /10*super.getWidth());
		int y9  = (int)(62 /10*super.getWidth());
		int y10 = (int)(62 /10*super.getWidth());
		int y11 = (int)(38 /10*super.getWidth());
		
		window.setColor(col);
		int x[] = {super.getXPos() + x1, super.getXPos() + x2, super.getXPos() + x3, super.getXPos() + x4, super.getXPos() + x5, super.getXPos() + x6, super.getXPos() + x7, super.getXPos() + x8, super.getXPos() + x9, super.getXPos() + x10, super.getXPos() + x11};
        int y[] = {super.getYPos() + y1, super.getYPos() + y2, super.getYPos() + y3, super.getYPos() + y4, super.getYPos() + y5, super.getYPos() + y6, super.getYPos() + y7, super.getYPos() + y8, super.getYPos() + y9, super.getYPos() + y10, super.getYPos() + y11};
		int z = x.length;
		window.drawPolygon(x, y, z);
	}

	@Override
	public void moveAndDraw(Graphics window) {
		// TODO Auto-generated method stub
		// draw(window, Color.white);
		super.setYPos(super.getYPos() + super.getYSpeed());
		draw(window, new Color(255,215,0));
	}

}