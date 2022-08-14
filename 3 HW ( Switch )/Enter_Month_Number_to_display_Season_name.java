import java.util.*;
class Enter_Month_Number_to_display_Season_name
{
	public static void main(String args[])
	{
		Scanner i=new Scanner(System.in);
		int mn;
		System.out.println("Enter Month No.");
		mn=i.nextInt();
		switch(mn)
		{
			case 1:
			case 2:
			case 11:
			case 12:
			System.out.println("Winter");
			break;
			case 3:
			case 4:
			case 5:
			case 6:
			System.out.println("Summer");
			break;
			case 7:
			case 8:
			case 9:
			case 10:
			System.out.println("Rainy");
			break;
			default:
			System.out.println("Invalid");
		}
		i.close();
	}
}