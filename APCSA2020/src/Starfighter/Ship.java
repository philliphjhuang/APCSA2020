package Starfighter;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.net.URL;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.imageio.ImageIO;

public class Ship extends MovingThing
{
	private int speed;
	private Image image;

	public Ship()
	{
		this(10, 10, 10, 10, 10);
	}

	public Ship(int x, int y)
	{
	   //add code here
		this(x, y, 10, 10, 10);
	}

	public Ship(int x, int y, int s)
	{
	   //add code here
		this(x, y, 10, 10, s);
	}

	public Ship(int x, int y, int w, int h, int s)
	{
		super(x, y, w, h);
		speed=s;
		try
		{
			URL url = getClass().getResource("ship.jpg");
			image = ImageIO.read(url);
		}
		catch(Exception e)
		{
			//feel free to do something here
			System.out.println("No Ship Image");
		}
	}

	public void setImage(String directory) {
		try
		{
			URL url = getClass().getResource(directory);
			image = ImageIO.read(url);
		}
		catch(Exception e)
		{
			System.out.println("No Image");
		}
	}

	public void setSpeed(int s)
	{
	   //add more code
		speed = s;
	}

	public int getSpeed()
	{
	   return speed;
	}

	public void move(String direction)
	{
		//add code here
		if(direction.equals("RIGHT")) 
		{
			setX(getX() + speed);
			if(getX()>=700) {
				setX(700);
			}
		}
		
		if(direction.equals("LEFT"))
		{
			setX(getX() - speed);
			if(getX()<=-10) {
				setX(-10);
			}
		}
		
		if(direction.equals("UP"))
		{
			setY(getY() - speed);
			if(getY()<=0) {
				setY(0);
			}
		}
		
		if(direction.equals("DOWN"))
		{
			setY(getY() + speed);
			if(getY()>=450) {
				setY(450);
			}
		}
		
	}

	public boolean hitByAlien(Object o) {
		Alien a = (Alien) o;
		
		if (this.getX() + this.getWidth() > a.getX() && this.getX() < a.getX() + a.getWidth()) {
			if (this.getY() < a.getY() + a.getHeight() && this.getY() + this.getHeight() > a.getY()) {
				return true;
			}
		}
		
		return false;
	}
	
	public void draw( Graphics window )
	{
		window.drawImage(image,getX(),getY(),getWidth(),getHeight(),null);
	}

	public String toString()
	{
		return super.toString() + getSpeed();
	}
}
