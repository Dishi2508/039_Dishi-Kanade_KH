import java.util.Scanner;
class Ques15
{
	public static void main (String args[ ])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number : ");
		int a = sc.nextInt( );
		
		System.out.println("Enter second number : ");
		int b = sc.nextInt( );
		
		System.out.println("Values before swapping : " +a+ " " +b);
		
		int temp;
		temp = a;
		a = b;
		b = temp;
		
		System.out.println("Values after swapping : " +a+ " " +b);
	}
}

		