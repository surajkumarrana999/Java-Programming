class Star_and_Dash_Right_angle_triangle
{
	public static void main(String args[])
	{
		int i,j;
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=i*2-1;j++)
			{
				if(j%2==1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print("_");
				}
			}
			System.out.println();
		}
	}
}

												//OR

/*class Star_and_Dash_Right_angle_triangle
{
	public static void main(String args[])
	{
		int i,j,k;
		for(i=5;i>=1;i--)
		{
			for(j=i;j<=5;j++)
			{
				System.out.print("*_");
			}
			System.out.print("\b");
			for(k=1;k<=i;k++)
			{
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}*/