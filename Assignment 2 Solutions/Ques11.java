import java.util.Scanner;
class Ques11
{
	public static void main (String args [ ])
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Radius : ");
	    float r = sc.nextFloat( );
		final double pi = 3.1415;
		
		double p = 2 * pi * r;
		System.out.println("Perimeter of circle = " +p);
		
		double a = pi * r * r;
		System.out.println("Area of circle = " +a);
	}
}
