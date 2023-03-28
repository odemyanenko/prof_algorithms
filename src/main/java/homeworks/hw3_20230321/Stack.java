package homeworks.hw3_20230321;

public class Stack {
  private String name;
  private Node top = null;

  public Stack(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void push(int value) {
    Node temp = new Node();
    temp.value = value;
    if (isEmpty()) {
      top = temp;
      return;
    }
    temp.next = top;
    top = temp;
  }

  public int pop() {
    int answer = top.value;
    top = top.next;
    return answer;
  }

  public boolean isEmpty() {
    return (top == null);
  }

  public int peek() {
    return top.value;
  }
}

class Node {
  int value;
  Node next;
}