							//Using Conditional Operator
/*import java.util.*;
class Find_minimum_number_between_three_diffrent_number
{
	public static void main (String Args[])
	{
		Scanner in=new Scanner(System.in);
		int a,b,c,min;
		System.out.println("Enter two diffrent no.");
		a=in.nextInt();
		b=in.nextInt();
		c=in.nextInt();
		min=a<b?a:b<c?b:c;
		System.out.println("Minimum No."+min);
		i.close();
	}
}*/

						//Using if Condition
						
/*import java.util.*;
class Find_minimum_number_between_three_diffrent_number
{
	public static void main(String Args[])
	{
		Scanner i=new Scanner (System.in);
		int a,b,c,min;
		System.out.println("Enter three diffrent no.");
		a=i.nextInt();
		b=i.nextInt();
		c=i.nextInt();
		min=a;
		if(b<min)
		{
			min=b;
		}
		if(c<min)
		{
			min=c;
		}
		System.out.println("Minimum no."+min);
		i.close();
	}
}*/

						//Using if,else if,else Condition
						
import java.util.*;
class Find_minimum_number_between_three_diffrent_number
{
	public static void main(String args[])
	{
		Scanner i=new Scanner (System.in);
		int a,b,c;
		System.out.println("Enter three diffrent no.");
		a=i.nextInt();
		b=i.nextInt();
		c=i.nextInt();
		if(a<b && a<c)
		{
			System.out.println("Min no.		:"+a);
		}
		else if(b<a && b<c)
		{
			System.out.println("Min no.		:"+b);
		}
		else
		{
			System.out.println("Min no.		:"+c);
		}
		i.close();
	}
}