package classworks.lesson12_20230530;

import classworks.lesson11_20230523.LinkedList;

public class Main {
  public static void main(String[] args) {
    LinkedList list = new LinkedList();
    list.pushToHead(5);
    list.pushToTail(9);
    list.pushToTail(11);
    list.pushToTail(16);
    list.pushToTail(21);

    LinkedList.Node fast = list.getHead();
    LinkedList.Node slow = list.getHead();

    while (fast != null && fast.next != null){
      fast = fast.next.next;
      slow = slow.next;
    }

    list.print();
    System.out.println("Middle element: " + slow.value);
  }
}
