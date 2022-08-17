import java.util.*;
class Find_Factorial_of_any_number
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		try
		{
			int n,i,fact=1;
			System.out.println("Enter any no.");
			n=input.nextInt();
			i=n;
			for(i=1;i<=n;i++)
			{
				fact=fact*i;
			}
			System.out.println("Factorial of "+n+" = "+fact);
		}
		finally
		{
			input.close();
		}
	}
}