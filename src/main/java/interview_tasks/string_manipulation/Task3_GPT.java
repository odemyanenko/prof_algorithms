package interview_tasks.string_manipulation;

public class Task3_GPT {
  public static long findNextSquare(long n) {
    // Calculate the square root of n
    double sqrt = Math.sqrt(n);

    // Check if it's an integer (perfect square)
    if (sqrt == (int) sqrt) {
      // Increment the square root and square the result
      return (long) Math.pow(sqrt + 1, 2);
    } else {
      // n is not a perfect square
      return -1;
    }
  }

  public static void main(String[] args) {
    long input1 = 121;
    long input2 = 625;
    long input3 = 114;

    System.out.println(findNextSquare(input1)); // Output: 144
    System.out.println(findNextSquare(input2)); // Output: 676
    System.out.println(findNextSquare(input3)); // Output: -1
  }
}
