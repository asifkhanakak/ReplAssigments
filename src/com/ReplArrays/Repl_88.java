package com.ReplArrays;

public class Repl_88 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] a = {
				{-5,-2,-3,7},
				{1,-5,-2, 2},
				{1,-2, 3,-4}
			};
			
			
	//   should print -9
	     int sum=0;
	     for(int i=0; i<a.length; i++){
	       for(int j=0; j<a[i].length; j++){
	         
	         if(j==1){
	           sum=sum+a[i][j];
	         }
	       }
	     }
		System.out.println(sum);
		
		

	}

}
