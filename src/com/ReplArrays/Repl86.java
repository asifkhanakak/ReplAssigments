package com.ReplArrays;

public class Repl86 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] a = {
				{1,1,2}, //sum = 4
				{3,1,2}, //sum = 6
				{3,5,3}, //sum = 11
				{0,1,2}  //sum = 3
			};
		int sumR0=0; int sumR1=0; int sumR2=0; int sumR3=0;
		int [][]sumArr= new int [4][0];
		
		for(int i=0; i<a[i].length; i++){
		  for(int j=0; j<a[i].length; j++){
		    if(i==0){
		      sumR0=sumR0+a[i][j];
		      
		    }else if(i==1){
		      sumR1=sumR1+a[i][j];
		      
		    }else if(i==2){
		      sumR2=sumR2+a[i][j];
		       
		    }else if(i==3){
		      sumR3=sumR3+a[i][j];
		       
		    }else {
		    	System.out.println();
		    }
		  }
		}
		
		 System.out.println(sumR0);
		 System.out.println(sumR1);
		  System.out.println(sumR2);
		   System.out.println(sumR3);
		
	
	}

}
