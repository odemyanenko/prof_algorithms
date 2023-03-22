package classworks.lesson3_20230321;

public class Main {
  public static void main(String[] args) {
    System.out.println(factorialIter(3));
    System.out.println(factorialIter(5));
    System.out.println("------------------------------");
    System.out.println(factorialRecursive(3));
    System.out.println(factorialRecursive(5));
    System.out.println("------------------------------");
    int[] numbers = {1, 2, 3, -5, 6, 9};
    System.out.println(sumArray(numbers, numbers.length - 1));
    int[] numbers1 = {-5, 6, 9};
    System.out.println(sumArray(numbers1, numbers1.length - 1));
    System.out.println("------------------------------");
    int[] numbers2 = {3, 1, 2};
    System.out.println(minArrayElement(numbers2, 0));
    System.out.println("------------------------------");
    System.out.println(gcd(28, 20));
    System.out.println("------------------------------");
    System.out.println(getNFibonacci(6));
  }

  private static int getNFibonacci(int n) {
    if (n <= 1) {
      return 1;
    }
    return getNFibonacci(n - 1) + getNFibonacci(n - 2);
  }

  private static int gcd(int n, int m) {//NOD
    if (n == m) {
      return n;
    }
    if (n > m) {
      return gcd(n - m, m);
    } else {
      return gcd(n, m - n);
    }
  }

  private static int minArrayElement(int[] array, int i) {
    if (i < array.length) {
      int next = minArrayElement(array, i + 1);
      return array[i] < next ? array[i] : next;
    } else {
      return array[0];
    }
  }

  private static int sumArray(int[] array, int i) {
    if (i == 0) {
      return array[0];
    }
    return sumArray(array, i - 1) + array[i];
  }

  private static int factorialIter(int n) {
    int p = 1;
    for (int i = 2; i <= n; i++) {
      p *= i;
    }
    return p;
  }

  private static int factorialRecursive(int n) {
    if (n == 1) {
      return 1;
    }
    return factorialRecursive(n - 1) * n;
  }
}
