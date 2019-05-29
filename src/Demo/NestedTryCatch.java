package Demo;
import java.lang.Thread;
class NestedTryCatch
{
	   public static void main(String args[])
	   {
	     try
	     {
	         int a[]=new int[4];
	         a[5]=30/1;
	         System.out.println("First print statement in try block");
	     }
	     catch(ArrayIndexOutOfBoundsException e )
	     {
	        System.out.println("Warning: ArrayIndexOutOfBoundsException");
	     }
	     try {
	    	 String s= "ABC";
	    	 int result = Integer.parseInt(s);	
	     }
	     catch(ArithmeticException e)
	     {
		    System.out.println("Warning: ArithmeticException");
		 }
	     catch(Exception e)
	     {
	        System.out.println("Warning: Some Other exception");
	     }
	     finally 
	     {
	    	System.out.println("finally block");
	     }
	 }
}