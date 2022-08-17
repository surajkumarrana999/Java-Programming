import java.util.*;
class Enter_term_and_see_1minus2plus3minus4plus5_to_Nth_term
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
				if(i%2==0)
				{
					System.out.print(i+"+");
					sum=sum-i;
				}
				else
				{
					System.out.print(i+"-");
					sum=sum+i;
				}
			}
			System.out.println("\b="+sum);
		}
		finally
		{
			input.close();
		}
	}
}