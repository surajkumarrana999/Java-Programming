						//Octal to Decimal
import java.util.*;
class Convert_Octal_to_Decimal
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		int num,n,dn=0,d=0,a=1;
		System.out.println("Enter any Octal no.");
		num=input.nextInt();
		n=num;
		while(n>0)
		{
			d=n%10;
			dn=dn+d*a;
			a=a*8;
			n=n/10;
		}
		System.out.println("Decimal no. of "+num+" = "+dn);
		input.close();
	}
}
