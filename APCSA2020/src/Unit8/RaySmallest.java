package Unit8;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RaySmallest
{
	public static int go(int[] ray)
	{
		int smallest = ray[0];;
		for(int i = 1; i < ray.length; i++) {
			if(smallest>ray[i]) {
				smallest = ray[i];
			}
		}
		return smallest;
	}
}