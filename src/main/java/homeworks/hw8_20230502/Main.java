package homeworks.hw8_20230502;

public class Main {
  public static void main(String[] args) {
    int n = 5;
    int m = 5;

    int[][] matrixPath = new int[n + 1][m + 1];

    setStartValues(n, m, matrixPath);
    System.out.println("After Start Values");
    printMatrix(n, m, matrixPath);
    fillPath(n, m, matrixPath);
    System.out.println("After Fill Path");
    printMatrix(n, m, matrixPath);
  }

  private static void fillPath(int n, int m, int[][] array) {
    for (int i = 1; i <= n ; i++) {
      array[i][1] = 1;
    }
    for (int j = 1; j <= m ; j++) {
      array[1][j] = 1;
    }
    for (int i = 2; i <=n ; i++) {
      for (int j = 2; j <=m ; j++) {
        array[i][j] = array[i][j-1] + array[i-1][j];
      }
    }
  }

  private static void printMatrix(int n, int m, int[][] array) {
    for (int i = 0; i <= n; i++) {
      for (int j = 0; j <= m; j++) {
        System.out.printf("%-2d ", array[i][j]);
      }
      System.out.println();
    }
  }

  private static void setStartValues(int n, int m, int[][] array) {
    for (int i = 0; i <= n; i++) {
      for (int j = 0; j <= m; j++) {
        array[i][j] = 0;
      }
    }
  }
}
