package com.hariom;

import java.util.LinkedList;

public class Node {
	Person person;
	LinkedList<Node> childList;
	
	
	public Node(Person p) {
		person = p;
		childList = new LinkedList<>();
	}
}

/*
sister in law

*/
