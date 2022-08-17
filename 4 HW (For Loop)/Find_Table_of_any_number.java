import java.util.*;
class Find_Table_of_any_number
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int n,i;
		try
		{
			System.out.println("Enter any no.");
			n=in.nextInt();
			for(i=1;i<=10;i++)
			{
				System.out.println(n+" x "+i+" = "+n*i);
			}
		}
		finally
		{
			in.close();
		}
	}
}