package classworks.lesson6_20230418;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main3 {
  public static void main(String[] args) {
    List<Integer> list = qsort(Arrays.asList(12, 10, 7, 2, 4, 6, 9, 15));
    System.out.println(list);

    System.out.println("------------------------------------");
    int[] array = {12, 10, 7, 2, 4, 6, 9, 15};
    System.out.println(Arrays.toString(array));
    qsort(array);
    System.out.println(Arrays.toString(array));
  }

  private static void qsort(int[] array) {
    qsort(array, 0, array.length - 1);
  }

  private static void qsort(int[] array, int low, int high) {
    if (array.length < 2 || low >= high) {
      return;
    }
    //main element
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
    if (i < high) {
      qsort(array, i, high);
    }
  }

  private static List<Integer> qsort(List<Integer> array) {
    //base event
    if (array.size() < 2) {
      return array;
    }
    //main element
    int pivot = array.get(0);
    //array < pivot
    ArrayList<Integer> less = new ArrayList<>();
    //array > pivot
    ArrayList<Integer> greater = new ArrayList<>();
    for (int i = 0; i < array.size(); i++) {
      if (array.get(i) < pivot) {
        less.add(array.get(i));
      } else {
        greater.add(array.get(i));
      }
    }
    ArrayList<Integer> result = new ArrayList<>();
    result.addAll(less);
//    result.add(pivot);
    result.addAll(greater);

    return result;
  }
}
