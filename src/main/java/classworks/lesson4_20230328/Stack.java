package classworks.lesson4_20230328;

public class Stack {
  private Node top = null;

  public void push(int value) {
    Node temp = new Node();
    temp.value = value;
    if (isEmpty()) {
      top = temp;
      return;
    }
    temp.next = top;
    return;
  }

  public int pop() {
    int answer = top.value;
    return answer;
  }

  public boolean isEmpty() {
    return top == null;
  }

  public int peek(){
    return top.value;
  }
}

class Node {
  int value;
  Node next;
}
