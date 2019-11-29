package com.hariom;

public class NodeImpl {

	Node root;
	
	//TODO: singleton 
	
	public static Person getPersonObj(String name, Gender gender, Node parent, String spouse) {
		Person rootPerson = new Person(name, gender, parent, spouse);
		return rootPerson;
	}
	
	
}
