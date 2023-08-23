package classworks.lesson_20230823;

import java.util.Arrays;

public class Sort {
  public static void main(String[] args) {
    int[] array = {0, 1, 0, 1, 1, 1, 0, 0, 0};
    System.out.println(Arrays.toString(sortArray(array)));
  }

  public static int[] sortArray(int[] arr) {
    int count = 0;
    for (int j : arr) {
      if (j == 0) count++;
    }
    for (int i = 0; i < count; i++) {
      arr[i] = 0;
    }
    for (int i = count; i < arr.length; i++) {
      arr[i] = 1;
    }
    
    return arr;
  }
}