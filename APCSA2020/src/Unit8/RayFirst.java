package Unit8;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayFirst
{
	public static boolean go(int[] ray)
	{
		for(int i = 1; i < ray.length; i++) {
			if(ray[0]==ray[i]) {
				return true;
			}
		}
		return false;
	}
}