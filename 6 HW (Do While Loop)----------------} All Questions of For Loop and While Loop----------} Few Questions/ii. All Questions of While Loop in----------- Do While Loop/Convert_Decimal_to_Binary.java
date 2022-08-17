						//Decimal to Binary
import java.util.*;
class Convert_Decimal_to_Binary
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		int num,n,bn=0,d=0,a=1;
		System.out.println("Enter any Decimal no.");
		num=input.nextInt();
		n=num;
		do
		{
			d=n%2;
			bn=bn+d*a;
			a=a*10;
			n=n/2;
		}
		while(n>0);
		System.out.println("Binary no. of "+num+" = "+bn);
		input.close();
	}
}