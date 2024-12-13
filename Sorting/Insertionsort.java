package com.data.Sorting;

public class Insertionsort {
	
	public static void getInsertion(int arr[]) {
		//outer loop
		for(int i=1;i<arr.length;i++) {
			int curr = arr[i];
			int prev = i-1;
			//finding out the correct pos to insert
			while(prev >=0 && arr[prev]>curr) {
				arr[prev+1] = arr[prev];
				prev--;
			}
			//insertion 
			arr[prev+1] = curr;
		}
	}
	
	public static void insertionSortDescending(int arr[]) {
		for(int i=1;i<arr.length;i++) {
			int curr = arr[i];
			int prev = i-1;
			//to find the index where curr is to be inserted
			while(prev >= 0 && arr[prev]<curr) {
				arr[prev+1] = arr[prev];
				prev--;
			}
			arr[prev+1] = curr;
		}
	}
	
			
			public static void printArr(int arr[]) {
			for(int j=0;j<arr.length;j++) {
				System.out.print(arr[j] + " ");
			}
			System.out.println();
				
			}
	
	public static void main(String[] args) {
		
		int arr[] = {5,4,3,1,2};
		//getInsertion(arr);
		insertionSortDescending(arr);
		printArr(arr);
		
	}

}
