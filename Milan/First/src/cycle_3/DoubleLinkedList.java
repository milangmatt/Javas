/*Cycle 3
 *Experiment number : 1
 *Experiment Name :Doubly Linked List
 *Name: Milan George Mathew
 *Class: S3 DS
 *Roll No: 39
 *Date : 28-11-2023
 */


package cycle_3;
import java.util.*;

class Node{
	int data;
	Node prev;
	Node next;
	public Node(int data) {
		this.data=data;
		prev=null;
		next=null;
	}
}

class LinkedList{
	Node head;
	Node tail;
	public LinkedList() {
		head=null;
		tail=null;
	}
	void addNode(int data) {
		Node newNode=new Node(data);
		if(head==null) {
			head=newNode;
			tail=newNode;
		}
		else {
			tail.next=newNode;
			newNode.prev=tail;
			tail=newNode;
		}
	}
	void deleteNode(int data) {
		Node temp=head;
		while(temp.data!=data)
			temp=temp.next;
		if(temp==head) {
			head=temp.next;
			if(head==null) 
				tail=null;
			else
				head.prev=null;
		}
		else if(temp==tail) {
			tail=temp.prev;
			tail.next=null;
		}
		else {
			temp.prev.next=temp.next;
			temp.next.prev=temp.prev;
		}
		temp=null;
	}
	void displayNode() {
		Node temp=head;
		System.out.print("List-> "+temp.data);
		while(temp.next!=null) {
			temp=temp.next;
			System.out.print(" " + temp.data);
		}
	}
}

public class DoubleLinkedList {
	public static void main(String[] args) {
		int op=0,menu,item;
		Scanner sc=new Scanner(System.in);
		LinkedList ls=new LinkedList();
		while(op==0) {
			System.out.print("\n\nMenu\n1.Insertion \n2.Deletion \n3.Display \n4.Exit\nEnter choice :");
			menu=sc.nextInt();
			switch(menu) {
			case 1:
				System.out.print("Enter data to be added: ");
				item=sc.nextInt();
				ls.addNode(item);
				ls.displayNode();
				break;
			case 2:
				System.out.print("Enter data to be deleted: ");
				item=sc.nextInt();
				ls.deleteNode(item);
				ls.displayNode();
				break;
			case 3:
				ls.displayNode();
				break;
			case 4:
				System.out.println("\nExiting Program....");
				op=1;
				break;
			default:
				System.out.println("\nInvalid option");
				break;
			}
		}
		sc.close();
	}
}