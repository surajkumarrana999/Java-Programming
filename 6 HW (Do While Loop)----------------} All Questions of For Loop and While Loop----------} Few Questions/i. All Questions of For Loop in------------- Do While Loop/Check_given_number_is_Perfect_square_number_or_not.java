import java.util.*;
class Check_given_number_is_Perfect_square_number_or_not
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		int n,i=1,p=0;
		System.out.println("Enter any no.");
		n=input.nextInt();
		do
		{
			if(i*i==n)
			{
				p=1;
			}
			i++;
		}
		while(i<n);
		if(p==1)
		{
			System.out.println("Given no. is Perfect Square no.");
		}
		else
		{
			System.out.println("Given no. is NOT Perfect Square no.");
		}
		input.close();
	}
}