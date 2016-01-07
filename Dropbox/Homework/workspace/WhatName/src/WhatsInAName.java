import java.util.*;
public class WhatsInAName {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char[] input = scan.nextLine().toCharArray();
		vowel(input);
		firstName(input);
		System.out.println(firstName(input));
	}
	//marco
	static char[] reverse() 
	{
		return null;
	}
	//damon
	static int vowel(char[] charray){
		int vowelnum = 0;
		for(int i = 0; i < charray.length; i++){
			if(charray[i] == 'a' || charray[i] == 'e' || charray[i] == 'i' || charray[i] == 'o' || charray[i] == 'u'){
				vowelnum++;
			}
		}
		return vowelnum;
	}
	//Nicky
	static int consonentFrequency()
	{
		return 0;
	}
	//Ryan
	static char[] firstName(char[] charray)
	{
		int i = 0;
		while(charray[i] != ' ')
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
			
		
		char[] Firstname = new char[i];
		for (int j = 0; j < i; j++) {
			Firstname[j] = charray[j];
		}
	
		return Firstname;
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
	
		return null;
	}
	static boolean hyphen(char[] input)
	{
		boolean hyphen = false;
		for (int i = 0; i < input.length; i++) 
		{
			if (input[i] == '-')
			{
				hyphen = true;
			}
		}
		if (hyphen == false)
		{
			return false;
		}
		else
		{
			return true;
		}
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