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

  }

  private static int getPeakElement(int[][] array) {
    if (array.length == 0) {
      return -1;
    }
    int peakElem = -1;
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array.length; j++) {
        if (
                ((j == 0) && (array[i][j] >= array[i][j + 1])) ||
                ((j == array.length - 1) && (array[i][j] >= array[i][j - 1])) ||
                ((j > 0 && j < array.length - 1) && (array[i][j] >= array[i][j - 1]) && (array[i][j] >= array[i][j + 1])) ||

                ((i == 0) && (array[i][j] >= array[i + 1][j])) ||
                ((i == array.length - 1) && (array[i-1][j] >= array[i][j])) ||
                ((i > 0 && i < array.length - 1) && (array[i-1][j] >= array[i][j]) && (array[i+1][j] >= array[i][j]))

        ) {
          if (peakElem < array[i][j]) {
            peakElem =  array[i][j];
          }
        }
      }
    }
    return peakElem;
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
