package classworks.lesson2_20230314;

public class ArrayPaarSearch {
  public static void main(String[] args) {
    int[] array = {1, 1, 2, 2, 3, 4, 4};
    int[] array2 = {1, 1, 2, 2, 4, 4, 5};
    System.out.println(searchNumber(array));
    System.out.println(searchNumber(array2));

//    int i = 3;
//    int j = 2;
//    int k = i ^ j;
//    System.out.println(k ^ 3);
    System.out.println("----------------------------------");
    System.out.println(searchNumber2(array));
    System.out.println(searchNumber2(array2));
  }

  private static int searchNumber(int[] array) {
    int size = array.length;
    if (array[size - 2] != array[size - 1]) {
      return array[size - 1];
    }
    for (int i = 0; i < size; i += 2) {
      if (array[i] != array[i + 1]) {
        return array[i];
      }
    }
    return -1;
  }

  private static int searchNumber2(int[] array) {
    int result = array[0];
    for (int i = 1; i < array.length; i++){
      result = result ^ array[i];
    }
    return result;
  }
}
