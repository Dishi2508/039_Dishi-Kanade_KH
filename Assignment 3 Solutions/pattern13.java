class pattern13
{
	public static void main (String args [ ])
    {
        for (int i = 0; i <= 4; i++)
        {
            int alphabet = 65;
            for (int j = 4; j > i; j--)
            {
                System.out.print(" ");
            }

            for (int k = 0; k <= i; k++)
            {
                System.out.print((char) (alphabet + i) + " ");
            }
            System.out.println();
        }
    }
}