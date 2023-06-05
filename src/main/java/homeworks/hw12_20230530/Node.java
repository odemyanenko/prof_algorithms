package homeworks.hw12_20230530;

import java.util.*;

public class Node{
  private int number;
  private int weight;
  private Map<Node, Integer> neighbors;

  public Node(int number) {
    this.number = number;
    if (number == 1) {
      this.weight = 0;
    } else {
      this.weight = Integer.MAX_VALUE;
    }

    this.neighbors = new HashMap<Node, Integer>();
  }

  public int getNumber() {
    return number;
  }

  public int getWeight() {
    return weight;
  }

  public void setWeight(int weight) {
    this.weight = weight;
  }

  public void addNeighbors(Node node, int value){
    neighbors.put(node, value);
  }

  public Map<Node, Integer> getNeighbors() {
    return Collections.unmodifiableMap(neighbors);
  }
}
