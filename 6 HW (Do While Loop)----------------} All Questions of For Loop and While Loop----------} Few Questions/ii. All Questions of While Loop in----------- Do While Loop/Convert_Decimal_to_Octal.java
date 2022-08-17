						//Decimal to Octal
import java.util.*;
class Convert_Decimal_to_Octal
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		int num,n,on=0,d,a=1;
		System.out.println("Enter any Decimal no.");
		num=input.nextInt();
		n=num;
		do
		{
			d=n%8;
			on=on+d*a;
			a=a*10;
			n=n/8;
		}
		while(n>0);
		System.out.println("Octal no. of "+num+" = "+on);
		input.close();
	}
}