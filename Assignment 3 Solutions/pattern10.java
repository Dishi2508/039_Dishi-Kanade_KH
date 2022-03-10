class pattern10
{
	public static void main (String args [ ])
	{
		int alphabet = 65;
		int n = 5;
		for (int i = n - 1; i >= 0; i--) 
		{
			for (int j = 0; j < i; j++ ) 	
			{
				System.out.print(" ");
			}
			for(int k = i; k <= n - 1; k++)
			{
				System.out.print((char)(alphabet + k) + " ");
			}
			System.out.println();
		}
	}
}
