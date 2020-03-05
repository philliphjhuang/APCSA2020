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
		loadToys("");
	}

	public ToyStore(String toys) {
		toyList = new ArrayList<Toy>();
        for (String t: toys.split(" ")){
            loadToys(t);
        }
	}
	
	public void loadToys( String toys )
	{
		Toy that = getThatToy(toys);
        if (that == null){
            toyList.add(new Toy(toys));
        } else{
            that.setCount(that.getCount()+1);
        }
	}
  
  	public Toy getThatToy(String nm)
  	{
  		for(int i = 0; i < toyList.size(); i++) {
            if (toyList.get(i).getName().equals(nm)){
                return toyList.get(i);
            }
        }
        return null;
  	}
  
  	public String getMostFrequentToy()
  	{
  		Toy max = toyList.get(0);
  		int m = 0;
        for(int i = 0; i < toyList.size(); i++) {
            m = toyList.get(0).getCount();
            if (toyList.get(i).getCount()>m){
                max = toyList.get(i);
                m = toyList.get(i).getCount();
                
            }
        }
        return max.getName();
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