package interview_tasks.string_manipulation;

/*
Write a Java program to reverse a string without using the StringBuilder or StringBuffer classes.
*/

public class Task5_db {
  public static void main(String[] args){
    System.out.println(reverseString("okolom"));
  }

  public static String reverseString(String text){
    char[] strings = text.toCharArray();
    int left = 0;
    int right = strings.length - 1;

    for (int i = left; left < right; i++){
      char temp = strings[i];
      strings[i] = strings[right];
      strings[right] = temp;
      right--;
      left++;
    }
//    return new String(charArray);
    return String.valueOf(strings);
  }
}

/*
-- from ChatGPT

public class StringReversal {
    public static void main(String[] args) {
        String input = "Hello, World!";
        String reversed = reverseString(input);
        System.out.println("Original: " + input);
        System.out.println("Reversed: " + reversed);
    }

    public static String reverseString(String input) {
        // Convert the string to a character array
        char[] charArray = input.toCharArray();

        // Initialize pointers for reversing the array
        int left = 0;
        int right = charArray.length - 1;

        // Reverse the character array
        while (left < right) {
            // Swap characters at the left and right pointers
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;

            // Move the pointers towards the center
            left++;
            right--;
        }

        // Convert the character array back to a string
        return new String(charArray);
    }
}
* */
