package javaPrograms;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Exceptionskeywords {
	
	
	public void driving( int age)
	{
	if(age <18)
	{
		// syntax : throw new Exceptionname("message")    of a throw keyword
		throw new ArithmeticException("age should be less than 18");
		//throw new AgeException("age should be less than 18");
	}
	else
	{
		System.out.println("Age is right");

}
	}
	
	public void time() throws InterruptedException 
	{
		Thread.sleep(3000);   //  Thread.sleep(millsecondstime) - used to make the tool wait for particular
	}
	
	public void read() throws FileNotFoundException, IOException
	{
		FileReader f= new FileReader("C:\\Users\\vishal mittal\\Desktop\\abc.txt");
	
	}
	
/*	public void write() throws IOException
	{
		FileWriter f = new FileWriter("C:\\Users\\vishal mittal\\Desktop\\abc.txt");
		
		
	
	}*/
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Exceptionskeywords obj= new Exceptionskeywords();
		
		// Use try and catch to handle throw exceptions
		
			obj.driving(19);
		
	
		try {
			obj.read();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("filenotfound");
		} catch (IOException e) {
			// TODO Auto-generated catch block
		
			System.out.println("filenotfoundmessage");
		}
	
		
	
		
		

}
}