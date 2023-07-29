package week1.day2;

import java.util.Arrays;

public class PracticeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int [] nums= {2,5,7,7,5,9,2,3};
		 Arrays.sort(nums);
		 int n=nums.length;
		 for(int i=0;i<n-1;i++)
		 {
			 if(nums[i]==nums[i+1]) {
				 System.out.println(nums[i]);
			 }
				 
				 
		 }
		 

	}

}
