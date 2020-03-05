package unit10;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStore
{
	private ArrayList<Toy> toyList;

	public ToyStore()
	{
	}

	public void loadToys( String toys )
	{
		toyList.add(getThatToy(toys));
	}
  
  	public Toy getThatToy( String nm )
  	{
  		Toy a = new Toy(nm);
  		return a;
  	}
  
  	public String getMostFrequentToy()
  	{
  		
  		return "";
  	}  
  
  	public void sortToysByCount()
  	{
  		for(int i = 0 ; i < toyList.size()-1; i++) {
  			for(int j = 1; j < toyList.size()-i-1; j++) {
  				if(toyList.get(i).getCount()<toyList.get(j).getCount()) {
  					int temp = 
  				}
  			}
  		}
  	}  
  	  
	public String toString()
	{
	   return "";
	}
}