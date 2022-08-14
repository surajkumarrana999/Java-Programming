import java.util.*;
class Write_number_in_word_between_1_and_7
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		int n;
		System.out.println("Enter No. between 1 and 7");
		n=input.nextInt();
		switch(n)
		{
			case 1:
			System.out.println("One");
			break;
			case 2:
			System.out.println("Two");
			break;
			case 3:
			System.out.println("Three");
			break;
			case 4:
			System.out.println("Four");
			break;
			case 5:
			System.out.println("Five");
			break;
			case 6:
			System.out.println("Six");
			break;
			case 7:
			System.out.println("Seven");
			break;
			default:
			System.out.println("This no. is not between 1 and 7");
		}
		input.close();
	}
}