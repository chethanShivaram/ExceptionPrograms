package Demo;
import java.io.*; 
class SuperClass
{ 
    void method()  throws RuntimeException
    { 
        System.out.println("SuperClass"); 
    } 
} 
  
class ExcepHan1 extends SuperClass { 
  
    void method() throws ArithmeticException
    { 
        System.out.println("SubClass"); 
    } 
  
    public static void main(String args[]) 
    { 
        SuperClass s = new ExcepHan1(); 
        s.method(); 
    } 
}