import java.util.*;
class swap_two_number_using_two_variable
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		int a,b;
		System.out.println("Enter two different no.");
		a=in.nextInt();
		b=in.nextInt();
		System.out.println("Value of a		:"+a);
		System.out.println("Value of b		:"+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Value of a after swap		:"+a);
		System.out.println("Value of b after swap		:"+b);
		in.close();
	}
}