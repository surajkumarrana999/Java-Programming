import java.util.*;
class Find_number_between_1_and_7
{
	public static void main(String Args[])
	{
		Scanner in=new Scanner(System.in);
		int n;
		System.out.println("Enter any no. between 1 and 7");
		n=in.nextInt();
		if(n==1)
		{
			System.out.println("One");
		}
		else if(n==2)
		{
			System.out.println("Two");
		}
		else if(n==3)
		{
			System.out.println("Three");
		}
		else if(n==4)
		{
			System.out.println("Four");
		}
		else if(n==5)
		{
			System.out.println("Five");
		}
		else if(n==6)
		{
			System.out.println("Six");
		}
		else if(n==7)
		{
			System.out.println("Seven");
		}
		else
		{
			System.out.println("This no. is NOT between 1 and 7");
		}
		in.close();
	}
}