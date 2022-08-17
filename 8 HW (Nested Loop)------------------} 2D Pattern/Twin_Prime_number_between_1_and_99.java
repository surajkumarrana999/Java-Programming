class Twin_Prime_number_between_1_and_99
{
	public static void main(String args[])
	{
		int i,j,c,a;
		System.out.println("Twin Prime no. between 1 and 99");
		a=2;
		for(i=1;i<=100;i++)
		{
			c=0;
			for(j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					c++;
				}
			}
			if(c==2)
			{
				if(i-a==2)
				{
					System.out.println(a+","+i+" ");
				}
				a=i;
			}
		}
	}
}