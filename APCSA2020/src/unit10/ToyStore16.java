package unit10;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Phillip Huang

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStore16
{
	private ArrayList<Toy> toyList;
	
	public ToyStore16()
	{
		toyList = new ArrayList<Toy>();
	}

	public String myName(){
		return "Phillip Huang";
	}
	
	public ToyStore16(String toys) {
		toyList = new ArrayList<Toy>();
        for (String t: toys.split(" ")){
            loadToys(t);
        }
	}
	
	public void loadToys( String toys )
	{
		String [] toysArr = toys.split(" ");
		for (String toyStr : toysArr) {
			Toy toy = getThatToy(toyStr);
			if (toy != null) {
				toy.setCount(toy.getCount()+1);
			}
			else {
				toyList.add(new Toy(toyStr));
			}
		}
	}
  
  	public Toy getThatToy(String nm)
  	{
  		for (Toy toy : toyList) {
  			if (toy.getName().equals(nm))
  				return toy;
  		}
  		return null;
  	}
  
  	public String getMostFrequentToy()
  	{
  		int mostToyCount = 0;
  		String mostToyName = "";
  		for (int i=0; i<toyList.size(); i++) {
  			if (toyList.get(i).getCount() > mostToyCount) {
  				mostToyCount = toyList.get(i).getCount();
  				mostToyName = toyList.get(i).getName();
  			}
  		}
  		return mostToyName;
  	}
  
  	public void sortToysByCount()
  	{
  		Collections.sort(toyList, Collections.reverseOrder());
  	}  
  	  
	public String toString()
	{ 
		return toyList+"\n"+"max == " + getMostFrequentToy();
	}
}