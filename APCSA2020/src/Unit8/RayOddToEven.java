package Unit8;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayOddToEven
{
	public static int go(int[] ray)
	{
		for(int i = 0; i < ray.length; i++) {
			if((ray[i]%2)==1) {
				for(int j = i; j < ray.length; j++) {
					if((ray[j]%2)==0) {
						return j-i;
					}
				}
			}
		}
		return -1;
	}
}