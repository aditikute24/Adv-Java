package com.tyss;

public class Student {

	private String name;
	private String email;
	private long phone;

	public Student(String name, String email, long phone) {
		this.name = name;
		this.email = email;
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", email=" + email + ", phone=" + phone + "]";
	}

}
