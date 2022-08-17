class Sum_of_1st_10_number
{
	public static void main(String args[])
	{
		int i=1,sum=0;
		do
		{
			System.out.println(i);
			sum=sum+i;
			i++;
		}
		while(i<=10);
		System.out.println("Sum of 1st 10 no.	:"+sum);
	}
}