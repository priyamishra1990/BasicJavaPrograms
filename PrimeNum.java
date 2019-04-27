package Package1;

public class PrimeNum {
	
	boolean isPrime(int num)
	{
		staticboolean is_Prime=true;
		for(int i=2;i<num;i++){
			is_Prime=false;
		}
		return is_Prime;
	}


	public static void main(String[] args) 
	{
		int num=7;
		boolean val=isPrime(num);
		if(val==true)
		{
			System.out.println(num + );
		}
	}
		/*int num=7;          //normal way
		boolean isPrime=true;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				isPrime=false;
			}
		}
		if(isPrime==true)
		{
			System.out.println(num+ "is prime");
			}
			else{
				System.out.println(num+ "is not prime");
			}
		}
*/
		
		
	}


