import java.util.Scanner;
class Ques13
{
	public static void main (String args [ ])
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Length : ");
		float l = sc.nextFloat( );
		
		System.out.println("Enter Breadth : ");
		float b = sc.nextFloat( );
		
		float p = 2 * (l + b);
		float a = l * b;
		
		System.out.println("Perimeter = " +p);
		System.out.println("Area = " +a);
	}
}