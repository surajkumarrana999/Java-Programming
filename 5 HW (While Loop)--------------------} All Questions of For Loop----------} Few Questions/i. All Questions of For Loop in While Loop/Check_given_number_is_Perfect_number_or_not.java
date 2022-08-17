import java.util.*;
class Check_given_number_is_Perfect_number_or_not
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		int n,i=1,p=0;
		System.out.println("Enter any no.");
		n=input.nextInt();
		while(i<n)
		{
			if(n%i==0)
			{
				p=p+i;
			}
			i++;
		}
		if(n==p)
		{
			System.out.println("Given no. is Perfect no.");
		}
		else
		{
			System.out.println("Given no. is NOT Perfect no.");
		}
		input.close();
	}
}