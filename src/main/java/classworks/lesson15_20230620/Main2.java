package classworks.lesson15_20230620;

public class Main2 {

  public static void main(String[] args) {
    AVLTree tree = new AVLTree();
    tree.insert(10);
    tree.insert(5);
    tree.insert(2);
    tree.insert(6);
    tree.insert(5);
    tree.insert(20);
    tree.insert(30);
    tree.print();
  }

}