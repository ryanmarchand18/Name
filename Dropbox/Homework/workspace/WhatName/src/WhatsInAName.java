import java.util.Scanner;
public class WhatsInAName {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char[] input = scan.nextLine().toCharArray();
		consonentFrequency(input);
		System.out.println(consonentFrequency(input));

	}
	//marco
	static char[] reverse() 
	{
		return null;
	}
	//damon
	static int vowel()
	{
		return 0;
		//REAL ACTUAL CHANGES
	}
	//Nicky
	static int consonentFrequency(char[] input) 
	{
		int consonents= 0;
		for (int i = 0; i < input.length; i++) 
		{
			if(input[i]!='a' && input[i]!= 'A' && input[i]!= 'e' && input[i]!='E' && input[i]!='i' && input[i]!= 'I' 
					&& input[i]!= 'o' && input[i]!= 'O' && input[i]!= 'u' && input[i]!= 'U')
			/*
			 
			 		input[i] == 'b' || input[i] == 'B' || input[i] == 'c' || input[i] == 'C' || input[i] == 'd' || 
					input[i] == 'D' || input[i] == 'f' || input[i] == 'F' || input[i] == 'g' || input[i] == 'G' 
					|| input[i] == 'h' || input[i] == 'H' || input[i] == 'j' || input[i] == 'J' || input[i] == 'k' 
					|| input[i] == 'K' || input[i] == 'l' || input[i] == 'L' || input[i] == 'm' || input[i] == 'M' 
					|| input[i] == 'n' || input[i] == 'N' || input[i] == 'p' || input[i] == 'P' || input[i] == 'q' 
					|| input[i] == 'Q' || input[i] == 'r' || input[i] == 'R' || input[i] == 's' || input[i] == 'S' 
					|| input[i] == 't' || input[i] == 'T' || input[i] == 'v' || input[i] == 'V' || input[i] == 'w' 
					|| input[i] == 'W' || input[i] == 'x' || input[i] == 'X' || input[i] == 'y' || input[i] == 'Y' 
					|| input[i] == 'z' || input[i] == 'Z'
			 */
			{
				consonents++;
			}
		}
		return consonents;
	}
	//Ryan
	static String firstName()
	{
		return null;
	}
	static String lastName()
	{
		return null;
	}
	static char[] middleName(char[] charrayM)
	{
		int i = 0;
		while(charrayM[i] != ' ')
		{
			i++;
		}
			
		
		char[] Middlename = new char[i];
		for (int j = 0; j < i; j++) {
			Middlename[j] = charrayM[j];
		}
	
		return Middlename;
	}
	static boolean hyphen()
	{
		return false;
	}
	static char[] lowerCase()
	{
		return null;
	}
	static char[] upperCase()
	{
		return null;
	}
	static char[] random()
	{
		return null;
	}
	static boolean palindrome()
	{
		return false;
	}
	static char[] sorted()
	{
		return null;
	}
	static char[] initials()
	{
		return null;
	}
	static boolean title()
	{
		return false;
	}
	static char[] strongSyllable()
	{
		return null;
	}

}
