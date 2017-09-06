package edu.usfca.cs.cs245;
/*
 * A class that build search name and search method
 */

public class LinearSearch implements Practice2Search {

	//set the search name
	public String searchName() {
		// TODO Auto-generated method stub
		String name = "linear";
		return name;
	}

	//build linear search
	public int search(int[] arr, int target) {
	
		for(int i = 0; i < arr.length; i++){
			if(arr[i] == target){
				return i;
			}
		}
		return -1;	
	}
}
