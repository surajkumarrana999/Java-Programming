import java.util.*;
class Celsius_to_Farenheit
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		float cel,fer;
		System.out.print("Enter the value of Celsius	:");
		cel=input.nextFloat();
		fer=(cel*9/5)+32;
		System.out.println("Farenheit			:"+fer);
		input.close();
	}
}