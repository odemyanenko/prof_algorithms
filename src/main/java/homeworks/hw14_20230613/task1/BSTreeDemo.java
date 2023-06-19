package homeworks.hw14_20230613.task1;

public class BSTreeDemo {
  public static void main(String[] args) {
    BSTree tree = new BSTree();
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
  }

}
