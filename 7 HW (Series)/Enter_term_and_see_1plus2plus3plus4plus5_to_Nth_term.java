import java.util.*;
class Enter_term_and_see_1plus2plus3plus4plus5_to_Nth_term
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		try
		{
			int i,n,sum=0;
			System.out.println("Enter Term");
			n=input.nextInt();
			for(i=1;i<=n;i++)
			{
				System.out.print(i+"+");
				sum=sum+i;
			}
			System.out.println("\b="+sum);
		}
		finally
		{
			input.close();
		}
	}
}