						//Binary to Decimal
import java.util.*;
class Convert_Binary_to_Decimal
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		int num,n,dn=0,d,a=1;
		System.out.println("Enter any Binary no.");
		num=input.nextInt();
		n=num;
		while(n>0)
		{
			d=n%10;
			dn=dn+d*a;
			a=a*2;
			n=n/10;
		}
		System.out.println("Decimal no. of "+num+" = "+dn);
		input.close();
	}
}