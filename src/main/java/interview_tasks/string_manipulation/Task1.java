package interview_tasks.string_manipulation;

/*
Complete the function that accepts a string parameter,
and reverses each word in the string.
All spaces in the string should be retained.
"This is an example!" ==> "sihT si na !elpmaxe"
"double  spaces"      ==> "elbuod  secaps"
* */
public class Task1 {
  public static void main(String[] args) {
    System.out.println(reverseWords("sihT si na !elpmaxe"));
    System.out.println(reverseWords("elbuod  secaps"));
    System.out.println(reverseWords("ehT kciuq nworb xof spmuj revo eht yzal .god"));
  }

  public static String reverseWords(String s) {
    String[] words = s.split(" ");
    StringBuilder result = new StringBuilder();

    for (String word : words) {
      StringBuilder reversedWord = new StringBuilder(word).reverse();
      result.append(reversedWord).append(" ");
    }

    // Remove the trailing space
    if (result.length() > 0) {
      result.setLength(result.length() - 1);
    }

    return result.toString();
  }
}
