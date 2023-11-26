package interview_tasks.multithreading;

import java.util.LinkedList;

/*
Implement a simple producer-consumer problem using Java threads and synchronization.
*/

public class Task1_db {
  public static void main(String[] args) {
    final PC pc = new PC();

    Thread producerThread = new Thread(() -> {
      for (int i = 0; i < 10; i++) {
        pc.produce();
      }
    });

    Thread consumerThread = new Thread(() -> {
      for (int i = 0; i < 10; i++) {
        pc.consume();
      }
    });

    producerThread.start();
    consumerThread.start();
  }

  // PC (Produce-Consumer) class with synchronized methods
  static class PC {
    LinkedList<Integer> list = new LinkedList<>();
    int capacity = 2;

    public void produce() {
      synchronized (this) {
        while (list.size() == capacity) {
          try {
            wait();
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
        }
        int value = (int) (Math.random() * 100);
        System.out.println("Produced: " + value);
        list.add(value);
        notify();
      }
    }

    public void consume() {
      synchronized (this) {
        while (list.size() == 0) {
          try {
            wait();
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
        }
        int value = list.removeFirst();
        System.out.println("Consumed: " + value);
        notify();
      }
    }
  }
}
