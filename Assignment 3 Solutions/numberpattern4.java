class numberpattern4
{
	public static void main (String args [ ])
	{
		for(int i=1; i<=9; i++){
        for(int j=0; j<9-i; j++){//create initial space for pyramid shape
       System.out.print(" ");
     }
        for(int k=1; k<i; k++){
       System.out.print(k);//create right half 
     }
        for(int l=i; l>=1; l--){
       System.out.print(l);//create left half 
     }
       System.out.print("\n");
        }
    }
}
   