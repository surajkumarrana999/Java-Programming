class Equilateral_Triangle
{
	public static void main(String args[])
	{
		int i,j,k;
		for(i=1;i<=5;i++)
		{
			for(j=50;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(k=1;k<=i*2-1;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}