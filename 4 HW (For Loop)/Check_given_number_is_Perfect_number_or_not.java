import java.util.*;
class Check_given_number_is_Perfect_number_or_not
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		try
		{
			int n,i,p=0;
			System.out.println("Enter any no.");
			n=input.nextInt();
			for(i=1;i<n;i++)
			{
				if(n%i==0)
				{
					p=p+i;
				}
			}
			if(n==p)
			{
				System.out.println("Given no. is Perfect no.");
			}
			else
			{
				System.out.println("Given no. is NOT Perfect no.");
			}
		}
		finally
		{
			input.close();
		}
	}
}