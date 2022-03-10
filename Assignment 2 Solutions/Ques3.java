import java.util.Scanner;
class Ques3
{
  public static void main (String args[ ] )
  {
    Scanner sc = new Scanner("50 3");
	int a = sc.nextInt( );
	int b = sc.nextInt( );
	int c = a/b;
	System.out.println("Division of " +a+ " and " +b+ " is " +c);
	}
}