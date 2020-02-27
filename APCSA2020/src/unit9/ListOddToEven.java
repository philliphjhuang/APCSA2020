package unit9;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.ArrayList;
import java.util.List;

public class ListOddToEven
{
	public static int go( List<Integer> ray )
	{
		int firstOddPosition = -1;
		int lastEvenPosition = -1;
		for(int i = 0; i < ray.size(); i++) {
			if((ray.get(i) % 2) == 1) {
				firstOddPosition = i;
				for(int j = i; j < ray.size(); j++) {
					if((ray.get(j) % 2) == 0) {
						lastEvenPosition = j;
					}
				}
				break;
			} 
		}
		if(firstOddPosition == -1 || lastEvenPosition == -1) {
			return -1;
		}
		return lastEvenPosition - firstOddPosition;
	}
}