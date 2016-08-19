import java.io.*;
import java.nio.*;
import java.util.*;
import java.*;

public class Mono_D {
	public static void main(String args[]) throws IOException
	   {
		int temp=0;
		FileInputStream fis;
	    FileOutputStream fos;
	    fis= new FileInputStream("cipher_D.txt");
		fos= new FileOutputStream("plain_D.txt");
		FileInputStream file = new FileInputStream("key.txt");
		BufferedReader fc=new BufferedReader(new InputStreamReader(file));
		Scanner scanner = new Scanner( new File("key.txt") );
        String keyText = scanner.useDelimiter("\\A").next();
        scanner.close();
       
		while (fis.available() > 0) 
		{
		    temp= (int)fis.read();
		    int count=0;
		    for(int i=0;i<26;i++)
		    {
		        int charAT=(int)keyText.charAt(i);
    		    if(charAT==temp)
    		        count=97+i;
		    }
		    fos.write((char)count);
    		//System.out.print((char)count);
		}
	    System.out.println("Plain Text Written in File Successfully:");
	   }
}
