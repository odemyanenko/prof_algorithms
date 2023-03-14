package homeworks.hw1_20230307;

public class Palindrome {
  public static boolean isPalindrome1(int original){
    String numberString = String.valueOf(original);
    return (new StringBuilder(numberString))
            .reverse()
            .toString()
            .equals(numberString);
  }

  public static boolean isPalindrome2(int original) {
    char[] data = String.valueOf(original).toCharArray();
    int j = data.length - 1;
    for (int i = 0; i < j; i++, j--) {
      if (data[i] != data[j]) {
        return false;
      }
    }
    return true;
  }
}
