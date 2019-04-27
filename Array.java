package Package1;

public class Array {
	
	static int arr1(int[]arr)
	{
		int sum=0;
		for (int i : arr) 
		{
			sum=sum+i;
		}
		return sum;
	}

	public static void main(String[] args) 
	{
		//int sum=0;
		int[]arr={1,2,3,4,5};
		int sum = Array.arr1(arr);
		System.out.println(sum);
		
		
		/*for (int i = 0; i < arr.length; i++) 
		{
			sum=sum+arr[i];
			//System.out.println(arr[i]);
			System.out.println(sum);
		}*/
		
		/*for (int i : arr) 
		{
			sum=sum+i;
			//System.out.println(sum);
		}
		System.out.println(sum);
*/
	}

}
