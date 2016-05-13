package Session4Assignment2;

import java.util.Arrays;

public class sortArry {

	public static void main(String[] args) {
		int[] arrySort = {3,6,5,2,1,9,8,7,4};
		
		Arrays.sort(arrySort);
		System.out.println("The Sorted array is ");
		for(int i = 0; i < arrySort.length; i++){
			System.out.println(+arrySort[i]);
		}arrySort[5] = 2050;
		System.out.println("The new Array is ");
		for(int i = 0; i < arrySort.length; i++){
			System.out.println(+arrySort[i]);

		}
	}
}
