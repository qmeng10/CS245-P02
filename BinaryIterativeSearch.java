package edu.usfca.cs.cs245;
/*
 * A class that build search name and search method
 */

public class BinaryIterativeSearch implements Practice2Search {

	//set the name to binary iterative
	public String searchName() {

		String name = "binary iterative";
		return name;
	}

	//build binary iterative search
	public int search(int[] arr, int target) {
		
		int min = 0;
		int max = arr.length - 1;
		
		while(min <= max) {
			int mid = (min + max)/2;
			if(arr[mid] == target) {
				return mid;
			}
			if(arr[mid] < target) {
				min = mid + 1;
			}else {	
				max = mid -1;
			}
		}
		return -1;
	}
}
