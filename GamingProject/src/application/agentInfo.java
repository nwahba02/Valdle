package application;

public class agentInfo 
{
	String name;
	String gender;
	String role;
	String releaseDate;
	String continent;
	String molly;
	String flash;

	agentInfo(String name, String gender, String role, String releaseDate, String continent, String molly, String flash) 
	{
		this.name = name;
		this.gender = gender;
		this.role = role;
		this.releaseDate = releaseDate;
		this.continent = continent;
		this.molly = molly;
		this.flash = flash;
	}

	public void getInfo() 
	{
		System.out.println("\n" + name.toUpperCase() + "\n---------\nGender: " + gender + "\nRole: " + role + "\nReleased: " + releaseDate + "\nOrigin: " + continent + "\nMolotov: " + molly + "\nFlash: " + flash);
	}

	public void getRandomInfo(agentInfo user, agentInfo golden) 
	{
		
		System.out.println("\nGolden Agent\n------------");
		
		if (user.gender.equals(golden.gender)) 
		{
			System.out.println("Gender: " + user.gender);
		} 
		else 
		{
			System.out.println("Gender: Classified");
		}
		if (user.role.equals(golden.role)) 
		{
			System.out.println("Role: " + user.role);
		} 
		else 
		{
			System.out.println("Role: Classified");
		}
		if (user.releaseDate.equals(golden.releaseDate)) 
		{
			System.out.println("Released: " + user.releaseDate);
		} 
		else 
		{
			System.out.println("Released: Classified");
		}
		if (user.continent.equals(golden.continent)) 
		{
			System.out.println("Origin: " + user.continent);
		} 
		else 
		{
			System.out.println("Origin: Classified");
		}
		if (user.molly.equals(golden.molly) && golden.molly.equals("Yes")) 
		{
			System.out.println("Molotov: Yes");
		} 
		else if (user.molly.equals(golden.molly) && golden.molly.equals("No")) 
		{
			System.out.println("Molotov: No");
		} 
		else if (golden.molly.equals("Yes")) 
		{
			System.out.println("Molotov: Yes");
		}
		else if (golden.molly.equals("No")) 
		{
			System.out.println("Molotov: No");
		}
		if (user.flash.equals(golden.flash) && golden.flash.equals("Yes")) 
		{
			System.out.println("Flash: Yes");
		} 
		else if (user.flash.equals(golden.flash) && golden.flash.equals("No"))
		{
			System.out.println("Flash: No");
		} 
		else if (golden.flash.equals("Yes")) 
		{
			System.out.println("Flash: Yes");
		} 
		else if (golden.flash.equals("No")) 
		{
			System.out.println("Flash: No");
		}
	}
}