package com.Questions.Brainstorm;
import java.util.Scanner;
public class swipeDiagonalsOfMatrix {
    public static void main(String[] args) {
        // Note: Don't change class name
        // your code goes here
		int n= 5;
		Scanner sc = new Scanner(System.in);
		int arr [][] = new int[n][n];
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				arr[i][j] = sc.nextInt();
			}
		}
		int row=0, col=0;
		while(row<n && col <n){
			int temp = arr[row][col];
			arr[row][col] = arr[row][n-1-col];
			arr[row][n-1-col]= temp;
			row++;
			col++;
		}
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
    }
}
