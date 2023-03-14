package homeworks.hw1_20230307;
/*
Описание задания.

Find the element that appears once in a sorted array
Given a sorted array in which all elements occur twice (one after the other) and one element appears only once.
*/

public class ArrayUtil {
  public static int getNumberOneAppears(int[] original) {
    for (int i = 0; i < original.length; i += 2) {
      if ((i + 1 == original.length) ||
              (original[i] != original[i + 1])) {
        return i;
      }
    }
    return -1;
  }
}
