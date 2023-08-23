package classworks.lesson_20230823;

public class Main {
  public static void main(String[] args) {
    int[] array = {25, 10, 5, 1};
    int number = 63;

    int minCoints = getMinCoints(array, number);
    if (minCoints == -1) {
      System.out.println("Didnt work out");
    } else {
      System.out.println(minCoints);
    }
  }

  public static int getMinCoints(int[] arr, int num) {
    int count = 0;
    int index = 0;

    while (num > 0 && index < arr.length) {
      if (arr[index] <= num) {
        num = num - arr[index];
        count++;
      } else {
        index++;
      }
    }
    return num == 0 ? count : -1;
  }
}