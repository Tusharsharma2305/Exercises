package Exercise;

import java.util.Scanner;

public class pascal_triangle {

	public static void main(String[] args) {
		//pascal triangle
		
				Scanner sc=new Scanner(System.in);
		        int n,i,j,arr[][],sp;
		        
		        System.out.println("How many Times ? ");
		        n=sc.nextInt();
		        sp=n-1; 
		        arr=new int[n][n];
		        //filling the 2D matrix.
		        for(i=0;i<n;i++){
		            for(j=0;j<=i;j++)
		                if(j==0 || j==i)
		                    arr[i][j]=1;
		                else
		                    arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
		        }
		        
		        System.out.println();
		        for(i=0;i<n;i++)
		        {
		            for(j=0;j<=sp;j++)
		            System.out.print(" ");
		            
		            sp--;
		            
		            for(j=0;j<=i;j++)
		                System.out.print(arr[i][j]+" ");

		            System.out.println();
		        }

	}

}
