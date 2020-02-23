package com.ReplArrays;

public class Repl_84 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] a = {
				{5,2,3,7},
				{1,5,1,1},
				{8,3,1,2}
			};
	//should be 8
	int  hnumber=a[0][0];
	      for(int i=0; i<a.length; i++){
	        for(int j=0; j<a[i].length; j++){
	        	
	        	System.out.println(a[i][j]);
	        	
	          if(hnumber<a[i][j]){
	            hnumber=a[i][j];
	          }
	        }
	      }
	              System.out.print(hnumber);



	}

}
