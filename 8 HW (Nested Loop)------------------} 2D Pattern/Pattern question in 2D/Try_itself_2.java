					// 1-2+3-4+5-...........+nth
class Try_itself_2
{
	public static void main(String args[])
	{
		int i,j;
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(i*2-1);
			}
			System.out.println();
		}
	}
}