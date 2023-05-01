package homeworks.hw5_20230404;

public class Main {
  public static void main(String[] args) {
    int number = 123;

    System.out.println("Task1. Sum of digits of the number: ");
    System.out.println(sumDigitsNumber(number));

    System.out.println("Task2. Reverse digits of the number: ");
    System.out.println(printReverseNumber(number));
  }

  public static int sumDigitsNumber(int number) {
    if (number < 10) {
      return number;
    }

    return (number % 10) + sumDigitsNumber(number / 10);
  }

  public static String printReverseNumber(int number){
    if (number < 10) {
      return Integer.toString(number);
    }

    return (number % 10) + " " + printReverseNumber(number/10);
  }
}
