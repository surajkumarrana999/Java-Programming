import java.util.*;
class Sum_of_three_digit_no
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		int n,a,b,c,d;
		System.out.print("Enter three digit no.		:");
		n=in.nextInt();
		a=n%10;
		n=n/10;
		b=n%10;
		n=n/10;
		c=n%10;
		//n=n/10;
		d=a+b+c;
		System.out.println("Sum of three digit no.		:"+d);
		in.close();
	}
}