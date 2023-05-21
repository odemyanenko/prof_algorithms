package homeworks.hw9_20230509;

import java.util.Arrays;

public class Queue {
  private int[] arr;      // массив для хранения элементов queue
  private int head;      // head указывает на первый элемент в queue
  private int tail;       // tail часть указывает на последний элемент в queue
  private int capacity;   // максимальная емкость queue
  private int count;      // текущий размер queue

  public Queue(int size) {
    arr = new int[size];
    capacity = size;
    head = 0;
    tail = -1;
    count = 0;
  }

  public int size() {
    return count;
  }

  public boolean isEmpty() {
    return (count == 0);
  }

  public int peek() {
    if (count == 0) {
      System.out.println("Queue is empty!");
      return -1;
    }
    return arr[0];
  }

  public void pushToEnd(int data) {
    if (count == capacity) {
      System.out.println("Queue is full!");
      return;
    }
    arr[count] = data;
    tail = count;

    count++;
  }

  public int remove() {
    if (isEmpty()) {
      System.out.println("Queue is empty");
      return -1;
    }
    int value = arr[head];

    arr[head] = 0;
    for (int i = head + 1; i <= tail; i++) {
      arr[i - 1] = arr[i];
    }
    if (head != tail) {
      arr[tail] = 0;
    }

    tail--;
    count--;

    return value;
  }

  @Override
  public String toString() {
    return "Queue{" +
            "arr=" + Arrays.toString(arr) +
            ", head=" + head +
            ", tail=" + tail +
            ", capacity=" + capacity +
            ", count=" + count +
            '}';
  }
}

