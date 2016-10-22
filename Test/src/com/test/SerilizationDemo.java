package com.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerilizationDemo {

	public static void main(String[] args) {
		Dog d=new Dog();
		FileOutputStream fos;
		try {
			fos = new FileOutputStream("dog");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(d);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		FileInputStream fis;
		try {
			fis = new FileInputStream("dog");
			ObjectInputStream ois=new ObjectInputStream(fis);
			Dog dd=(Dog) ois.readObject();
			System.out.println(dd);
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		

	}

}
class Dog implements Serializable{
	int i=10;
	String s="Demo";
	
	public String toString(){
		return i+s;
	}
}
