package homeworks.hw11_20230523;

import static homeworks.hw11_20230523.LinkedList.mergeLists;

public class Task4 {
  public static void main(String[] args) {
    LinkedList list1 = new LinkedList();
    LinkedList list2 = new LinkedList();
    LinkedList listMerged = new LinkedList();

    list1.pushToTail(10);
    list1.pushToTail(12);
    list1.pushToTail(20);

    list2.pushToTail(15);
    list2.pushToTail(16);
    list2.pushToTail(30);
    list2.pushToTail(40);

    list1.print("1-linked list:");
    list2.print("2-linked list:");

    LinkedList.Node headMergedLinkedList = mergeLists(listMerged, list1, list2);
    listMerged.print("Merged linked list:");
    System.out.println("Head value modified linked list: " + headMergedLinkedList.value);
  }
}
