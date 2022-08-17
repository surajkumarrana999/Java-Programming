class Armstrong_number_between_101_and_999
{
	public static void main(String args[])
	{
		int i,n,d,s;
		System.out.println("Armstrong no. between 101 and 999");
		for(i=101;i<=999;i++)
		{
			n=i;
			d=0;
			s=0;
			while(n>0)
			{
				d=n%10;
				s=s+d*d*d;
				n=n/10;
			}
			if(i==s)
			{
				System.out.println(i+" ");
			}
		}
	}
}