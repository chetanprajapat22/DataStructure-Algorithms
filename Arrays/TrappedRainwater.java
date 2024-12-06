package com.data.Arrays;

public class TrappedRainwater {

	public static int trappedRainwater(int height[]) {

		int n = height.length;
		// left max boundary
		int leftmax[] = new int[n];
		leftmax[0] = height[0];
		for (int i = 1; i < n; i++) {
			leftmax[i] = Math.max(height[i], leftmax[i - 1]);
		}
		// right max boundary
		int rightmax[] = new int[n];
		rightmax[n - 1] = height[n - 1];
		for (int i = n - 2; i >= 0; i--) {
			rightmax[i] = Math.max(height[i], rightmax[i + 1]);
		}
		int trappedWater = 0;
		// loop
		for (int i = 0; i < n; i++) {
			// waterlevel
			int waterLevel = Math.min(leftmax[i], rightmax[i]);
			// trapped water
//			int width = waterLevel - height[i];
			trappedWater += waterLevel - height[i];
		}
		return trappedWater;
	}

//		int left = 0;
//        int right = height.length - 1;
//        int maxArea = 0;
//        
//        while (left < right) {
//            // Calculate the area between the lines at left and right pointers
//            int heightLeft = height[left];
//            int heightRight = height[right];
//            int width = right - left;
//            int area = Math.min(heightLeft, heightRight) * width;
//            
//            // Update the max area if the current area is larger
//            maxArea = Math.max(maxArea, area);
//            
//            // Move the pointer pointing to the shorter line
//            if (heightLeft < heightRight) {
//                left++;
//            } else {
//                right--;
//            }
//        }

//        return maxArea;
//	}
	public static void main(String[] args) {
		int height[] = { 4, 2, 0, 6, 3, 2, 5 };
		System.out.println(trappedRainwater(height));

	}

}
