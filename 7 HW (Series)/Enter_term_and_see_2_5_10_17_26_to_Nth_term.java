					// 2 5 10 17 26...........nth term
import java.util.*;
class Enter_term_and_see_2_5_10_17_26_to_Nth_term
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		try
		{
			int i,n;
			System.out.println("Enter Term");
			n=input.nextInt();
			for(i=1;i<=n;i++)
			{
				System.out.print(i*i+1+"_");			//You can just remove _ to see SPACE between numbers
			}
		}
		finally
		{
			input.close();
		}
	}
}