package exception;

import java.io.*;

public class FileTest {

	public static void main(String[] args) {
		
		try{
			FileInputStream fis= new FileInputStream("/hello.txt");
			fis.read();
		}catch(FileNotFoundException ex){
			System.out.println("file not found");
		}catch(IOException ex){
			System.out.println("file read failed");
		}
	}

}
