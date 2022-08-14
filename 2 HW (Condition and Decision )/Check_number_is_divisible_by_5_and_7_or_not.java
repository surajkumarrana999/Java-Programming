import java.util.*;
class Check_number_is_divisible_by_5_and_7_or_not
{
	public static void main(String Args[])
	{
		Scanner in=new Scanner(System.in);
		int n;
		System.out.println("Enter any number");
		n=in.nextInt();
		if(n%5==0 && n%7==0)
		{
			System.out.println("Given no. is Divisible by 5 and 7");
		}
		else  if(n%5==0)
		{
			System.out.println("Given no. is Divisible by 5 not 7");
		}
		else if(n%7==0)
		{
			System.out.println("Given no. is Divisible by 7 not 5");
		}
		else
		{
			System.out.println("Given no. is not Divisible by 5 and 7");
		}
		in.close();
	}
}