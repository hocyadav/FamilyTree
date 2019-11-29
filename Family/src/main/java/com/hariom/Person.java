package com.hariom;

public class Person {
	
	String name;
	Gender gender;
	Node parent;
	String spouse;
	
	
	public Person(String name, Gender gender, Node parent, String spouse) {
		this.name = name;
		this.gender = gender;
		this.parent = parent;
		this.spouse = spouse;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Gender getGender() {
		return gender;
	}
	
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
	public Node getParent() {
		return parent;
	}
	
	public void setParent(Node parent) {
		this.parent = parent;
	}
	
	public String getSpouse() {
		return spouse;
	}
	
	public void setSpouse(String spouse) {
		this.spouse = spouse;
	}
	
	
}
