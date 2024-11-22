package com.kp.design.patterns.singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationDriver {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException, CloneNotSupportedException {
		SingletonClass s1 = SingletonClass.getSingletonObject();
		System.out.println("s1 = "+s1.hashCode());
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("a.ob"));
		oos.writeObject(s1);
		System.out.println("--Serialization done----");
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("a.ob"));
		SingletonClass s2 = (SingletonClass) ois.readObject();
		System.out.println("s2 = "+s2.hashCode());
		SingletonClass sc = (SingletonClass) s1.clone();
		System.out.println("sc = "+sc.hashCode());
		
	}
}
