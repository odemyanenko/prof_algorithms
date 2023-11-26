package interview_tasks.string_manipulation;

/*
You probably know the "like" system from Facebook and other pages. People can "like" blog posts, pictures or other items. We want to create the text that should be displayed next to such an item.

Implement the function which takes an array containing the names of people that like an item. It must return the display text as shown in the examples:

[]                                -->  "no one likes this"
["Peter"]                         -->  "Peter likes this"
["Jacob", "Alex"]                 -->  "Jacob and Alex like this"
["Max", "John", "Mark"]           -->  "Max, John and Mark like this"
["Alex", "Jacob", "Mark", "Max"]  -->  "Alex, Jacob and 2 others like this"
* */

public class Task2 {
  public static void main(String[] args) {
    System.out.println(whoLikesIt());
    System.out.println(whoLikesIt("Peter"));
    System.out.println(whoLikesIt("Jacob", "Alex"));
    System.out.println(whoLikesIt("Max", "John", "Mark"));
    System.out.println(whoLikesIt("Alex", "Jacob", "Mark", "Max"));
  }

  public static String whoLikesIt(String... names) {
    final String MSG_LIKES = " likes this";
    final String MSG_LIKE = " like this";
    StringBuilder result = new StringBuilder();

    switch (names.length) {
      case 0 -> {
        result.append("no one");
        break;
      }
      default -> {
        result.append(names[0]);
        if (names.length == 1) {
          break;
        }
        if (names.length == 2) {
          result.append(" and ");
          result.append(names[1]);
          break;
        }
        result.append(", ");
        result.append(names[1]);
        result.append(" and ");
        if (names.length == 3) {
          result.append(names[2]);
          break;
        }
        result.append(names.length - 2 + " others");
      }
    }
    if (names.length > 1) {
      result.append(MSG_LIKE);
    } else {
      result.append(MSG_LIKES);
    }

    return result.toString();
  }
}
