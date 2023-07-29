package week1.day2;

import java.util.Arrays;

public class FindLargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] l={3,2,11,4,6,7};
		int n=l.length;
		Arrays.sort(l);
		System.out.println("The second largest element is " +l[n-2]);

	}

}
