package week1.day2;

import java.util.Arrays;

public class DuplicateInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] D1= {14,12,13,11,15,14,18,16,17,19,18,17,20};
		Arrays.sort(D1);
		for(int i=0;i<D1.length-1;i++)
		{
			if(D1[i]==D1[i+1]) {
				System.out.println(+D1[i]);
				
			}else
			{
				System.out.print("");
			}
				
		}
	}

}
