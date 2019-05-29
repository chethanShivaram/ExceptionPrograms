package Demo;

public class NestedTryCatch1 {
	public static void main(String args[])
	   {
		try {
	    	 int data = 100/0;
	    	 System.out.println(data);
	    	 
	         try{
	         int a[]=new int[4];
	         a[5]=30/1;
	         System.out.println("First print statement in try block");
	         }
	         catch(ArrayIndexOutOfBoundsException e )
	         {
	            System.out.println("Warning: ArrayIndexOutOfBoundsException");
	         }
		}
	        catch(ArithmeticException e)
		    {
			    System.out.println("Warning: ArithmeticException");
			}
		
	       finally 
	       {
	    	 System.out.println("finally block");
	      }
 }

}