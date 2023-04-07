package classworks.lesson5_20230404;

import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    System.out.println("BubbleSort---------------------");
    int[] array = {10, 8, 7, 5, 13, 11};
    System.out.println(Arrays.toString(array));
    bubbleSort(array);
    System.out.println(Arrays.toString(array));

    System.out.println("SelectSort---------------------");
    int[] array2 = {10, 8, 7, 5, 13, 11};
    System.out.println(Arrays.toString(array2));
    selectSort(array2);
    System.out.println(Arrays.toString(array2));

    System.out.println("MergeSort---------------------");
    int[] array3 = {10, 8, 7, 5, 13, 11};
    System.out.println(Arrays.toString(array3));
    mergeSort(array3);
    System.out.println(Arrays.toString(array3));
  }

  private static void mergeSort(int[] array) {
    mergeSortRecursive(array, array.length);
  }

  private static void mergeSortRecursive(int[] array, int n) {
    if (n < 2) {
      return;
    }
    int mid = n / 2;
    int[] l = new int[mid];
    int[] r = new int[n - mid];

    for (int i = 0; i < mid; i++) {
      l[i] = array[i];
    }
    for (int i = mid; i < n; i++) {
      r[i - mid] = array[i];
    }
    mergeSortRecursive(l, mid);
    mergeSortRecursive(r, n - mid);

    merge(array, l, r, mid, n - mid);
  }

  /**
   * Merge two sorted arrays
   *
   * @param array source array (into this merge l and r)
   * @param l     left subarray
   * @param r     right subarray
   * @param left  length left subarray
   * @param right length right subarray
   */
  private static void merge(int[] array, int[] l, int[] r, int left, int right) {
    int i = 0, j = 0, k = 0;

    while (i < left && j < right) {
      if (l[i] < r[j]) {
        array[k] = l[i];
        k++;
        i++;
      } else {
        array[k] = r[j];
        k++;
        j++;
      }
    }

    while (i < left) {
      array[k++] = l[i++];
    }

    while (j < right) {
      array[k++] = r[j++];
    }
  }

  private static void bubbleSort(int[] array) {
    for (int i = 0; i < array.length - 1; i++) {
      for (int j = i + 1; j < array.length; j++) {
        if (array[i] > array[j]) {
          int t = array[i];
          array[i] = array[j];
          array[j] = t;
        }
      }
    }
  }

  private static void selectSort(int[] array) {
    for (int i = 0; i < array.length - 1; i++) {
      int nmin = i;
      for (int j = i + 1; j < array.length; j++) {
        if (array[j] < array[nmin]) {
          nmin = j;
        }
      }
      int t = array[i];
      array[i] = array[nmin];
      array[nmin] = t;
    }
  }
}
