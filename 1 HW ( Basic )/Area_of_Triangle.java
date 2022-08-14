import java.util.*;
class Area_of_Triangle
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		double b,h,area;
		System.out.print("Enter Base of Triangle		:");
		b=in.nextDouble();
		System.out.print("Enter Height of Triangle	:");
		h=in.nextDouble();
		area=0.5*b*h;
		System.out.println("Area of Triangle		:"+area);
		in.close();
	}
}