package Pong;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block implements Collidable
{
	private int xSpeed;
	private int ySpeed;

	public Ball()
	{
		super(200, 200);
		xSpeed = 3;
		ySpeed = 1;
		setWidth(10);
		setHeight(10);
	}

	//add the other Ball constructors
	public Ball(int x, int y)
	{
		super(x,y);
		setXSpeed(3);
		setYSpeed(1);
		setWidth(10);
		setHeight(10);
	}
	
	public Ball(int x, int y, int w, int h)
	{
		super(x,y,w,h);
		setXSpeed(3);
		setYSpeed(1);
	}
	
	public Ball(int x, int y, int w, int h, Color c) 
	{
		super(x,y,w,h,c);
		setXSpeed(3);
		setYSpeed(1);
	}
	
	public Ball(int x, int y, int w, int h, int xS, int yS) {
		super(x,y,w,h);
		setXSpeed(xS);
		setYSpeed(yS);
	}
	
	public Ball(int x, int y, int w, int h, Color c, int xs, int ys)
	{
		super(x,y,w,h,c);
		setXSpeed(xs);
		setYSpeed(ys);
	}
	
   //add the set methods
   public void setXSpeed(int xSpeed)
   {
	   this.xSpeed = xSpeed;
   }

   public void setYSpeed(int ySpeed)
   {
	   this.ySpeed = ySpeed;
   }
   
   public void moveAndDraw(Graphics window)
   {
   	//draw a white ball at old ball location
	   draw(window, Color.white);
	   
	   setX(getX() + xSpeed);
		//setY
	   setY(getY() + ySpeed);
		//draw the ball at its new location
	   draw(window, super.getColor());
   }
   
	public boolean equals(Object obj)
	{
		Ball ba = (Ball)obj;
		if(xSpeed == ba.getXSpeed() && ySpeed == ba.getYSpeed())
		{
			return true;
		}
		return false;
	}   
	public void resetBall(Graphics window) {
		draw(window, Color.white);
		setX(300);
		setY(300);
		setXSpeed(2);
		setYSpeed(2);
	}
	
   //add the get methods
	public int getXSpeed() 
	{
		return xSpeed;
	}
	
	public int getYSpeed()
	{
		return ySpeed;
	}
   //add a toString() method
	public String toString()
	{
		return super.toString() + " " + xSpeed + " " + ySpeed;
	}
	
	
	@Override
	public boolean didCollideLeft(Object obj) {
		// TODO Auto-generated method stub
		Block b = (Block)obj;
		if(getX() <= b.getX()+b.getWidth())
			return true;
		return false;
	}

	@Override
	public boolean didCollideRight(Object obj) {
		// TODO Auto-generated method stub
		Block b = (Block)obj;
		if(getX()+getWidth() >= b.getX())
			return true;
		return false;
	}

	@Override
	public boolean didCollideTop(Object obj) {
		// TODO Auto-generated method stub
		Block b = (Block)obj;
		if(getY() <= b.getY())
			return true;
		return false;
	}

	@Override
	public boolean didCollideBottom(Object obj) {
		// TODO Auto-generated method stub
		Block b = (Block)obj;
		if(getY() >= b.getY()+b.getHeight())
			return true;
		return false;
	}
}