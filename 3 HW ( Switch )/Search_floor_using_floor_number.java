import java.util.*;
class Search_floor_using_floor_number
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		int n;
		System.out.println("Enter Floor No.");
		n=input.nextInt();
		switch(n)
		{
			case 1:
			System.out.println("1st Floor");
			break;
			case 2:
			System.out.println("2nd Floor");
			break;
			case 3:
			System.out.println("3rd Floor");
			break;
			default:
			System.out.println("Invalid Floor no.");
		}
		input.close();
	}
}