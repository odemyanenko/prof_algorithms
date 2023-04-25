package classworks.lesson7_20230425;

import java.util.Arrays;

public class DynamicArray {
  private int[] array;
  private int count;
  private int size;

  public DynamicArray() {
    array = new int[1];
    count = 0;
    size = 1;
  }

  /**
   * Add element in the end of the array
   *
   * @param data value, which need to add in array
   */
  public void add(int data) {
    if (count == size) {
      increaseArray();
    }
    array[count] = data;
    count++;
  }

  private void increaseArray() {
    size *= 2;
    int[] temp = new int[size];
    for (int i = 0; i < count; i++) {
      temp[i] = array[i];
    }
    array = temp;
  }

  /**
   * Add element in the end of the array
   *
   * @param data  value, which need to add in array
   * @param index index, where need add element
   */
  public void add(int data, int index) {
    if (index < 0 || index >= size) {
      System.out.println("Index out of bounds!!!");
      return;
    }

    if (count == size) {
      increaseArray();
    }

    for (int i = count - 1; i >= index; i--) {
      array[i + 1] = array[i];
    }
    array[index] = data;
    count++;
  }

  /**
   * Delete last element
   */
  public void remove() {
    if (count > 0) {
      array[count - 1] = 0;
      count--;
    }
  }

  /**
   * Delete element from index position
   *
   * @param index index deleting element
   */
  public void remove(int index) {
    if (index < 0 || index >= count) {
      System.out.println("Index out of bounds!!!");
      return;
    }
    for (int i = index; i < count - 1; i++) {
      array[i] = array[i + 1];
    }
    array[count - 1] = 0;
    count--;
  }

  /**
   * decrease
   */
  public void trim() {
    int[] temp = new int[count];
    for (int i = 0; i < count; i++) {
      temp[i] = array[i];
    }
    size = count;
    array = temp;
  }

  public void printArray() {
    System.out.println(Arrays.toString(array) + ", count = " + count + ", size = " + size);
  }
}
