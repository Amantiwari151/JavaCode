package com.java.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Serialization {
	
	public static void main(String[] args) {
		
		ArrayList<String> aList = new ArrayList<>();
		aList.add("Jay");
		aList.add("Roy");
		aList.add("Code");
		
		try {
//			Serialization converts an object into sequence of bytes which can be persisted to a hdisk or db or can be 
//			sent through streams.
			FileOutputStream fos = new FileOutputStream("D:\\Demo.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(aList);
			fos.close();
			oos.close();
			
//			De-serialization => converts byteStream into object
			FileInputStream fis = new FileInputStream("D:\\Demo.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			ArrayList list = (ArrayList) ois.readObject();
			System.out.println(list);
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}
