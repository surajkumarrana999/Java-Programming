						// 1 4 3 16 5 36...........nth
import java.util.*;
class Enter_term_and_see_1_4_3_16_5_to_Nth_term
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
				if(i%2==1)
				{
					System.out.print(i+"_");			//You can just remove _ to see SPACE between numbers
				}
				else
				{
					System.out.print(i*i+"-");			//You can just remove - to see SPACE between numbers
				}
			}
		}
		finally
		{
			input.close();
		}
	}
}