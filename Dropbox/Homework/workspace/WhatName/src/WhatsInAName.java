import java.util.*;
public class WhatsInAName {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char[] input = scan.nextLine().toCharArray();
		vowel(input);
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
	static String firstName()
	{
		return null;
	}
	static String lastName()
	{
		return null;
	}
	static String middleName()
	{
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