package com.data.Sorting;

public class SelectionSort {
	
	public static void getSelectionSort(int arr[]) {
		for(int i=0;i<arr.length-1;i++) {
			int minPos = i;//current position of i
			for(int j=i+1;j<arr.length;j++) {
				if(arr[minPos]>arr[j]) {
					minPos = j;
				}
			}
			//swap in outer loop
			int temp = arr[minPos];
			arr[minPos] = arr[i];
			arr[i] = temp;
		}
	}
	public static void selectionSortDesending(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			int minPos = i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[minPos]< arr[j]) {
					minPos =j;
				}
			}
			//swap in outer looop
			int temp = arr[i];
			arr[i] = arr[minPos];
			arr[minPos] = temp;
		}
		
	}
	
	public static void printArr(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
	}
	public static void main(String []args) {
		int arr[] = {55,78,87,43,67};
		selectionSortDesending(arr);
//		getSelectionSort(arr);
		printArr(arr);
	}

}
