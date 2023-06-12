package homeworks.hw13_20230606;

public class TreeDemo {
  public static void main(String[] args) {
    Tree tree = new Tree();
    tree.add(10);
    tree.add(5);
    tree.add(2);
    tree.add(6);
    tree.add(5);
    tree.add(20);

    System.out.println("Task1: ");
    tree.print();

    System.out.println("-------------------------------------------");
    System.out.println("Task2: ");
    System.out.println("Height of Tree: " + tree.getHeight());

    System.out.println("-------------------------------------------");
    //Решение нашла и переделала под наш вариант
    System.out.println("Task3: ");
    Integer[] arr = {13, 5, 8, 1, 30, null, null};
    Tree tree3 = new Tree();
    tree3.buildTreeFromArray(arr);
    System.out.println("Original Tree: ");
    tree3.print();
    tree3.fixTreeFromArray();
    System.out.println("Rebuild Tree: ");
    tree3.print();
  }

}
