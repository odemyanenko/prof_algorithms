package homeworks.hw9_20230509;

public class QueueDemo {
  public static void main(String[] args) {
    int size = 2;
    Queue queue = new Queue(size);

    System.out.println("Array: " + queue + ", isEmpty = " + queue.isEmpty() +", size = " + queue.size());

    System.out.println("-----------------------------------------------------------------------------------------------------------------");
    queue.pushToEnd(1);
    System.out.println("Get first element in Queue: " + queue.peek());
    System.out.println("Array: " + queue + ", isEmpty = " + queue.isEmpty() +", size = " + queue.size());

    System.out.println("-----------------------------------------------------------------------------------------------------------------");
    queue.pushToEnd(2);
    System.out.println("Get first element in Queue: " + queue.peek());
    System.out.println("Array: " + queue + ", isEmpty = " + queue.isEmpty() +", size = " + queue.size());

    System.out.println("-----------------------------------------------------------------------------------------------------------------");
    queue.pushToEnd(3);
    System.out.println("Get first element in Queue: " + queue.peek());
    System.out.println("Array: " + queue + ", isEmpty = " + queue.isEmpty() +", size = " + queue.size());

    System.out.println("-----------------------------------------------------------------------------------------------------------------");
    queue.pushToEnd(4);
    System.out.println("Get first element in Queue: " + queue.peek());
    System.out.println("Array: " + queue + ", isEmpty = " + queue.isEmpty() +", size = " + queue.size());

    System.out.println("-----------------------------------------------------------------------------------------------------------------");
    System.out.println("Get first element in Queue: " + queue.peek());
    System.out.println("Array: " + queue + ", isEmpty = " + queue.isEmpty() +", size = " + queue.size());

    System.out.println("-----------------------------------------------------------------------------------------------------------------");
    System.out.println("Remove first element in Queue: " + queue.remove());
    System.out.println("Get first element in Queue: " + queue.peek());
    System.out.println("Array: " + queue + ", isEmpty = " + queue.isEmpty() +", size = " + queue.size());

    System.out.println("-----------------------------------------------------------------------------------------------------------------");
    System.out.println("Remove first element in Queue: " + queue.remove());
    System.out.println("Get first element in Queue: " + queue.peek());
    System.out.println("Array: " + queue + ", isEmpty = " + queue.isEmpty() +", size = " + queue.size());

    System.out.println("-----------------------------------------------------------------------------------------------------------------");
    System.out.println("Remove first element in Queue: " + queue.remove());
    System.out.println("Get first element in Queue: " + queue.peek());
    System.out.println("Array: " + queue + ", isEmpty = " + queue.isEmpty() +", size = " + queue.size());

    System.out.println("-----------------------------------------------------------------------------------------------------------------");
    System.out.println("Remove first element in Queue: " + queue.remove());
    System.out.println("Get first element in Queue: " + queue.peek());
    System.out.println("Array: " + queue + ", isEmpty = " + queue.isEmpty() +", size = " + queue.size());

    System.out.println("-----------------------------------------------------------------------------------------------------------------");
    System.out.println("Remove first element in Queue: " + queue.remove());
    System.out.println("Get first element in Queue: " + queue.peek());
    System.out.println("Array: " + queue + ", isEmpty = " + queue.isEmpty() +", size = " + queue.size());
  }
}
