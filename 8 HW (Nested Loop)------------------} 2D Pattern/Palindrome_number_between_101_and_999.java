class Palindrome_number_between_101_and_999
{
	public static void main(String args[])
	{
		int i,n,d,rev;
		System.out.println("Palindrome no. between 101 and 999");
		for(i=101;i<=999;i++)
		{
			n=i;
			d=0;
			rev=0;
			while(n>0)
			{
				d=n%10;
				rev=rev*10+d;
				n=n/10;
			}
			if(i==rev)
			{
				System.out.println(i+" ");
			}
			rev=0;
		}
	}
}