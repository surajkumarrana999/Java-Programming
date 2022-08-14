import java.util.*;
class Search_any_student_according_to_roll_number
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		int n;
		System.out.println("Enter Roll no.");
		n=input.nextInt();
		switch(n)
		{
			case 1:
			System.out.println("Suraj");
			break;
			default:
			System.out.println("Invalid Roll");
			break;
			case 2:
			System.out.println("Rahul");
		}
		input.close();
	}
}