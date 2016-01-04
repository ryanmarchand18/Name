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
			i++;
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