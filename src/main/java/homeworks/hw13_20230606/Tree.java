package homeworks.hw13_20230606;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

// BST
public class Tree {

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

//  // Обход в глубину
//  private void pass(Node t) {
//    if (t.leftChild != null) {
//      pass(t.leftChild);
//    }
//    System.out.println(t.value);
//    if (t.rightChild != null) {
//      pass(t.rightChild);
//    }
//  }

  // Обход в глубину итерационный
  private void pass() {
    Stack<Node> stack = new Stack<>();

    Node temp = root;

    while (temp != null || !stack.isEmpty()) {
      while (temp != null) {
        stack.push(temp);
        temp = temp.leftChild;
      }

      temp = stack.pop();
      System.out.print(temp.value + " ");

      temp = temp.rightChild;
    }
    System.out.println();
  }

  // Обход в ширину
//  public void pass() {
//    Queue<Node> queue = new LinkedList<>();
//    queue.add(root);
//    while (!queue.isEmpty()) {
//      Node temp = queue.remove();
//      if (temp.leftChild != null) {
//        queue.add(temp.leftChild);
//      }
//      if (temp.rightChild != null) {
//        queue.add(temp.rightChild);
//      }
//      System.out.println(temp.value);
//    }
//  }

  public int getHeight() {
    return getMaxHeight(root);
  }

  private int getMaxHeight(Node node) {
    if (node == null) {
      return 0;
    }

    int leftHeight = getMaxHeight(node.leftChild);
    int rightHeight = getMaxHeight(node.rightChild);

    return Math.max(leftHeight, rightHeight) + 1;
  }

  public void buildTreeFromArray(Integer[] arr) {
    if (arr == null || arr.length == 0) {
      return;
    }

    root = new Node(arr[0]);

    Queue<Node> queue = new LinkedList<>();
    queue.offer(root);

    int i = 1;
    while (i < arr.length) {
      Node current = queue.poll();

      if (arr[i] != null) {
        current.leftChild = new Node(arr[i]);
        queue.offer(current.leftChild);
      }
      i++;

      if (i < arr.length && arr[i] != null) {
        current.rightChild = new Node(arr[i]);
        queue.offer(current.rightChild);
      }
      i++;
    }
  }

  public void fixTreeFromArray() {
    if (root == null) {
      return;
    }
    List<Integer> values = new ArrayList<>();
    valuesTreeInOrder(root, values);
    Collections.sort(values);
    rebuildTree(root, values, new AtomicInteger(0));
  }

  private void valuesTreeInOrder(Node node, List<Integer> values) {
    if (node == null) {
      return;
    }

    valuesTreeInOrder(node.leftChild, values);
    values.add(node.value);
    valuesTreeInOrder(node.rightChild, values);
  }

  private void rebuildTree(Node node, List<Integer> values, AtomicInteger index) {
    if (node == null) {
      return;
    }

    rebuildTree(node.leftChild, values, index);
    node.value = values.get(index.getAndIncrement());
    rebuildTree(node.rightChild, values, index);
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