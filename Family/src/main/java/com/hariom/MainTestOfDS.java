package com.hariom;

public class MainTestOfDS {

	public static void main(String[] args) {

		
		//-------king-----------
		
		Person rootPerson = NodeImpl.getPersonObj("King Shan", Gender.MALE, null, "Queen anga");
		Node root = new Node(rootPerson);
		
		//------kings child level 1--------
		Person c1 = NodeImpl.getPersonObj("Chit", Gender.MALE, root, "Amba");
		Node node_c1 = new Node(c1);
		
		Person c2 = NodeImpl.getPersonObj("Ish", Gender.MALE, root, "");
		Node node_c2 = new Node(c2);
		
		Person c3 = NodeImpl.getPersonObj("Vich", Gender.MALE, root, "Lika");
		Node node_c3 = new Node(c3);
		
		Person c4 = NodeImpl.getPersonObj("Aras", Gender.MALE, root, "Chitra");
		Node node_c4 = new Node(c4);
		
		
		Person c5 = NodeImpl.getPersonObj("Satya", Gender.FEMALE, root, "Vyan");
		Node node_c5 = new Node(c5);
		
		root.childList.add(node_c1);
		root.childList.add(node_c2);
		root.childList.add(node_c3);
		root.childList.add(node_c4);
		root.childList.add(node_c5);

		//---------kings child node_c1 child-----------
		
		Person d1 = NodeImpl.getPersonObj("Dritha", Gender.FEMALE, node_c1, "Jaya");
		Node node_d1 = new Node(d1);
		
		Person d2 = NodeImpl.getPersonObj("Tritha", Gender.FEMALE, node_c1, "");
		Node node_d2 = new Node(d2);
		
		Person d3 = NodeImpl.getPersonObj("Vritha", Gender.MALE, node_c1, "");
		Node node_d3 = new Node(d3);
		
		node_c1.childList.add(node_d1);
		node_c1.childList.add(node_d2);
		node_c1.childList.add(node_d3);
		
		
		//-------kings child node_c3 child ------
		
		Person e1 = NodeImpl.getPersonObj("Vila", Gender.FEMALE, node_c3, "");
		Node node_e1 = new Node(e1);
		
		Person e2 = NodeImpl.getPersonObj("Chika", Gender.FEMALE, node_c3, "");
		Node node_e2 = new Node(e2);
		
		
		node_c3.childList.add(node_e1);
		node_c3.childList.add(node_e2);
		
		//-------child node_c4 child -----
		
		Person f1 = NodeImpl.getPersonObj("Jnki", Gender.FEMALE, node_c4, "Arit");
		Node node_f1 = new Node(f1);
		
		Person f2 = NodeImpl.getPersonObj("Ahit", Gender.MALE, node_c4, "");
		Node node_f2 = new Node(f2);
		
		
		node_c4.childList.add(node_f1);
		node_c4.childList.add(node_f2);
		
		//------child node_c5 child-----
		
		
		Person g1 = NodeImpl.getPersonObj("Asva", Gender.MALE, node_c5, "Satvy");
		Node node_g1 = new Node(g1);
		
		Person g2 = NodeImpl.getPersonObj("Vyas", Gender.MALE, node_c5, "Krpi");
		Node node_g2 = new Node(g2);
		
		Person g3 = NodeImpl.getPersonObj("Atya", Gender.FEMALE, node_c5, "");
		Node node_g3 = new Node(g3);
		
		node_c5.childList.add(node_g1);
		node_c5.childList.add(node_g2);
		node_c5.childList.add(node_g3);
		
		//-----level 1 completed-----
		
		//---level 2 start---
		
		//add Dritha(node_d1) child - 1 child
		
		Person h1 = NodeImpl.getPersonObj("Yodhan", Gender.MALE, node_d1, "");
		Node node_h1 = new Node(h1);
		
		node_d1.childList.add(node_h1);
		
		//add jnki(node_f1) child - 2 child
		
		Person i1 = NodeImpl.getPersonObj("Laki", Gender.MALE, node_f1, "");
		Node node_i1 = new Node(i1);
		
		Person i2 = NodeImpl.getPersonObj("Lavnya", Gender.FEMALE, node_f1, "");
		Node node_i2 = new Node(i2);
		
		node_f1.childList.add(node_i1);
		node_f1.childList.add(node_i2);
		
		
		// node_g1 1 child
		
		Person j1 = NodeImpl.getPersonObj("Vasa", Gender.MALE, node_g1, "");
		Node node_j1 = new Node(j1);
		
		node_g1.childList.add(node_j1);
		
		// node_g2 2 child
		
		Person k1 = NodeImpl.getPersonObj("Kriya", Gender.MALE, node_g2, "");
		Node node_k1 = new Node(k1);
		
		Person k2 = NodeImpl.getPersonObj("Krithi", Gender.FEMALE, node_g2, "");
		Node node_k2 = new Node(k2);
		
		node_g2.childList.add(node_k1);
		node_g2.childList.add(node_k2);
		
		
	}

}
