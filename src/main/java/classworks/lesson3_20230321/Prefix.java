package classworks.lesson3_20230321;

public class Prefix {
  public static void main(String[] args) {
    String[] words = {"flow", "florida", "flat"};
    String answer = words[0];
    for (int i = 1; i < words.length; i++) {
      answer = prefix(answer, words[i]);
    }
    System.out.println(answer);
  }

  private static String prefix(String first, String second) {
    String answer = "";
    for (int i = 0; i < Math.min(first.length(), second.length()); i++) {
      if (first.charAt(i) == second.charAt(i)) {
        answer += first.charAt(i);
      } else {
        return answer;
      }
    }
    return answer;
  }
}
