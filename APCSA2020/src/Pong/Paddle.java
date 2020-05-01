package Pong;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Paddle extends Block
{
   //instance variables
   private int speed;

   public Paddle()
   {
	  super(10,10);
	  setWidth(10);
	  setHeight(10);
      speed = 5;
   }


   //add the other Paddle constructors
   public Paddle(int x, int y) 
   {
	   super(x,y);
	   setWidth(10);
		setHeight(10);
	   speed = 5;
   }
   
   public Paddle(int x, int y, int speed) 
   {
	   super(x,y);
	   setWidth(10);
	   setHeight(10);
	   this.speed = speed;
   }
   
   public Paddle(int x, int y, int width, int height, int speed) 
   {
	   super(x,y,width,height);
	   this.speed = speed;
   }

   public Paddle(int x, int y, int width, int height, Color col,int speed) 
   {
	   super(x, y, width, height, col);
	   this.speed = speed;
   }


   public void moveUpAndDraw(Graphics window)
   {
	   draw(window, Color.white);
	   setY(getY() - speed);
	   draw(window, super.getColor());
   }

   public void moveDownAndDraw(Graphics window)
   {
	   draw(window, Color.white);
	   setY(getY() + speed);
	   draw(window, super.getColor());
   }

   //add get methods
   public int getSpeed()
   {
	   return speed;
   }
   
   //add a toString() method
   public String toString() 
   {
	   return super.toString() + " " + speed;
   }
}