package Unit3;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Phillip Huang
//Date - 02/05/2020
//Class - Period 2
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class MilesPerHour
{
	private int distance, hours, minutes;
	private double mph;

	public MilesPerHour()
	{
		setNums(0,0,0);
		mph=0.0;
	}

	public MilesPerHour(int dist, int hrs, int mins)
	{
		
	}

	public void setNums(int dist, int hrs, int mins)
	{
		distance = dist;
		hours = hrs;
		minutes = mins;
	}  

	public void calcMPH()
	{
		mph = distance/(hours+(double)minutes/60);
	}

	public void print()
	{
		
	}
	
	//create a print or toString or both
	
	public String toString()
	{
		return "\n"+distance+" miles in "+hours+" hours and "+minutes+" minutes = "+Math.round(mph)+" MPH.\n\n\n";
	}
}