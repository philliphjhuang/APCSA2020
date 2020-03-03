package unit11;
//(c) A+ Computer Science

//www.apluscompsci.com
//Name -

import java.util.Arrays;

public class Doggies {
	private Dog[] pups;

	public Doggies(int size) {
		// point pups at a new array of Dog
		pups = new Dog[size];
	}

	public void set(int spot, int age, String name) {
		// put a new Dog in the array at spot
		// make sure spot is in bounds
		if (spot < pups.length) {
			pups[spot] = new Dog(age, name);
		} else {
			System.out.println("No more space");
		}
	}

	public String getNameOfOldest() {
		int oldestAge = pups[0].getAge();
		String oldestName = "";
		for(int i = 1 ; i < pups.length; i++) {
			if(pups[i].getAge()>oldestAge) {
				oldestAge = pups[i].getAge();
				oldestName = pups[i].getName();
			}
		}
		return oldestName;
	}

	public String getNameOfYoungest() {
		int youngestAge = pups[0].getAge();
		String youngestName = "";
		for(int i = 0 ; i < pups.length; i++) {
			if(pups[i].getAge()<youngestAge) {
				youngestAge = pups[i].getAge();
				youngestName = pups[i].getName();
			}
		}
		return youngestName;
	}

	public String toString() {
		return "" + Arrays.toString(pups);
	}
}