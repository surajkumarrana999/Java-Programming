import java.util.*;
class Check_the_letter_is_vowel_or_not
{
	public static void main(String args[])
	{
		Scanner i=new Scanner(System.in);
		char ch;
		System.out.println("Enter Vowel Word");
		ch=i.nextLine().charAt(0);
		switch(ch)
		{
			case 'A':
			case 'a':
			System.out.println("Vowel");
			break;
			case 'E':
			case 'e':
			System.out.println("Vowel");
			break;
			case 'I':
			case 'i':
			System.out.println("Vowel");
			break;
			case 'O':
			case 'o':
			System.out.println("Vowel");
			break;
			case 'U':
			case 'u':
			System.out.println("Vowel");
			break;
			default:
			System.out.println("NOT Vowel");
		}
		i.close();
	}
}