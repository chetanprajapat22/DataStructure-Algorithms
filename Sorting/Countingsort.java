package com.data.Sorting;

public class Countingsort {
	
	public static void getCountingSort(int arr[]) {
		int largest = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			largest = Math.max(largest, arr[i]); 
		}
		int count [] = new int [largest+1];
		for(int i=0;i<arr.length;i++) {
			count [arr[i]]++;
		}
		//sorting
		int j=0;
		for(int i=0;i<count.length;i++) {
			while(count[i]>0) {
				arr[j] =i;
				j++;
				count[i]--;
			}
		}
	}
	
	public static void CountingSortDescending(int arr[]) {
		int largest = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			largest = Math.max(largest, arr[i]);
		}
		int count[] = new int [largest+1];
		for(int i=0;i<arr.length;i++) {
			count[arr[i]]++;
		}
		int j=0;
		for(int i=count.length-1;i>=0;i--) {
			while(count[i]>0) {
				arr[j]=i;
				j++;
				count[i]--;
			}
		}
	}
	
	
		public static void printArr(int arr[]) {
			for(int i=0;i<arr.length;i++) {
				System.out.print(arr[i]);
			}
			System.out.println();
		}
	
	public static void main(String[] args) {
		int arr[]  = {3,4,2,3,4,5,6,1,1,3};
//		getCountingSort(arr);
		CountingSortDescending(arr);
		printArr(arr);
		
	}

}
