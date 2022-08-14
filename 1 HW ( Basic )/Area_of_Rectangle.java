import java.util.*;
class Area_of_Rectangle
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		double l,b,area;
		System.out.print("Enter Length of Rectangle		:");
		l=in.nextDouble();
		System.out.print("Enter Breadth of Rectangle		:");
		b=in.nextDouble();
		area=l*b;
		System.out.println("Area of Rectangle			:"+area);
		in.close();
	}
}