package application;

import java.util.Random;
import java.util.Scanner;

public class Valdle 
{
	static agentInfo phoenix = new agentInfo("Phoenix", "Male", "Duelist", "2020", "Europe", "Yes", "Yes");
	static agentInfo jett = new agentInfo("Jett", "Female", "Duelist", "2020", "Asia", "No", "No");
	static agentInfo sage = new agentInfo("Sage", "Female", "Sentinel", "2020", "Asia", "No", "No");
	static agentInfo sova = new agentInfo("Sova", "Male", "Initiator", "2020", "Asia", "No", "No");
	static agentInfo viper = new agentInfo("Viper", "Female", "Controller", "2020", "North America", "Yes", "No");
	static agentInfo cypher = new agentInfo("Cypher", "Male", "Sentinel", "2020", "Africa", "No", "No");
	static agentInfo reyna = new agentInfo("Reyna", "Female", "Duelist", "2020", "North America","No", "Yes");
	static agentInfo brimstone = new agentInfo("Brimstone", "Male", "Controller", "2020", "North America","Yes", "No");
	static agentInfo breach = new agentInfo("Breach", "Male", "Inititator", "2020", "Europe", "No", "Yes");
	static agentInfo killjoy = new agentInfo("Killjoy", "Female", "Sentinel", "2020", "Europe", "Yes", "No");
	static agentInfo raze = new agentInfo("Raze", "Female", "Duelist", "2020", "South America", "No", "No");
	static agentInfo skye = new agentInfo("Skye", "Female", "Initiator", "2020", "Australia", "No", "Yes");
	static agentInfo omen = new agentInfo("Omen", "Male", "Controller", "2020", "Unknown", "No", "Yes");
	static agentInfo yoru = new agentInfo("Yoru", "Male", "Duelist", "2021", "Asia", "No", "Yes");
	static agentInfo astra = new agentInfo("Astra", "Female", "Controller", "2021", "Africa", "No", "No");
	static agentInfo kayo = new agentInfo("Kayo", "Male", "Initiator", "2021", "Unknown", "Yes", "Yes");
	static agentInfo chamber = new agentInfo("Chamber", "Male", "Sentinel", "2021", "Europe", "No", "No");
	static agentInfo neon = new agentInfo("Neon", "Female", "Duelist", "2022", "Asia", "No", "No");
	static agentInfo fade = new agentInfo("Fade", "Female", "Initiator", "2022", "Asia", "No", "No");
	static agentInfo harbor = new agentInfo("Harbor", "Male", "Controller", "2023", "Asia", "No", "No");
	static agentInfo gekko = new agentInfo("Gekko", "Male", "Initiator", "2023", "North America", "Yes", "Yes");
	static agentInfo deadlock = new agentInfo("Deadlock", "Female", "Sentinel", "2023", "Europe", "No", "No");
	static agentInfo iso = new agentInfo("Iso", "Male", "Duelist", "2023", "Asia", "No", "No");

	static agentInfo[] totalAgents = {phoenix, jett, sage, sova, viper, cypher, reyna, brimstone, breach, killjoy,
			raze, skye, omen, yoru, astra, kayo, chamber, neon, fade, harbor, gekko, deadlock, iso};

	public static void main(String[] args) 
	{
		int attempts = 0;
		int attemptsUsed = 1;
		System.out.print("Welcome to Valdle. Your mission is to reveal the Golden Agent.\n"
				+ "You may obtain clues by guessing any agent at random, and uncovering the Golden Agent's identity based off of the information given the random agent.\n");
		attempts = selectDifficulty();
		System.out.println("You have " + attempts + " attempts.");

		int randomNumber = generateRandomNumber(0, 22);
		String userAgent = null;
		int t = 0;
		agentInfo goldenAgent = totalAgents[randomNumber];

		userAgent = getInput();

		while (t == 0) 
		{
			for (int i = 1; i <= 22; i++) 
			{
				if (userAgent.equals(totalAgents[i].name) == true) 
				{
					attempts--;
					attemptsUsed++;
					totalAgents[i].getInfo();
					goldenAgent.getRandomInfo(totalAgents[i], goldenAgent);
					System.out.println("\nYou have " + attempts + " attempt(s) remaining.");
					userAgent = getInput();

				} 
				else if (userAgent.equals(goldenAgent.name) == true) 
				{
					System.out.println("\nCongratulations, the Golden Agent was " + goldenAgent.name + "!"
							+ "\nIt took you " + attemptsUsed + " attempt(s) to guess correctly.");
					t = 1;
					break;
				} 
				else if (attempts == 1) 
				{
					System.out.println("\nSorry, you're out of attempts. The Golden Agent was " + goldenAgent.name + ".");
					t = 1;
					break;
				}
			}
		}
	}

	public static String getInput() 
	{
		String result = null;
		Scanner scan = new Scanner(System.in);
		int t = 0;

		while (t == 0) 
		{
			System.out.print("\nEnter a Valorant agent: ");
			result = scan.nextLine();
			for (int i = 0; i <= 22; i++) {
				if (result.equals(totalAgents[i].name) == true) 
				{
					t = 1;
				}
			}
		}
		return result;
	}

	public static int generateRandomNumber(int min, int max) 
	{
		Random random = new Random();
		return random.nextInt(max - min + 1) + min;
	}

	public static int selectDifficulty() 
	{
		int result = 0;
		int select;
		int o = 1;

		while (o == 1) 
		{
			System.out.print("\nSelect a difficulty. Easy(1) Medium(2) Hard(3): ");
			Scanner scan = new Scanner(System.in);
			select = scan.nextInt();
			if (select == 1) 
			{
				result = 5;
				o = 0;
			} 
			else if (select == 2) 
			{
				result = 3;
				o = 0;
			} 
			else if (select == 3) 
			{
				result = 2;
				o = 0;
			} 
			else 
			{
				System.out.println("\nPlease enter a valid number.");
				o = 1;
			}
		}
		return result;
	}
}