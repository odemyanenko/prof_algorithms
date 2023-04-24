package classworks.lesson6_20230418;

public class Main {
  public static void main(String[] args) {
//    1 уровень сложности: Task 1. Сумма цифр числа
//    Дано натуральное число N. Вычислите сумму его цифр.
//    При решении этой задачи нельзя использовать строки, списки, массивы (ну и циклы, разумеется).
    int a = 436;
    int sum = 0;
    while (a > 0) {
      int b = a % 10;
      System.out.println(b);
      sum = sum + b;
      a = a / 10;
    }
    System.out.println(sum);
    System.out.println();
    System.out.println(sum(436));
    System.out.println("--------------------");
    split1(436);
    System.out.println("--------------------");
    System.out.println(split2(436));
  }

  private static int sum(int n) {
    if (n < 10) {
      return n;
    }
    return n % 10 + sum(n / 10);
  }

  private static int split1(int n) {
    if (n < 10) {
      System.out.println(n + " ");
      return n;
    }

    System.out.print(n % 10 + " ");
    return split1(n / 10);
  }

  private static String split2(int n) {
    if (n < 10) {
      return Integer.toString(n);
    }

    return n % 10 + " " + split2(n / 10);
  }
}
