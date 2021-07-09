package com.devblogs.beans;

public class SomeBean {
	private String value;
	
	public SomeBean(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Bean [value=" + value + "]";
	}
}