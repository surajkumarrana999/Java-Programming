					//Given no is Armstrong no. or NOT
								//153
import java.util.*;
class Check_Given_number_is_Armstrong_or_not
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		int num,n,sum=0,d;
		System.out.println("Enter three digit no.");
		num=input.nextInt();
		n=num;
		do
		{
			d=n%10;
			sum=sum+d*d*d;
			n=n/10;
		}
		while(n>0);
		if(num==sum)
		{
			System.out.println("Given no. is Armstrong");
		}
		else
		{
			System.out.println("Given no. is NOT Armstrong");	
		}
		input.close();
	}
}