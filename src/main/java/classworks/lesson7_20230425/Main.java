package classworks.lesson7_20230425;

public class Main {
  public static void main(String[] args) {
    DynamicArray dynamicArray = new DynamicArray();

    dynamicArray.add(10);
    dynamicArray.printArray();

    dynamicArray.add(20);
    dynamicArray.printArray();

    dynamicArray.add(30);
    dynamicArray.printArray();

    dynamicArray.add(40, 4);
    dynamicArray.printArray();

    dynamicArray.add(100, 1);
    dynamicArray.printArray();

    dynamicArray.add(200, 2);
    dynamicArray.printArray();

    dynamicArray.remove();
    dynamicArray.printArray();

    dynamicArray.remove(1);
    dynamicArray.printArray();

    dynamicArray.trim();
    dynamicArray.printArray();
  }
}
