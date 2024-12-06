package com.data.Arrays;

public class BinarySearch {
	
	public static int getBinary(int numbers[],int key) {
		
		int start =0, end=numbers.length-1;
		
		while(start<=end) {
			int mid = (start+end)/2;
			//comparisions
			
			if(numbers[mid]==key) {
				return mid;
			}
			if(numbers[mid]<key) {
				start = mid+1;
			}else {
				end = mid-1;
			}
			
		}
		return -1;
	}
	
	public static void main(String [] args) {
		int numbers[] = {2,4,6,8,10,12,14,16,18,20};
		int key = 12;
		System.out.println("index for key is :" + getBinary(numbers, key));
	}

}
