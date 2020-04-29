package Pong;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Block implements Locatable
{
	private int xPos;
	private int yPos;
	private int width;
	private int height;

	private Color color;

	public Block()
	{
		setX(1);
		setY(1);
		setWidth(5);
		setHeight(5);
		setColor(Color.blue);
	}

	//add other Block constructors - x , y , width, height, color
	
	public Block(int x, int y)
	{
		setX(x);
		setY(y);
	}
	
	public Block(int x, int y, Color c)
	{
		setX(x);
		setY(y);
		setColor(c);
	}
	
	public Block(int x, int y, int w, int h)
	{
		setX(x);
		setY(y);
		setWidth(w);
		setHeight(h);
		setColor(Color.black);
	}
	
	public Block(int x, int y, int w, int h, Color c)
	{
		setX(x);
		setY(y);
		setWidth(w);
		setHeight(h);
		setColor(c);
	}
	
	
	
	
	
	
	
	
	
	
	
   //add the other set methods
   
   public void setWidth(int w) 
   {
	   width = w;
   }
   
   public void setHeight(int h)
   {
	   height = h;
   }
   
   public void setColor(Color col)
   {
	   color = col;
   }

   public void draw(Graphics window)
   {
   	//uncomment after you write the set and get methods
      window.setColor(color);
      window.fillRect(getX(), getY(), getWidth(), getHeight());
   }

   public void draw(Graphics window, Color col)
   {
	   window.setColor(col);
	   window.fillRect(getX(), getY(), getWidth(), getHeight());
   }
   
	public boolean equals(Object obj)
	{
		Block b = (Block)obj;
		if(xPos == b.getX() && yPos == b.getY() && width == b.getWidth() && height == b.getHeight() && color.equals(b.getColor()))
		{
			return true;
		}
		return false;
	}

	@Override
	public void setPos(int x, int y) {
		// TODO Auto-generated method stub
		xPos = x;
		yPos = y;
	}

	@Override
	public void setX(int x) {
		// TODO Auto-generated method stub
		xPos = x;
	}

	@Override
	public void setY(int y) {
		// TODO Auto-generated method stub
		yPos = y;
	}

	@Override
	public int getX() {
		// TODO Auto-generated method stub
		return xPos;
	}

	@Override
	public int getY() {
		// TODO Auto-generated method stub
		return yPos;
	}   

   //add the other get methods
    public int getWidth()
    {
		return height;
    }
    
    public int getHeight()
    {
    	return height;
    }

    public Color getColor()
    {
    	return color;
    }
   //add a toString() method  - x , y , width, height, color
	public String toString() {
		return xPos + " " + yPos + " " + width + " " + height + " " + color;
	}
}