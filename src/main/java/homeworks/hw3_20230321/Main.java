package homeworks.hw3_20230321;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Please, enter count disks:");
    int n = scanner.nextInt();

//    System.out.println("By iterations:");
//    solvePuzzle1(n, 1, 2, 3);
    System.out.println("----------------------------------");
    System.out.println("By recursion:");
    solvePuzzle2(n, 1, 2, 3);
  }

  private void solvePuzzle1(int countDisk, int rod1, int rod2, int rod3) {
  }

  private static void solvePuzzle2(int countDisk, int rod1, int rod2, int rod3) {
    if (countDisk == 1) {
      System.out.println("Disk 1 " + rod1 + " -> " + rod3);
    } else {
      solvePuzzle2(countDisk - 1, rod1, rod3, rod2);
      System.out.println("Disk " + countDisk + " " + rod1 + " -> " + rod3);
      solvePuzzle2(countDisk - 1, rod2, rod1, rod3);
    }
  }
}
