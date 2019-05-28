package Demo;
import java.io.*;

public class ThrowsKeyEx {

	public static void main(String[] args) throws IOException
	{
		  FileInputStream fis = null;
	      fis = new FileInputStream("D:/sample.txt"); 
	      int k; 

	      while(( k = fis.read() ) != -1) 
	      { 
		   System.out.print((char)k); 
	      } 
	      fis.close(); 	
	      System.out.println(" Hello Geeks");
	}
}