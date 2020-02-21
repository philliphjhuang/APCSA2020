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
		
		Random rand = new Random();
		
		
		char response = 'y';
		
		//add in a do while loop after you get the basics up and running
		while(response=='y') {
			Scanner keyboard = new Scanner(System.in);
			String playerWeapon = "";
			String CPUWeapon = "";
			System.out.print("Rock-Paper-Scissors - pick your weapon[R,P,S] :: ");
			playerWeapon = keyboard.nextLine();
			System.out.println("player had " + playerWeapon);
			int x = rand.nextInt(2);
			if(x==0) {
				CPUWeapon = "R";
			} else if(x==1) {
				CPUWeapon = "P";
			} else {
				CPUWeapon = "S";
			}
			System.out.println("computer had " + CPUWeapon);
			//read in the player value
			RockPaperScissors game = new RockPaperScissors();	
			game.setPlayers(playerWeapon);
			game.setComp(CPUWeapon);
			game.determineWinner();
			System.out.println(game.toString() + "\n");
			
			System.out.print("Do you want to play again?(y/n) ");
			response = keyboard.next().charAt(0);
			System.out.print("\n");
		}
	}
}
/*-------------------------------------------result-----------------------------------------
Rock-Paper-Scissors - pick your weapon[R,P,S] :: R
player had R
computer had P
!Computer wins <<Papers Cover Rocks>>!

Do you want to play again?(y/n) y

Rock-Paper-Scissors - pick your weapon[R,P,S] :: R
player had R
computer had R
!Draw Game!

Do you want to play again?(y/n) y

Rock-Paper-Scissors - pick your weapon[R,P,S] :: P
player had P
computer had R
!Player wins <<Papers Cover Rocks>>!

Do you want to play again?(y/n) y

Rock-Paper-Scissors - pick your weapon[R,P,S] :: P
player had P
computer had P
!Draw Game!

Do you want to play again?(y/n) y

Rock-Paper-Scissors - pick your weapon[R,P,S] :: S
player had S
computer had P
!Player wins <<Scissors Cut Papers>>!

Do you want to play again?(y/n) y

Rock-Paper-Scissors - pick your weapon[R,P,S] :: S
player had S
computer had P
!Player wins <<Scissors Cut Papers>>!

Do you want to play again?(y/n) y

Rock-Paper-Scissors - pick your weapon[R,P,S] :: S
player had S
computer had R
!Computer wins <<Rocks Break Scissors>>!

Do you want to play again?(y/n) y

Rock-Paper-Scissors - pick your weapon[R,P,S] :: S
player had S
computer had R
!Computer wins <<Rocks Break Scissors>>!

Do you want to play again?(y/n) n

*/