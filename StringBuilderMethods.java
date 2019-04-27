package Package1;

public class StringBuilderMethods {

	public static void main(String[] args) 
	{
		
		/*StringBuilder sbm=new StringBuilder("Hello ");
		sbm.append("World");
		System.out.println(sbm);*/
		
		StringBuilder sb=new StringBuilder("Hello ");  
		sb.insert(1,"Java");
		System.out.println(sb);

	}

}
