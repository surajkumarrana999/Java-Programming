import java.util.*;
class Find_Maximum_number_between_10_number
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		int n,i=2,max;
		System.out.println("Enter 10 no.");
		n=input.nextInt();
		max=n;
		do
		{
			n=input.nextInt();
			if(n>max)
			{
				max=n;
			}
			i++;
		}
		while(i<=10);
		System.out.println("Maximum no.	:"+max);
		input.close();
	}
}