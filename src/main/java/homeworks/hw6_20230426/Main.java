package homeworks.hw6_20230426;

import java.util.Arrays;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    int[] list = {12, 10, 7, 2, 4, 6, 9, 15};
    System.out.println("Array before sort:");
    System.out.println(Arrays.toString(list));

    Integer pivot = qsort(list, 0, list.length - 1);
    System.out.println("Array after sort:");
    System.out.println(Arrays.toString(list));
    System.out.println("Pivot element: " + pivot);
  }

  private static Integer qsort(int[] array, int low, int high) {
    if (array.length < 2 || low >= high) {
      return null;
    }

    int pivot = array[low + (high - low) / 2];

    int i = low, j = high;
    while (i <= j) {
      while (array[i] < pivot) {
        i++;
      }
      while (array[j] > pivot) {
        j--;
      }
      if (i <= j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        i++;
        j--;
      }
    }

    if (low < j) {
      qsort(array, low, j);
    }
    if (high > i) {
      qsort(array, i, high);
    }
    return pivot;
  }
}
