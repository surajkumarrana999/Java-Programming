class Damru_Shape_Star
{
	public static void main(String args[])
	{
		int i,j,k;
		for(i=3;i>=1;i--)
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
		for(i=2;i<4;i++)
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