class Total_number_of_Prime_no_between_1_to_100
{
	public static void main(String args[])
	{
		int i,j,c=0,p=0;
		for(i=1;i<=100;i++)
		{
			for(j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					c++;
				}
			}
			if(c==2)
			{
				System.out.println(i);
				p++;
			}
			c=0;
		}
		System.out.println("Total number of Prime no between 1 to 100 ="+p);
	}
}