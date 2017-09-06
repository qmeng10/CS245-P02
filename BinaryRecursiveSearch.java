package edu.usfca.cs.cs245;
/*
 * A class that build search name and search method
 */

public class BinaryRecursiveSearch implements Practice2Search {

	//set the name to binary recursive
	public String searchName() {
		String name = "binary recursive";
		return name;
	}

	//build binary recursive search
	public int search(int[] arr, int target) {
		
		return search(arr, target, 0, arr.length - 1);
	}
	
	public int search(int[] arr, int target, int min, int max) {
		
		if(max < min) {
			return -1;
		}
		int mid = (min + max)/2;
		if(arr[min] == (target)) {
			return mid;
		}
		if(arr[mid] < target) {
			return search(arr, target, mid + 1, max);
		}else {
			return search(arr, target, min, mid - 1);
		}
	}
}
