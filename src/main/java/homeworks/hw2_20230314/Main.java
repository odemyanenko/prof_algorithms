package homeworks.hw2_20230314;

public class Main {
  public static void main(String[] args) {
    System.out.println("Task 1.1");
    test1_1(1);
    test1_1(5);
    test1_1(10);
    test1_1(1000);
    System.out.println("------------------------------");
    System.out.println("Task 1.2");
    test1_2(1);
    test1_2(5);
    test1_2(10);
    test1_2(1000);
    System.out.println("------------------------------");
    System.out.println("Task 1.3");
    test1_3(1);
    test1_3(5);
    test1_3(10);
    test1_3(1000);
    System.out.println("------------------------------");
    System.out.println("Task 1.4");
    test1_4(1);
    test1_4(5);
    test1_4(10);
    test1_4(1000);
    test1_4(10000);
    System.out.println("------------------------------");
    System.out.println("Task 3");
    String[] arrayCommon1 = {"flower", "flow", "flight"};
    System.out.println("Common prefix among the input strings: " + findLongestCommonPrefix(arrayCommon1));
    String[] arrayCommon2 = {"dog", "racecar", "car"};
    System.out.println("Common prefix among the input strings: " + findLongestCommonPrefix(arrayCommon2));
    String[] arrayCommon3 = {"racecarqw", "racecarq", "racecarfgdfg"};
    System.out.println("Common prefix among the input strings: " + findLongestCommonPrefix(arrayCommon3));
  }

  static void test1_1(int n) {
    if (n == 1)
      return;
    int count = 0;
    for (int i = 1; i <= n; i++) {
      ++count;
      for (int j = 1; j <= n; j++) {
        ++count;
//        System.out.println("");
        break;
      }
    }
    System.out.println("N = " + n + " Count = " + count);
  }

  static void test1_2(int n) {
    int a = 0;
    int count = 0;
    for (int i = 0; i < n; i++) {
      for (int j = n; j > i; j--) {
        ++count;
        a = a + i + j;
      }
    }
    System.out.println("N = " + n + " Count = " + count);
  }

  static void test1_3(int n) {
    int i, j, a = 0;
    int count = 0;
    for (i = n / 2; i <= n; i++)
      for (j = 2; j <= n; j = j * 2) {
        ++count;
        a = a + n / 2;
      }
    System.out.println("N = " + n + " Count = " + count);
  }

  static void test1_4(int n) {
    int a = 0, i = n;
    int count = 0;
    while (i > 0) {
      ++count;
      a += i;
      i /= 2;
    }
    System.out.println("N = " + n + " Count = " + count);
  }

  public static String findLongestCommonPrefix(String[] original) {
    if (original.length == 0) {
      return "";
    }

    String prefix = "";
    int minLength = getMinLength(original);

    for (int i = minLength - 1; i >= 0; i--) {
      String prefixNew = original[0].substring(0, i + 1);
      if (checkCommonPrefix(original, prefixNew)) {
        prefix = prefixNew;
        break;
      }
    }

    return prefix;
  }

  private static boolean checkCommonPrefix(String[] original, String prefix) {
    for (int i = 1; i < original.length; i++) {
      if (!prefix.equals(original[i].substring(0, prefix.length()))) {
        return false;
      }
    }

    return true;
  }

  private static int getMinLength(String[] original) {
    if (original.length == 0) {
      return 0;
    }
    int minLength = original[0].length();
    for (int i = 1; i < original.length; i++) {
      if (minLength > original[i].length()) {
        minLength = original[i].length();
      }
    }

    return minLength;
  }
}
