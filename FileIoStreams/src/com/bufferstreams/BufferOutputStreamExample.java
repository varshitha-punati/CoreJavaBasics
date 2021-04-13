package com.bufferstreams;

import java.io.FileNotFoundException;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferOutputStreamExample {
	public static void main(String[] args) throws IOException {
		try {
			FileOutputStream bfout=new FileOutputStream("C:\\Users\\91799\\Documents\\Io Streams\\testbuffer.txt");
		
			BufferedOutputStream bout=new BufferedOutputStream(bfout);
			String s="Hello world java";
			byte b[]=s.getBytes();    
		     bout.write(b);    
		     bout.flush();    
		     bout.close();    
		     bfout.close();    
		     System.out.println("success");    
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
