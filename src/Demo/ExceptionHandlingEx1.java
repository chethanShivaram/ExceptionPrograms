package Demo;

public class ExceptionHandlingEx1
{
    public static void main(String[] args)
    {
        System.out.println("This statement will be executed"); 
 
        try
        {
            Integer I = new Integer("abc"); 
        }
        catch (Exception e)
        {
            System.out.println("exception caught");
        }
 
        System.out.println("Now, This statement will also be executed");
    }
}