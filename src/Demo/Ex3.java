package Demo;

public class Ex3 
{

	public static void main(String[] args) 
	{
		try {
			  try 
			  {
				  int a[] = new int[7];
				  a[8]=3/1;
			  }
			  catch(ArithmeticException e)
			  {
				   System.out.println("Arithmetic Exception" ); 	
				}
			  }
		    catch(ArrayIndexOutOfBoundsException e)
		    {
		    	System.out.println("ArrayIndexOutOfBoundsException");
		    }
	}
}
