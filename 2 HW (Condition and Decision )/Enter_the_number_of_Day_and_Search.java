import java.util.*;
class Enter_the_number_of_Day_and_Search
{
	public static void main(String Args[])
	{
		Scanner in=new Scanner(System.in);
		int n;
		System.out.println("Enter the no. of Day");
		n=in.nextInt();
		if(n==1)
		{
			System.out.println("Monday");
		}
		else if(n==2)
		{
			System.out.println("Tuesday");
		}
		else if(n==3)
		{
			System.out.println("Wednesday");
		}
		else if(n==4)
		{
			System.out.println("Thrusday");
		}
		else if(n==5)
		{
			System.out.println("Friday");
		}
		else if(n==6)
		{
			System.out.println("Saturday");
		}
		else if(n==7)
		{
			System.out.println("Sunday");
		}
		else
		{
			System.out.println("Invalid Day");
		}
		in.close();
	}
}