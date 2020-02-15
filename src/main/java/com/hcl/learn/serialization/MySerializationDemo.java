package com.hcl.learn.serialization;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MySerializationDemo {

	public static void main(String[] args) {
		new MySerializationDemo().doSerialization();
		new MySerializationDemo().doDeserialization();
	}

	public void doSerialization() {
		System.out.println("\nInside doSerialization ...");

		SerializableDemo serializableDemo = new SerializableDemo();
		serializableDemo.setName("Java");
		// serializableDemo.setSomedatatype("hola");
		System.out.println("name (before serialization): " + serializableDemo.getName());
		System.out.println("id (before serialization): " + serializableDemo.getId());

		try (ObjectOutputStream out = new ObjectOutputStream(
				new BufferedOutputStream(new FileOutputStream("serial.ser")))) {
			out.writeObject(serializableDemo);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void doDeserialization() {
		System.out.println("\nInside doDeserialization ...");

		try (ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream("serial.ser")))) {
			SerializableDemo serializedObj = (SerializableDemo) in.readObject();
			System.out.println("name (after deserialization): " + serializedObj.getName());
			System.out.println("id (after deserialization): " + serializedObj.getId());
			System.out.println(serializedObj.getSomedatatype());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
