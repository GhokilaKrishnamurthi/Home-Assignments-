package week1.day2;

import java.util.Arrays;

public class MissingElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] MIE = {1,2,3,4,7,6,8};
		Arrays.sort(MIE);
		
		for (int i=0;i<MIE.length;i++)
		{
			
			if(i+1 != MIE[i])
			{
				System.out.println("The missing element is " +(i+1));
				break;
			}
				
			}
		}
		
		
	
}
