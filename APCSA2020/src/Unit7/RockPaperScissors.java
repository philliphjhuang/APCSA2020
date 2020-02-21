package Unit7;
//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Random;
import java.util.Scanner;
import static java.lang.System.*;

public class RockPaperScissors
{
	private String playChoice;
	private String compChoice;
	
	public RockPaperScissors()
	{
	}

	public RockPaperScissors(String player)
	{
		
	}

	public void setPlayers(String player)
	{
		playChoice = player;
	}
	
	public void setComp(String computer) 
	{
		compChoice = computer;
	}
	
	public String determineWinner()
	{
		String winner="";
		if(playChoice.equals("R")) {
			if(compChoice.equals("P")) {
				winner = "Computer";
			} else if(compChoice.equals("S")) {
				winner = "Player";
			}
		} else if(playChoice.equals("P")) {
			if(compChoice.equals("S")) {
				winner = "Computer";
			} else if(compChoice.equals("R")) {
				winner = "Player";
			}
		} else if(playChoice.equals("S")) {
			if(compChoice.equals("R")) {
				winner = "Computer";
			} else if(compChoice.equals("P")) {
				winner = "Player";
			}
		}
		return winner;
	}

	public String toString()
	{
		String output = "";
		if(determineWinner().equals("Player")) {
			if(playChoice.equals("S")) {
				output= "!Player wins <<Scissors Cut Papers>>!";
			} else if(playChoice.equals("R")) {
				output= "!Player wins <<Rocks Break Scissors>>!";
			} else if(playChoice.equals("P")) {
				output= "!Player wins <<Papers Cover Rocks>>!";
			}
		} else if(determineWinner().equals("Computer")) {
			if(compChoice.equals("S")) {
				output= "!Computer wins <<Scissors Cut Papers>>!";
			} else if(compChoice.equals("R")) {
				output= "!Computer wins <<Rocks Break Scissors>>!";
			} else if(compChoice.equals("P")) {
				output= "!Computer wins <<Papers Cover Rocks>>!";
			}
		} else if(determineWinner().equals("")) {
			output= "!Draw Game!";
		}
		return output;
	}
}