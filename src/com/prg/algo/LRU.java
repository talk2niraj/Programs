package com.prg.algo;

public class LRU {

	private Node cache; 
	
	public LRU(int restrictedCapacity) {
		cache = new Node(restrictedCapacity);
	}
	
	public synchronized String getValue(String value) {
		
		if(cache.size() == 0) {
			return null;
		}

		return cache.getValue(value);
	}
	
	public synchronized void setValue(String value) {
		cache.add(value);
	}
	
	public static void main(String[] args) {
		LRU lru = new LRU(10);
		
		lru.setValue("A");
		lru.setValue("B");
		lru.setValue("C");
		lru.setValue("D");
		lru.setValue("E");
		lru.setValue("F");
		lru.setValue("G");
		lru.setValue("H");
		lru.setValue("I");
		lru.setValue("J");
		
		lru.getValue("D");
		
		lru.setValue("K");
		lru.getValue("K");
	}
}

class Node {
	private int size;
	private Node next;
	private Node previous;
	private String value;
	private int capacity;
	
	public Node(int restrictedCapacity) {
		this.capacity = restrictedCapacity;
	}

	public String getValue(String value) {
		displayNodes();
		Node tempNode = this.next;
		
		while (tempNode.next != null) {
			if (tempNode.value.equals(value)) {
				System.out.println("found:"+tempNode.value);
				
				Node temp = tempNode.previous;
				temp.next = tempNode.next;
				
				Node newNode = tempNode;
				
				while (tempNode.previous != null) {
					tempNode = tempNode.previous;
				}
				tempNode = tempNode.next;
				newNode.next = tempNode;
				tempNode.previous = newNode;
				displayNodes();
				return value;
			}
			tempNode = tempNode.next;
		}
//		tempNode = tempNode.previous;
		if (tempNode.value.equals(value)) {
			System.out.println("found:"+tempNode.value);
			
			Node newNode = tempNode;
			
			while (tempNode.previous != null) {
				tempNode = tempNode.previous;
			}
			tempNode = tempNode.next;
			System.out.println(tempNode.value);
			newNode.next = tempNode;
			tempNode.previous = newNode;
			displayNodes();
			return value;
		}
		
		System.out.println("not found:"+value);
		return null;
	}

	public Node(String value) {
		this.value = value;
	}
	
	public int size() {
		return size;
	}
	
	public void add(String value) {
		Node newNode = new Node(value);
		displayNodes();
		if (size == 0) {
			this.next = newNode;
			newNode.previous = this;
			size++;
			return;
		} 
		
		Node tempNode = this.next;
		
		while (tempNode.next != null) {
			tempNode = tempNode.next;
		}

		if (size == capacity) {
			tempNode = tempNode.previous;
			tempNode.next = newNode;
			return;
		}
		
		tempNode.next = newNode;
		newNode.previous = tempNode;
		
		size++;
	}
	
	public void displayNodes() {
		
		if (this.next == null) {
			System.out.println("No node");
			return;
		} 
		
		Node tempNode = this.next;
		while (tempNode.next != null) {
			System.out.print(tempNode.value + "<---->");
			tempNode = tempNode.next;
		}
		System.out.print(tempNode.value + "<---->");
		System.out.println("NULL");
	}
}
