package homeworks.hw9_20230514;

/*
Задача "Кузнечик и кувшинки"
Есть определённое количество кувшинок, расположенных в ряд, кузнечик стоит на первой из них.
Он может прыгнуть на следующую кувшинку, либо перепрыгнуть через одну.
Сколько существует разных способов (путей) добраться до последней кувшинки? Это задача на динамическое программирование.
*/

import java.util.Arrays;

public class Grasshopper {
  public static void main(String[] args) {
    int n = 7;

    int[] array = new int[n + 1];

    setStartValues(array);
//    printArray(array);

    fillPath(array);
    printArray(array);

    printLine(array.length);
    System.out.println("Count different ways is: " + array[n]);
  }

  private static void printLine(int len) {
    System.out.println("-".repeat(5 * (len - 2)));
  }

  private static void setStartValues(int[] array) {
    Arrays.fill(array, 0);
    array[1] = 1;
  }

  private static void printArray(int[] array) {
    printLine(array.length);
    for (int i = 1; i < array.length; i++) {
      System.out.printf("%-3d ", array[i]);
    }
    System.out.println();
  }

  private static void fillPath(int[] array) {
    for (int i = 2; i < array.length; i++) {
      array[i] = array[i - 1] + array[i - 2];
    }
  }
}
