package homeworks.hw11_20230523;

public class Task3 {
  public static void main(String[] args) {
    LinkedList list = new LinkedList();

    list.pushToTail(10);
    list.pushToTail(12);
    list.pushToTail(15);
    list.pushToTail(16);
    list.pushToTail(20);
    list.pushToTail(30);

    list.print("Base linked list:");
    LinkedList.Node headModifiedLinkedList = list.deleteNFromEndElement(3);
    list.print("Modified linked list:");
    System.out.println("Head value modified linked list: " + headModifiedLinkedList.value);
  }
}
