package homeworks.hw10_20230516;

public class LinkedListDemo {
  public static void main(String[] args) {
    LinkedList list = new LinkedList();
    for (int i = 1; i <= 10; i++) {
      list.pushToTail(i*10);
    }
    list.print("Original linked list");
    list.pushToHead(1);
    list.pushToTail(199);
    list.pushToIndex(3, 11);
    list.print("Modified linked list");
    System.out.println("Get element (by index = 0) : " + list.get(0));
    System.out.println("Get element (by index = 3) : " + list.get(3));
    System.out.println("Get element (by index = 13) : " + list.get(13));
    System.out.println("Get element (by index = 14) : " + list.get(14));
    System.out.println("Delete first element : " + list.removeFirst());
    list.print("Modified linked list");
    System.out.println("Delete last element : " + list.removeLast());
    list.print("Modified linked list");
    System.out.println("Delete element (by index = 0): " + list.remove(0));
    System.out.println("Delete element (by index = 3): " + list.remove(3));
    list.print("Modified linked list");
  }
}
