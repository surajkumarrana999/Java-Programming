class Star_Right_angle_triangle
{
	public static void main(String args[])
	{
		int i,j,k;
		for(i=5;i>=1;i--)
		{
			for(j=i;j>=1;j--)
			{
				System.out.print(" ");
			}
			for(k=5;k>=i;k--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}