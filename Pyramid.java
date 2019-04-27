package Package1;

public class Pyramid {

	public static void main(String[] args) 
	{
	//Normal pyramid printing
		
		/*for (int i = 0; i<=3; i++) 
		{
			for (int j = 0; j<=i; j++) 
			{
				System.out.print('*');
			}
			System.out.println();
		}
*/
	//Reverse of pyramid
		
		for (int i = 1; i <=4; i++) 
		{
			for (int j = 4; j >=i; j--) 
			{
				System.out.print('*');
			}
			    System.out.println();
		}
	}

}
