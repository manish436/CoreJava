package com.hcl.learn.serialization;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

public class MyExternalizationDemo {

	public static void main(String[] args) {
		new MyExternalizationDemo().doSerialization();
		new MyExternalizationDemo().doDeserialization();
	}

	public void doSerialization() {
		System.out.println("\nInside doSerialization ...");

		UserExternalizable user = new UserExternalizable();
		user.setCode(123);
		user.setName("Tom");
		user.setBirthday(new Date());
		user.setPassword("secret123");
		user.setSocialSecurityNumber(1234567890);

		System.out.println("name (before serialization): " + user.getName());
		System.out.println("id (before serialization): " + user.getCode());

		try (ObjectOutputStream out = new ObjectOutputStream(
				new BufferedOutputStream(new FileOutputStream("exerial.ser")))) {
			out.writeObject(user);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void doDeserialization() {
		System.out.println("\nInside doDeserialization ...");

		try (ObjectInputStream in = new ObjectInputStream(
				new BufferedInputStream(new FileInputStream("exerial.ser")))) {
			UserExternalizable user = (UserExternalizable) in.readObject();
			System.out.println("UserExternalizable (after deserialization): " + user.toString());
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
