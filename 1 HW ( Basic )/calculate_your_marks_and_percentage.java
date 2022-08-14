import java.util.*;
class calculate_your_marks_and_percentage
{
	public static void main(String args[])
	{
		Scanner i = new Scanner(System.in);
		float tm,h,e,m,s,c,sum,per;
		System.out.print("Enter total marks		:");
		tm=i.nextFloat();
		System.out.print("Hindi					:");
		h=i.nextFloat();
		System.out.print("English				:");
		e=i.nextFloat();
		System.out.print("Math					:");
		m=i.nextFloat();
		System.out.print("Science				:");
		s=i.nextFloat();
		System.out.print("Computer				:");
		c=i.nextFloat();
		sum=h+e+m+s+c;
		System.out.println("Your Marks			:"+sum);
		per=(100/tm)*sum;
		System.out.println("Your Percentage		:"+per);
		i.close();
	}
}