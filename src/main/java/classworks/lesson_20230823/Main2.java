package classworks.lesson_20230823;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Main2 {
  public static void main(String[] args) {
    int[][] array = {{1, 2}, {1, 4}, {3, 4}, {0, 6}, {2, 5}, {7, 9}, {5, 8}, {2, 5}};
    System.out.println(Arrays.deepToString(greedy(array).toArray()));
  }

  public static ArrayList<int[]> greedy(int[][] arr) {
//    Arrays.sort(arr, (a, b) -> a[1] - b[1]);
    Arrays.sort(arr, Comparator.comparingInt(a -> a[1]));
    ArrayList<int[]> result = new ArrayList<>();
    result.add(arr[0]);

    int end = arr[0][1];

    for (int[] activity : arr) {
      if (activity[0] >= end) {
        result.add(activity);
        end = activity[1];
      }
    }

    return result;
  }
}