import java.util.*;
class numberpattern1
{
	public static void main (String args [ ])
	{
		Scanner sc=new Scanner(System.in); 
        System.out.print("Enter the rows you want");
        int rows=sc.nextInt( );
        System.out.println("");

		for (int i=1; i<=rows; i++)
		{
        for (int j=1; j<=rows; j++)
		{
        System.out.print(" ");
        }
           rows--;
        for (int k=1; k<=i; k++){
        System.out.print(i+" ");           
}                                               
        System.out.println( );
}                                                 
}
}