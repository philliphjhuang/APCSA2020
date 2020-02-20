package Unit7;
//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import java.util.Random;
import static java.lang.System.*;

public class RPSRunner
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		Random rand = new Random();
		
		
		char response = 'y';
		String playerWeapon;
		String CPUWeapon;
		//add in a do while loop after you get the basics up and running
		while(response=='y') {
			String player = "";
			playerWeapon = keyboard.nextLine();
			out.print("Rock-Paper-Scissors - pick your weapon[R,P,S] :: " + playerWeapon);
			out.println("player had " + playerWeapon);
			int x = rand.nextInt(2);
			if(x==0) {
				CPUWeapon = "R";
			} else if(x==1) {
				CPUWeapon = "P";
			} else {
				CPUWeapon = "S";
			}
			out.println("computer has " + CPUWeapon);
			//read in the player value
			RockPaperScissors game = new RockPaperScissors();	
			game.setPlayers(playerWeapon);
			game.setComp(CPUWeapon);
			
			
			System.out.print("Do you want to play again? ");
			response = keyboard.next().charAt(0);
		}
	}
}



