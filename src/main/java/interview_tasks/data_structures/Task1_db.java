package interview_tasks.data_structures;

/*
Create a simple linked list data structure with basic operations like insert, delete, and search.
*/

public class Task1_db {
  public static void main(String[] args) {
    LinkedList list = new LinkedList();
    list.insert(10);
    list.insert(20);
    list.insert(30);

    System.out.println("Linked List:");
    list.display();

    list.delete(20);

    System.out.println("Linked List after deleting 20:");
    list.display();

    System.out.println("Search 20: " + list.search(20));
    System.out.println("Search 30: " + list.search(30));
  }
}
class LinkedList {
  // Node class to represent individual elements in the list
  class Node {
    int data;
    Node next;

    Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  private Node head;

  // Constructor to initialize an empty linked list
  public LinkedList() {
    head = null;
  }

  // Insert a new node at the end of the linked list
  public void insert(int data) {
    Node newNode = new Node(data);
    if (head == null) {
      head = newNode;
    } else {
      Node current = head;
      while (current.next != null) {
        current = current.next;
      }
      current.next = newNode;
    }
  }

  // Delete a node with the given data
  public void delete(int data) {
    if (head == null) {
      return; // List is empty, nothing to delete
    }

    if (head.data == data) {
      head = head.next;
      return; // Data found at the head
    }

    Node current = head;
    while (current.next != null) {
      if (current.next.data == data) {
        current.next = current.next.next; // Skip the node to be deleted
        return;
      }
      current = current.next;
    }
  }

  // Search for a node with the given data and return true if found
  public boolean search(int data) {
    Node current = head;
    while (current != null) {
      if (current.data == data) {
        return true;
      }
      current = current.next;
    }
    return false;
  }

  // Display the linked list
  public void display() {
    Node current = head;
    while (current != null) {
      System.out.print(current.data + " -> ");
      current = current.next;
    }
    System.out.println("null");
  }
}
