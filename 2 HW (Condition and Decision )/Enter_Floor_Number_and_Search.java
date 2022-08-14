import java.util.*;
class Enter_Floor_Number_and_Search
{
	public static void main(String Args[])
	{
		Scanner input=new Scanner(System.in);
		int n;
		System.out.println("Enter Floor No.");
		n=input.nextInt();
		if(n==1)
		{
			System.out.println("1st Floor");
		}
		else if(n==2)
		{
			System.out.println("2nd Floor");
		}
		else if(n==3)
		{
			System.out.println("3rd Floor");
		}
		else if(n==4)
		{
			System.out.println("4th Floor");
		}
		else if(n==5)
		{
			System.out.println("5th Floor");
		}
		else
		{
			System.out.println("Invalid Floor No.");
		}
		input.close();
	}
}