package dataLab;

import java.util.ArrayList;

public class CerealRunner {
	public static void main(String [] args)
	{
		ArrayList<Cereal> clist = new ArrayList<Cereal>();
		clist.add(new Cereal("100% Bran",5,4));
		clist.add(new Cereal("100% Natural Bran",8,3));
		clist.add(new Cereal("All-Bran",7,4));
		clist.add(new Cereal("All-Bran with Extra Fiber",8,4));
		clist.add(new Cereal("Almond Delight",14,2));
		clist.add(new Cereal("Apple Cinnamon Cheerios",10,2));
		clist.add(new Cereal("Apple Jacks",11,2));
		clist.add(new Cereal("Basic 4",18,3));
		clist.add(new Cereal("Bran Chex",15,2));
		clist.add(new Cereal("Bran Flakes",13,3));
		Cereal best = clist.get(0);
		for (Cereal i: clist) {
			double ratio = i.getCarbs()/i.getProtein();
			double bestRatio = best.getCarbs()/best.getProtein();
			if (ratio < bestRatio) {
				best = i;
			}
		}
		for(Cereal c: clist) {
			System.out.println(c);
		}
		System.out.println("The best cereal for low carbs and high protein is: " + best);
	}
}