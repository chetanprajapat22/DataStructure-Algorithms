package com.data.Arrays;

public class Reverse {
	
	public static void getReverse(int numbers[]) {
		int start=0, end = numbers.length-1;
		while(start<end) {
			
			int temp = numbers[end];
			numbers [end]= numbers[start];
			numbers [start] = temp;
			
			start++;
			end--;
		}
	}
	public static void main(String []args) {
		int numbers[] = {1,3,5,7,9,22};
	  
		getReverse(numbers);
		for(int i=0;i<numbers.length;i++) {
			System.out.print(numbers[i]+" ");
			
		}
		System.out.println( );
	}

}
