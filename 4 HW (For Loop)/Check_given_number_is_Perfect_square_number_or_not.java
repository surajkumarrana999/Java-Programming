import java.util.*;
class Check_given_number_is_Perfect_square_number_or_not
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
				if(i*i==n)
				{
					p=1;
				}
			}
			if(p==1)
			{
				System.out.println("Given no. is Perfect Square no.");
			}
			else
			{
				System.out.println("Given no. is NOT Perfect Square no.");
			}
		}
		finally
		{
			input.close();
		}
	}
}