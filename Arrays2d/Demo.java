package com.data.Arrays2d;

import java.util.Scanner;

public class Demo {
	
	public static boolean search(int matrix[][],int key) {
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[0].length;j++) {
				if(matrix[i][j]==key) {
					System.out.println("found at index");
					return true;
				}
			}
		}
		System.out.println("key not found");
		return false;
	}
	public static void main(String[] args) {
		int matrix[][] = new int[2][2];
		int n = matrix.length ,m = matrix[0].length;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter matrix");
		
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[0].length;j++) {
				matrix[i][j]=sc.nextInt();
			}
		}
		//output
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[0].length;j++) {
				System.out.println(matrix[i][j]+" ");
			}
			System.out.println();
		}
		search(matrix, 3);
	}
}
