import java.util.*;
class Area_of_Circle
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		double r,area;
		System.out.print("Enter Radius			:");
		r=in.nextDouble();
		area=3.14*r*r;
		System.out.println("Area of Circle		:"+area);
		in.close();
	}
}