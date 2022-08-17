import java.util.*;
class Find_Factorial_of_any_number
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		int n,i,f=1;
		System.out.print("Enter any no.		:");
		n=input.nextInt();
		i=n;
		while(1<=i)
		{
			System.out.println(i);
			f=f*i;
			i--;
		}
		System.out.println("Factorial of "+n+" = "+f);
		input.close();
	}
}

							//OR	Both same

/*import java.util.*;
class abc45
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		int n,i,f=1;
		System.out.print("Enter any no.		:");
		n=input.nextInt();
		i=n;
		while(1<=n)
		{
			System.out.println(n);
			f=f*n;
			n--;
		}
		System.out.println("Factorial of "+i+" = "+f);
	}
}*/