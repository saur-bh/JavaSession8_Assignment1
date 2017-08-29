/*
 * Write a program for file copy.
	Note: Destination file should have same contents as Source file.
 */


package com.acadglid.session;
import java.io.*;

public class Assignment1 
{
	public static void main(String[] args)
	{	
		FileInputStream source = null;
		FileOutputStream destination = null;

		try{
			File reader =new File("Source.txt");
			File writer =new File("Destination.txt");

			source = new FileInputStream(reader);
			destination = new FileOutputStream(writer);

			byte[] buffer = new byte[1024];

			int length;
			
			//copying the contents from source to destination using  read and write methods
		
			while ((length = source.read(buffer)) > 0){
				destination.write(buffer, 0, length);
			}

			//Closing the input/output file streams
			source.close();
			destination.close();

			System.out.println("File copy done");

		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
