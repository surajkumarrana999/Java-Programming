import java.util.*;
class Find_Table_of_any_number
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		int i=1,n;
		System.out.println("Enter any no.");
		n=input.nextInt();
		do
		{
			System.out.println(n+" x "+i+" = "+n*i);
			i++;
		}
		while(i<=10);
		input.close();
	}
}