package classworks.lesson4_20230328;

public class Main {
  public static void main(String[] args) {
    Stack first = new Stack();
    Stack second = new Stack();
    Stack third = new Stack();

    int count = 3;
    for (int i = count; i >= 1; i--) {
      first.push(i);
    }
    while (!first.isEmpty() || !second.isEmpty()) {
      //1-3
      if (first.isEmpty()){
        System.out.println("3 -> 1");
        first.push(third.pop());
      }
      else if (third.isEmpty()){
        //1-3
        System.out.println("1 -> 3");
        third.push(first.pop());
      }
      else {
        if (first.peek() > third.peek()){

        }
      }
    }

  }

  /*
    public static void main(String[] args) {
    Stack stack = new Stack();
    stack.push(10);
    stack.push(20);
    stack.push(30);
    System.out.println(stack.pop());
    while (!stack.isEmpty()){
      System.out.println(stack.pop());
    }
  }
  * */
}
