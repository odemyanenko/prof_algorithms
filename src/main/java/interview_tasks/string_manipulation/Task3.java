package interview_tasks.string_manipulation;

/*
*You might know some pretty large perfect squares. But what about the NEXT one?

Complete the findNextSquare method that finds the next integral perfect square after the one passed as a parameter.
* Recall that an integral perfect square is an integer n such that sqrt(n) is also an integer.

If the parameter is itself not a perfect square then -1 should be returned.
* You may assume the parameter is non-negative.

Examples:(Input --> Output)

121 --> 144
625 --> 676
114 --> -1 since 114 is not a perfect square
* */

public class Task3 {
  public static void main(String[] args) {
    System.out.println(findNextSquare(121));
    System.out.println(findNextSquare(625));
    System.out.println(findNextSquare(114));
  }

  public static long findNextSquare(long sq) {
    if (!isPerfectSquare(sq)) {
      return -1;
    }
    return searchNextNumber(++sq);
  }

  private static boolean isPerfectSquare(long number) {
    double sqValue = Math.sqrt(number);
    return ((sqValue - (int) sqValue) == 0);
  }

  private static long searchNextNumber(long number) {
    if (isPerfectSquare(number)) {
      return number;
    }
    return searchNextNumber(++number);
  }
}
