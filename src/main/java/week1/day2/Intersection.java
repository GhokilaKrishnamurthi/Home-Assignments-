package week1.day2;

public class Intersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] A1= {3,2,11,4,6,7};
		int [] B1= {1,2,8,4,9,7};
		System.out.print("The Intersection Elements are:");
		
		for(int i=0;i<A1.length;i++)
		{
			for(int j=0;j<B1.length;j++)
			{
				if (A1[i] == B1[j])
				{
					System.out.print( " "+A1[i]);
				}
			}
		}
		
	}
 
}
