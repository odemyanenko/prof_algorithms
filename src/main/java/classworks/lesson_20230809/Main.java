package classworks.lesson_20230809;

/*
 *
 */

public class Main {
  public static void main(String[] args) {
    System.out.println(pathCalc(4, 5));

    System.out.println("---------------------");
    System.out.println(getSum(new int[]{1, 2, 3, 4, 5}));
    System.out.println("---------------------");
    System.out.println(getSumRecursion(new int[]{1, 2, 3, 4, 5}));

    System.out.println("---------------------");
    System.out.println(getPower(2, 3));

    System.out.println("---------------------");
    System.out.println(getPowerWithRecursion(2, 3));

    System.out.println("---------------------");
    System.out.println(getNOD(140, 96));

    System.out.println("---------------------");
    System.out.println(getFactorial(10));
  }


  public static int getFactorial(int num) {
    if (num == 0 || num == 1) {
      return 1;
    }
    return getFactorial(num - 1) * num;
  }

  public static int getNOD(int number1, int number2) {
    if (number2 == 0) {
      return number1;
    }
    return getNOD(number2, number1 % number2);
  }

  public static int getPowerWithRecursion(int num, int pow) {
    if (pow == 0) {
      return 1;
    }
    return num * getPowerWithRecursion(num, pow - 1);
  }

  public static int getPower(int num, int pow) {
    int result = 1;
    for (int i = 1; i <= pow; i++) {
      result *= num;
    }
    return result;
  }

  public static int pathCalc(int m, int n) {
    if (m < 1 || n < 1) {
      return 0;
    }
    if (m == 1 || n == 1) {
      return 1;
    }
    return pathCalc(m - 1, n) + pathCalc(m, n - 1);
  }

  public static int getSum(int[] array) {
    int sum = 0;
    for (int j : array) {
      sum += j;
    }
    return sum;
  }

  public static int getSumRecursion(int[] array) {
    return getSum(array, array.length - 1);
  }

  private static int getSum(int[] array, int index) {
    if (index < 0) {
      return 0;
    }
    return array[index] + getSum(array, index - 1);
  }
}
