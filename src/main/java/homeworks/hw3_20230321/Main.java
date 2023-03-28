package homeworks.hw3_20230321;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Please, enter count disks:");
    int n = scanner.nextInt();

    System.out.println("By iterations:");
    solvePuzzle1(n);

//    solvePuzzle1(n, 1, 2, 3);
    System.out.println("----------------------------------");
    System.out.println("By recursion:");
    solvePuzzle2(n, 1, 2, 3);
  }

  private static void solvePuzzle1(int countDisk) {
    Stack rod1 = new Stack("1");
    Stack rod2 = new Stack("2");
    Stack rod3 = new Stack("3");

    boolean isEven = (countDisk % 2 == 0);

    for (int i = countDisk; i >= 1; i--) {
      rod1.push(i);
    }

    while (true) {
      if (isEven) {
        swap(rod1, rod2);
      } else {
        swap(rod1, rod3);
      }
      if (rod1.isEmpty() && rod2.isEmpty()) {
        break;
      }

      if (isEven) {
        swap(rod1, rod3);
      }
      else {swap(rod1, rod2);};
      if (rod1.isEmpty() && rod2.isEmpty()) {
        break;
      }

      swap(rod2, rod3);
      if (rod1.isEmpty() && rod2.isEmpty()) {
        break;
      }
    }
  }

  private static void solvePuzzle2(int countDisk, int rod1, int rod2, int rod3) {
    if (countDisk == 1) {
      System.out.println("Disk 1: " + rod1 + " -> " + rod3);
    } else {
      solvePuzzle2(countDisk - 1, rod1, rod3, rod2);
      System.out.println("Disk " + countDisk + ": " + rod1 + " -> " + rod3);
      solvePuzzle2(countDisk - 1, rod2, rod1, rod3);
    }
  }

  private static void swap(Stack a, Stack b) {
    if (a.isEmpty()) {
      System.out.println(b.getName() + " - > " + a.getName());
      a.push(b.pop());
    } else if (b.isEmpty()) {
      System.out.println(a.getName() + " - > " + b.getName());
      b.push(a.pop());
    } else {
      if (a.peek() > b.peek()) {
        System.out.println(b.getName() + " - > " + a.getName());
        a.push(b.pop());
      } else {
        System.out.println(a.getName() + " - > " + b.getName());
        b.push(a.pop());
      }
    }
  }
}
