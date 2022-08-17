import java.util.*;
class Find_Factorial_of_any_number
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		int n,i,f=1;
		System.out.print("Enter any no.		:");
		n=input.nextInt();
		i=n;
		do
		{
			System.out.println(i);
			f=f*i;
			i--;
		}
		while(1<=i);
		System.out.println("Factorial of "+n+" = "+f);
		input.close();
	}
}