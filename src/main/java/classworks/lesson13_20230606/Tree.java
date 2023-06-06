package classworks.lesson13_20230606;

import java.util.LinkedList;
import java.util.Queue;

//BST
public class Tree {
  private Node root = null;

  public void add(int value) {
    Node temp = new Node();

    temp.value = value;
    if (root == null) {
      root = temp;
      return;
    }
    Node t = root;

    while (true) {
      if (value < t.value) {
        if (t.leftChild != null) {
          t = t.leftChild;
        } else {
          t.leftChild = temp;
          return;
        }
      } else {
        if (t.rightChild != null) {
          t = t.rightChild;
        } else {
          t.rightChild = temp;
          return;
        }
      }
    }
  }

  public void print(){
    pass(root);
  }

  // в ширину
  public void pass(){
    Queue<Node> queue = new LinkedList<>();
    queue.add(root);
    while (!queue.isEmpty()){
      Node temp = queue.remove();
      if (temp.leftChild != null){
        queue.add(temp.leftChild);
      }
      if (temp.rightChild != null){
        queue.add(temp.rightChild);
      }
      System.out.println(temp.value);
    }
  }

  // в глубину
  public void pass(Node t){
    if (t.leftChild != null) {
      pass(t.leftChild);
    }
    System.out.println(t.value);
    if (t.rightChild != null) {
      pass(t.rightChild);
    }
  }
  private class Node {
    int value;
    Node leftChild, rightChild;
  }
}
