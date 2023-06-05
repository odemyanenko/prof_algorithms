package homeworks.hw12_20230530;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args) {
    int[][] matrix = createArray();
    printArray(matrix);

    System.out.println("--------------------------------");
    Set<Node> unvisitedNodes = getSetUnvisitedNodes(matrix);
    printUnvisitedSet(unvisitedNodes);

    System.out.println("--------------------------------");
    List<Node> visitedNodes = getVisitedNodes(unvisitedNodes);
    printVisitedNodes(visitedNodes);

  }

  private static void printVisitedNodes(List<Node> visitedNodes) {
    System.out.println("Print visited point: ");
    visitedNodes.forEach(e -> {
      System.out.println(e.getNumber() + " : " + e.getWeight());
    });
  }

  private static List<Node> getVisitedNodes(Set<Node> set) {
    List<Node> list = new ArrayList<>();
    while (set.size() > 0) {
      Optional<Node> start = set.stream()
              .min(Comparator.comparingInt(Node::getWeight));
      Node startNode = start.get();
      for (Map.Entry<Node, Integer> item: startNode.getNeighbors().entrySet()) {
        if (item.getKey().getWeight() == Integer.MAX_VALUE) {
          item.getKey().setWeight(startNode.getWeight() + item.getValue());
        } else if (item.getKey().getWeight() > startNode.getWeight() + item.getValue()) {
          item.getKey().setWeight(startNode.getWeight() + item.getValue());
        }
      }
      list.add(startNode);
      set.remove(startNode);
    }
    return list;
  }

  private static void printUnvisitedSet(Set<Node> set) {
    System.out.println("Print original unvisited set: ");
    set.stream()
            .sorted(Comparator.comparingInt(Node::getNumber))
            .forEachOrdered(e -> {
              System.out.print(e.getNumber() + ") ");
              e.getNeighbors()
                      .forEach((key, value) -> System.out.print(key.getNumber() + " : " + value + "; "));
              System.out.println();
            });
  }

  private static Set<Node> getSetUnvisitedNodes(int[][] array) {
    Set<Node> nodeSet = new HashSet<>();

    for (int i = 0; i < array.length; i++) {
      nodeSet.add(new Node(i + 1));
    }

    for (Node node : nodeSet) {
      for (int i = 0; i < array.length; i++) {
        int value = array[node.getNumber() - 1][i];
        if (value != 0) {
          int index = i + 1;
          Optional<Node> addNode = nodeSet.stream().filter(e -> e.getNumber() == index).findFirst();
          addNode.ifPresent(node1 -> node.addNeighbors(node1, value));
        }
      }
    }

    return nodeSet;
  }

  private static void printArray(int[][] array) {
    System.out.println("Matrix : ");
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[i].length; j++) {
        System.out.printf("%3d ", array[i][j]);
      }
      System.out.println();
    }
  }

  private static int[][] createArray() {
    int[][] array = new int[6][6];

    array[0][1] = 7;
    array[0][2] = 9;
    array[0][5] = 14;

    array[1][0] = 7;
    array[1][2] = 10;
    array[1][3] = 15;

    array[2][0] = 9;
    array[2][1] = 10;
    array[2][3] = 11;
    array[2][5] = 2;

    array[3][1] = 15;
    array[3][2] = 11;
    array[3][4] = 6;

    array[4][3] = 6;
    array[4][5] = 9;

    array[5][0] = 14;
    array[5][2] = 2;
    array[5][4] = 9;

    return array;
  }
}
