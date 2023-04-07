package homeworks.hw4_20230328;

import java.util.Scanner;

/*
Даны два целых числа x и n, напишите функцию для вычисления x^n
- рекурсивно O(n)
- улучшить решение 1 до O(log n)
*/

public class Task1 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter please 1-number (x):");
    int x = scanner.nextInt();

    System.out.println("Enter please 1-number (n):");
    int n = scanner.nextInt();

    System.out.println("0) x^n = " + getPowerIter(x, n));
    System.out.println("1) O(n) x^n = " + getPower1(x, n));
    System.out.println("2) (log n) x^n = " + getPower2(x, n));
  }

  private static int getPowerIter(int x, int n) {
    int p = 1;
    for (int i = 0; i < n; i++) {
      p = p * x;
    }
    return p;
  }

  private static int getPower1(int x, int n) {
    if (n == 0) {
      return 1;
    }
    return x * getPower1(x, n - 1);
  }

  private static int getPower2(int x, int n) {
    //  when n is even, using x^n = (x^(n/2))^2."
    if (n == 0) {
      return 1;
    }
    if (n % 2 == 0) {
      return getPower2(x * x, n / 2);
    }
    return x * getPower2(x * x, n / 2);
  }
}
