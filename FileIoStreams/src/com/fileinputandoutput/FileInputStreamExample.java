package com.fileinputandoutput;

import java.io.FileInputStream;

public class FileInputStreamExample {
	public static void main(String[] args) {
		try {
			FileInputStream fin = new FileInputStream("C:\\Users\\91799\\Documents\\Io Streams\\test.txt");
			 int i=fin.read();
			 System.out.println(fin.available());
//			System.out.print((char) i);
			System.out.print(i);

			fin.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
