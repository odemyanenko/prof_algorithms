package classworks.lesson6_20230418;

public class Main2 {
  public static void main(String[] args) {

  }

  private static void printNaturalNumbers(int lower, int n) {
    if (lower <= n) {
      printNumber(lower);
      lower += 1;
      helperFunction(lower, n);
    } else {
      return;
    }
  }

  private static void helperFunction(int lower, int n) {
    if (lower <= n) {
      printNumber(lower);
      lower +=1;
      printNaturalNumbers(lower, n);
    }
  }

  private static void printNumber(int lower) {
    System.out.println(lower);
  }
}
