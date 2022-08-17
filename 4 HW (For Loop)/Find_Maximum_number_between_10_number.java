import java.util.*;
class Find_Maximum_number_between_10_number
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		try
		{
			int n,i,max;
			System.out.println("Enter 10 no.");
			n=input.nextInt();
			max=n;
			for(i=2;i<=10;i++)
			{
				n=input.nextInt();
				if(n>max)
				{
					max=n;
				}
			}
			System.out.println("Maximum no.		:"+max);
		}
		finally
		{
			input.close();
		}
	}
}