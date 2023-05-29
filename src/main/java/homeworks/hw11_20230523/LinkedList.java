package homeworks.hw11_20230523;

public class LinkedList {

  private Node head;

  public Node getHead() {
    return head;
  }

  public void pushToHead(int data) {
    Node temp = new Node();
    temp.value = data;
    temp.next = head;
    head = temp;
  }

  public void pushToTail(int data) {
    Node temp = new Node();
    temp.value = data;
    if (head == null) {
      // Список пустой, значит новый элемент и есть head.
      // Искать "хвост" не нужно
      head = temp;
    } else {
      // Список не пустой. Ищем "хвост" списка
      Node t = head;
      while (t.next != null) {
        t = t.next;
      }
      t.next = temp;
    }
  }

  public void pushToIndex(int index, int data) {
    Node temp = new Node();
    temp.value = data;
    if (index <= 0) {
      // То вставляем temp со стороны "головы" списка
      pushToHead(data);
    }
    int count = 0;
    Node t = head;
    while (t.next != null) {
      if (count == index - 1) {
        break;
      }
      count++;
      t = t.next;
    }
    // t указывает на элемент, после которого мы должны вставить temp
    temp.next = t.next;
    t.next = temp;
  }

  public int removeFirst() {
    if (size() == 0) {
      System.out.println("Linked list is Empty!");
      return Integer.MIN_VALUE;
    }
    Node temp = head;

    head = temp.next;
    temp.next = null;

    return temp.value;
  }

  public int removeLast() {
    if (size() == 0) {
      System.out.println("Linked list is Empty!");
      return Integer.MIN_VALUE;
    }
    Node temp = head;

    while (temp.next != null) {
      if (temp.next.next == null) {
        Node lastNode = temp.next;
        temp.next = null;
        return lastNode.value;
      }
      temp = temp.next;
    }

    int value = head.value;
    head = null;

    return value;
  }

  public int remove(int index) {
    if (index < 0 || index >= size()) {
      System.out.println("Index out of bound!");
      return Integer.MIN_VALUE;
    }

    if (index == 0) {
      return removeFirst();
    } else if (index == size() - 1) {
      return removeLast();
    } else {

      int num = 0;
      Node temp = head;

      while (temp.next != null) {
        if (++num == index && temp.next.next != null) {
          Node indexNode = temp.next;
          temp.next = indexNode.next;
          indexNode.next = null;

          return indexNode.value;
        }
        temp = temp.next;
      }
    }

    return Integer.MIN_VALUE;
  }

  public int get(int index) {
    if (index <= 0 || index > size()) {
      System.out.println("Index out of bound!");
      return Integer.MIN_VALUE;
    }

    int num = 0;
    Node temp = head;

    while (temp.next != null) {
      if (++num == index) {
        return temp.value;
      }
      temp = temp.next;
    }

    return temp.value;
  }

  public int size() {
    int size = 0;

    Node node = head;
    while (node != null) {
      size++;
      node = node.next;
    }

    return size;
  }

  public void print(String message) {
    System.out.println(message + " (size = " + size() + ")");

    int num = 0;
    Node node = head;

    while (node != null) {
      num++;

      if (node.next != null) {
        System.out.printf("%2d : %-3d (next : %3d)", num, node.value, node.next.value);
      } else {
        System.out.printf("%2d : %-3d (next :  - )", num, node.value);
      }
      if (node == head) {
        System.out.println(" (head)");
      } else {
        System.out.println();
      }

      node = node.next;
    }
  }

  public Node deleteNFromEndElement(int index) {
    if (index <= 0 || index >= size()) {
      System.out.println("Index out of bound!");
      return null;
    }
    Node prev, temp;

    prev = head;
    temp = head;
    int count = 0;
    int indexPrev = 0;

    while (temp.next != null) {
      if (count == index) {
        prev = temp;
        indexPrev += count;
        count = 0;
      }
      count++;
      temp = temp.next;
    }

    if (count == index) {
      remove(indexPrev);
    } else {
      remove(indexPrev - count);
    }
    return head;
  }

  private static Node getNexNode(LinkedList list, LinkedList.Node node) {
    list.pushToTail(node.value);
    node = node.next;
    return node;
  }

  public static Node mergeLists(LinkedList destination, LinkedList source1, LinkedList source2) {
    Node temp1 = source1.getHead();
    Node temp2 = source2.getHead();

    while (temp1 != null || temp2 != null) {
      if (temp2 == null) {
        temp1 = getNexNode(destination, temp1);
      } else if (temp1 == null) {
        temp2 = getNexNode(destination, temp2);
      } else if (temp1.value < temp2.value) {
        temp1 = getNexNode(destination, temp1);
      } else {
        temp2 = getNexNode(destination, temp2);
      }
    }

    return destination.getHead();
  }

  class Node {
    int value;
    Node next;
  }

}