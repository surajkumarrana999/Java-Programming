class Equilateral_Triangle_1_121_12321
{
	public static void main(String args[])
	{
		int i,j,k,n;
		for(i=1;i<=5;i++)
		{
			for(j=50;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(k=1;k<=i;k++)
			{
				System.out.print(k);
			}
			for(n=i-1;n>=1;n--)
			{
				System.out.print(n);
			}
			System.out.println();
		}
	}
}