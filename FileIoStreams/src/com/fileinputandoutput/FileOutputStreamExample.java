package com.fileinputandoutput;

import java.io.FileOutputStream;

public class FileOutputStreamExample {
	public static void main(String[] args) {

		try {

			FileOutputStream fout = new FileOutputStream("C:\\Users\\91799\\Documents\\Io Streams\\test.txt");
			fout.write(12);
//			fout.close();
//			String s1="hello";
//			byte b[]=s1.getBytes();//converting string into byte array   
//			fout.write(b);
			System.out.println("success...");
			// System.out.println(fout);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
