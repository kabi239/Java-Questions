package com.Questions.Brainstorm;

public class printDiagonalOfAMatrix {
    public static void main(String[] args) {
        int n= 5;
        //String arr [][] = new String[n][n];
        // int row=0, col=0;
		// while(row<n && col <n){
		// 	arr[row][col]="*";
		// 	arr[row][n-1-col]="*";
		// 	row++;
		// 	col++;
		// }
        // for(int i=0;i<n;i++){
		// 	for(int j=0;j<n;j++){
		// 		System.out.print(arr[i][j]+" ");
		// 	}
		// 	System.out.println();
		// }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j || i+j==n-1)
            		System.out.print("*");
				else{
					System.out.print(" ");
					}
             	}
            System.out.println();
        }
    }
}
