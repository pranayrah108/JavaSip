package com.code;

public class LinkedList {
	
	private Node head;

	public Node getHead() {
		return head;
	}

	public LinkedList() {
		super();
		head=null;
	}
	
	
	public boolean insert(int data) {
		Node newNode=new Node(data);
		if(newNode==null) {
			return false;
		}
		
		if(head==null) {
			head=newNode;
			return true;
		}
		
		Node last=head;
		while(last.getNext()!=null) {
			last=last.getNext();
		}
		
		last.setNext(newNode);
		
		
		
		return true;
	}
	
	
	
	

}
