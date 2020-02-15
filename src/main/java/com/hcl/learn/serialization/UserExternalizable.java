package com.hcl.learn.serialization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Date;

public class UserExternalizable implements Externalizable {

	public static final long serialVersionUID = 1234L;

	// attributes
	private int code;
	private String name;
	private String password;
	private Date birthday;
	private int socialSecurityNumber;

	public UserExternalizable() {
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeInt(code);
		out.writeObject(name);

		// write empty password:
		out.writeObject("");

		out.writeObject(birthday);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		this.code = in.readInt();
		this.name = (String) in.readObject();
		this.password = (String) in.readObject();
		this.birthday = (Date) in.readObject();
	}

	// Getter Setter Methods

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public int getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	public void setSocialSecurityNumber(int socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}

	@Override
	public String toString() {
		return "UserExternalizable [code=" + code + ", name=" + name + ", password=" + password + ", birthday="
				+ birthday + ", socialSecurityNumber=" + socialSecurityNumber + "]";
	}

}
