import java.io.*;
import java.nio.*;
import java.util.*;
import java.*;

public class file1 {
	public static void main(String args[]) throws IOException
	   {
		int temp=0,j=0;
		FileInputStream file = new FileInputStream("key.txt");
		BufferedReader fc=new BufferedReader(new InputStreamReader(file));
		int c=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Plain Text: ");
		String msg=sc.nextLine();
		System.out.println("Cipher Text is:");
		for(int i=0;i<msg.length();i++)
		{
    		temp= (int) msg.charAt(i);
    		//System.out.println("ASCII is: "+temp);
    		int skipinFile=temp-97;
    		fc.skip(skipinFile);
    		c = fc.read();
    	    char c1 = (char) c;
    		System.out.print(c1);
    	    file.getChannel().position(0);
    	    fc = new BufferedReader(new InputStreamReader(file));
		}
		System.out.println();
		
	   }
}
