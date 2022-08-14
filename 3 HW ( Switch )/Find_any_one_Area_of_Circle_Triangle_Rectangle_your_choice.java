import java.util.*;
class Find_any_one_Area_of_Circle_Triangle_Rectangle_your_choice
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		double area;
		System.out.println("1	Area of Circle");
		System.out.println("2	Area of Triangle");
		System.out.println("3	Area of Rectangle");
		System.out.println("Enter your choice...");
		c=sc.nextInt();
		switch(c)
		{
			case 1:
			System.out.println("Enter Radius of Circle");
			a=sc.nextInt();
			area=3.14*a*a;
			System.out.println("Area of Circle				:"+area);
			break;
			case 2:
			System.out.println("Enter base and height");
			a=sc.nextInt();
			b=sc.nextInt();
			area=0.5*a*b;
			System.out.println("Area of Triangle			:"+area);
			break;
			case 3:
			System.out.println("Enter length and breadth");
			a=sc.nextInt();
			b=sc.nextInt();
			area=a*b;
			System.out.println("Area of Rectangle			:"+area);
		}
		sc.close();
	}
}