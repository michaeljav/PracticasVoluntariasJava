package com.mjm.ForAndMetrix;

public class ForMetrix {

	public static void main(String[] arg) {
		
		
   
		
		
		int[][] num = new int[4][4];
		int valueOld=0;

		for(int a = 0; a< num.length; a++) {		
		
				 System.out.print(""+(a+1));
				 
			for(int b = 0; b< num.length; b++) {
				
				valueOld+=2;
				num[a][b] = valueOld;
	
				System.out.print("       "+num[a][b]);
				
			}					
		
			System.out.print("\n");			
		}	
	
		
	}
}
