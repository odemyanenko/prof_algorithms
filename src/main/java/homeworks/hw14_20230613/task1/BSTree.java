package homeworks.hw14_20230613.task1;

import java.util.*;

// BST
public class BSTree {

  private Node root = null;

  public void add(int value) {
    Node temp = new Node();
    temp.value = value;
    // Если дерево пусто, то temp становится корнем
    if (root == null) {
      root = temp;
      return;
    }
    // Дерево не пусто - ищем место в нем для temp
    Node t = root;
    while (true) {
      if (value < t.value) {
        // Нужно двигаться влево
        if (t.leftChild != null) {
          // Левый потомок существует - переходим на него
          t = t.leftChild;
        } else {
          // Левого потомка не существует, значит нашли место для temp
          t.leftChild = temp;
          return;
        }
      } else {
        // Нужно двигаться вправо
        if (t.rightChild != null) {
          // Правый потомок существует - переходим на него
          t = t.rightChild;
        } else {
          // Правого потомка не существует, значит нашли место для temp
          t.rightChild = temp;
          return;
        }
      }
    }
  }

  public void print() {
    pass();
  }

  // Обход в глубину итерационный с 1 while)))
  private void pass() {
    if (root == null)
      return;

    Stack<Node> stack = new Stack<>();
    Node temp = root;

    while (temp != null || !stack.isEmpty()) {
      if (temp != null) {
        stack.push(temp);
        temp = temp.leftChild;
      } else {
        temp = stack.pop();
        System.out.print(temp.value + " ");
        temp = temp.rightChild;
      }
    }
    System.out.println();
  }

  private class Node {
    int value;
    Node leftChild, rightChild;

    public Node() {
    }

    public Node(int value) {
      this.value = value;
      this.leftChild = null;
      this.rightChild = null;
    }
  }

}