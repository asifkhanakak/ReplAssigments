package com.ReplArrays;

public class Repl_87 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] a = {
				{-5,-2,-3,7},
				{1,-5,-2,2},
				{1,-2,3,-4}
			};
			int sum=0;
			
			for (int i=0; i<a.length; i++){
			  for (int j=0; j<a[i].length; j++){
				  
			    System.out.print(a[i][j]+" ");
			   // if (a[i][j] < 0 && a[i][j] % 2 != 0) {
			    if(a[i][j] %2 !=0 && a[i][j]<0){
			      System.out.print(a[i][j]);
			      sum=sum+1;
			    }
			  }
			}

		System.out.println("sum"+sum);
		
		
		

	}

}
