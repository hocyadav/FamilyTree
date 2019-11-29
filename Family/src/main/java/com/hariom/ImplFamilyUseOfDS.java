package com.hariom;

import java.util.LinkedList;
import java.util.Queue;

public class ImplFamilyUseOfDS {
	Node headMember;
	
	//ADD_CHILD ”Mother’s-Name" "Child's-Name" "Gender"
	public void addMothersChild(String mothersName, String childName, String gender) {
		//check for mother
		Node mother = findMother();
		
		
		//add child
		if(mother != null) {
			//create child person obj
			//create child node obj
			Person newPersonDetails = new Person(childName, gender, null, null);
			//Node nn = new Node(cp);//this we are creating inside addChild method
			
			addChild(mother, newPersonDetails);
		}
	}
	
	private Node findMother(Node headMember, String motherName) {//recursion??
		//traverse from root 
		//if children present then traverse children
		//if children of children present then traverse - for loop
		
		if(headMember == null) return null;
		if(headMember.personDetails.getName() == motherName) {
			return headMember;
		}
		else {
			Node t = headMember;
			
			(t.personDetails.getGender() == "Male")
			
			
			Node m = null;
			LinkedList<Node> cList = t.childList;
			
			for(int i=0; i < cList.size();i++) {
				m = findMother(cList.get(i), motherName);
				
				if(m != null) {
					//mother node found 
					//check for hunband
					if(m.personDetails.getSpouseOfThisPerson() != null){
						break;
					}
				}
				
			}
			return m;
			
		}
		
		
	}
	
	private void addChild(Node mother, Person newPersonDetails) {//mother node address , child detail- simply add
		Node newChildNode = new Node(newPersonDetails);
		mother.childList.add(newChildNode);
	}


	//GET_RELATIONSHIP ”Name” “Relationship”
	public void getRelationship(String personName, String relation) {
		
	}
	
	
	public void printLevelOrder() {
		Queue<Node> qq = new LinkedList<>();
		qq.add(headMember);
		
		while(!qq.isEmpty()) {
			Node t = qq.poll();
			System.out.print(t.person.name+ " ");
			//System.out.println(t.personName.spouseOfThisPerson);
			
			String husWife = t.person.spouse;
			
			if(husWife != null)
				System.out.print("<-> "+husWife+" ");
			  
			for(int i=0; i < t.childList.size(); i++) {
				Node childNode = t.childList.get(i);
				qq.add(childNode);
			}
			System.out.println();
			
		}
		System.out.println();
	}	
}
