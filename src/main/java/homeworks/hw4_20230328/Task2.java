package homeworks.hw4_20230328;
/*
Найдите пиковый элемент в двумерном массиве
Элемент является пиковым, если он больше или равен своим четырем соседям слева, справа, сверху и снизу. Например, соседями для A[i][j] являются A[i-1][j], A[i+1][j], A[i][j-1] и A[i][j+1]. Для угловых элементов отсутствующие соседи считаются отрицательными бесконечными значениями.
        10 20 15
        21 30 14
        7 16 32
        Выход: 30
30 — пиковый элемент, потому что все его соседи меньше или равны ему.
32 также можно выбрать в качестве пика.
*/

import java.util.Arrays;

public class Task2 {
  public static void main(String[] args) {
    int[][] array = {
            {10, 20, 15},
            {21, 30, 14},
            {7, 16, 32}
    };

    printArray(array);

    int peakElement = getPeakElement(array);
    System.out.println("Peak element: " + peakElement);

    System.out.println("----------------");
    task2(array);

  }

  private static void task2(int[][] array) {
    int n = array.length;
    int m = array[0].length;
    int[][] table = new int[n + 2][m + 2];

    int min = array[0][0];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        if (array[i][j] < min) {
          min = array[i][j];
        }
      }
    }
    min /= 10;
    for (int i = 0; i < n + 2; i++) {
      table[i][0] = min;
      table[i][m + 1] = min;
    }
    for (int j = 0; j < m + 2; j++) {
      table[0][j] = min;
      table[n + 1][j] = min;
    }
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        table[i + 1][j + 1] = array[i][j];
      }
    }
    printArray(table);
    for (int i = 1; i < n + 1; i++) {
      for (int j = 1; j < m + 1; j++) {
        if (table[i][j] >= table[i - 1][j] &&
                table[i][j] >= table[i + 1][j] &&
                table[i][j] >= table[i][j - 1] &&
                table[i][j] >= table[i][j + 1]
        ){
          System.out.println(table[i][j]);
        }
      }
    }
  }

  private static int getPeakElement(int[][] array) {
    if (array.length == 0) {
      return -1;
    }
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array.length; j++) {
        if (
                (((j == 0) && (array[i][j] >= array[i][j + 1])) ||
                        ((j == array.length - 1) && (array[i][j] >= array[i][j - 1])) ||
                        ((j > 0 && j < array.length - 1) && (array[i][j] >= array[i][j - 1]) && (array[i][j] >= array[i][j + 1])))
                        &&
                        (((i == 0) && (array[i][j] >= array[i + 1][j])) ||
                                ((i == array.length - 1) && (array[i][j] >= array[i - 1][j])) ||
                                ((i > 0 && i < array.length - 1) && (array[i][j] >= array[i - 1][j]) && (array[i][j] >= array[i + 1][j])))

        ) {
          return array[i][j];
        }
      }
    }
    return -1;
  }

  private static void printArray(int[][] array) {
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[i].length; j++) {
        System.out.print(array[i][j] + "\t");
      }
      System.out.println();
    }
  }
}
