import java.util.Scanner;
class CircleTest
{
   public static void main (String args [ ])
   {
      Scanner sc = new Scanner( System.in);
	  System.out.println("Enter radius : ");
	  double r = sc.nextFloat( );
	  
	  final double pi = 3.1415;
	  double A = pi * r * r;
	  
	  System.out.println("Area = " +A);
	  }
}