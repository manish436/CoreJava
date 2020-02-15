package com.hcl.learn.serialization;

import java.io.Serializable;

public class SerializableDemo extends ParentClass implements Serializable {
	private static final long serialVersionUID = -8595879673089108173L;
	private String name;
	private int somedatatype;
	NewSubClass newSubClassObject = new NewSubClass();

	public SerializableDemo() {
		System.out.println("SerializableDemo: Constructor");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private transient int id = 4;

	public int getId() {
		return id;
	}

	public int getSomedatatype() {
		return somedatatype;
	}

	public void setSomedatatype(int somedatatype) {
		this.somedatatype = somedatatype;
	}

	// private String gender;
}
