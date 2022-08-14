import java.util.*;
class Find_percentage_and_Grade_of_your_Result
{
	public static void main(String Srgs[])
	{
		Scanner in=new Scanner (System.in);
		float	h,e,m,s,c,tm,sum,per;
		System.out.println("Total Marks");
		tm=in.nextInt();
		System.out.print("Hindi Marks 		:");
		h=in.nextInt();
		System.out.print("English Marks		:");
		e=in.nextInt();
		System.out.print("Math Marks		:");
		m=in.nextInt();
		System.out.print("Science Marks		:");
		s=in.nextInt();
		System.out.print("Computer Marks		:");
		c=in.nextInt();
		sum=h+e+s+m+c;
		System.out.println("Sum of all Subject	:"+sum);
		per=(sum/tm)*100;
		System.out.println("Percentage Scored 	:"+per+"%");
		if(per>=90)
		{
			System.out.println("Grade A");
		}
		else if(per>=80)
		{
			System.out.println("Grade B");
		}
		else if(per>=70)
		{
			System.out.println("Grade C");
		}
		else if(per>=60)
		{
			System.out.println("Grade D");
		}
		else if(per>=45)
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		in.close();
	}
}