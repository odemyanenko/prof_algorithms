package classworks.lesson2_20230314;

import java.util.Arrays;

public class LineaBinarySearch {
  public static void main(String[] args) {
    int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    System.out.println(linearSearch(array, 5));
    System.out.println(linearSearch(array, 10));
    System.out.println("-----------------------------------");
    System.out.println(binarySearch(array, 5));
    System.out.println(binarySearch(array, 10));

    int size = 100000000;
    int[] arr = new int[size];
    for (int i = 0; i < size; i++) {
      arr[i] = (int)(100 * Math.random());
    }

    System.out.println("------------------");
    Arrays.sort(arr);
    long start = System.nanoTime();
    int a = linearSearch(arr, 50);
    System.out.println(System.nanoTime() - start);

    System.out.println("------------------");
    start = System.nanoTime();
    a = binarySearch(arr, 50);
    System.out.println(System.nanoTime() - start);
  }

  public static int linearSearch(int[] array, int target) {
    for (int i = 0; i < array.length; i++) {
      if (array[i] == target) {
        return i;
      }
    }
    return -1;
  }

  public static int binarySearch(int[] array, int target) {
    int left = 0;
    int right = array.length - 1;
    while (left <= right) {
      int mid = (left + right) / 2;
      if (array[mid] == target) {
        return mid;
      } else if (array[mid] < target) {
        left = mid + 1;
      } else {
        right = mid - 1;
      }
    }
    return -1;
  }
}
