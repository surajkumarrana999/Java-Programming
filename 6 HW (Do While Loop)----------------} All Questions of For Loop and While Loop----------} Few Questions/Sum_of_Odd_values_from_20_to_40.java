class Sum_of_Odd_values_from_20_to_40
{
	public static void main(String args[])
	{
		int i=21,sum=0;
		do
		{
			System.out.println(i);
			sum=sum+i;
			i+=2;
		}
		while(i<=40);
		System.out.println("Sum of Odd values from 20 to 40 "+" = "+sum);
	}
}