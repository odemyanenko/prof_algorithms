package classworks.lesson16_20230627;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Main2 {
  public static void main(String[] args) {
    String str = "abbc";
    huffmanTreeBuild(str);
  }

  private static void huffmanTreeBuild(String str) {
    if (str == null || str.isEmpty()) {
      return;
    }

    Map<Character, Integer> freq = new HashMap<>();
    for (char c : str.toCharArray()) {
      freq.put(c, freq.getOrDefault(c, 0) + 1);
    }
    PriorityQueue<Node> priorityQueue = new PriorityQueue<>(Comparator.comparingInt(o -> o.freq));
    for (Map.Entry<Character, Integer> entry : freq.entrySet()) {
      priorityQueue.add(new Node(entry.getKey(), entry.getValue()));
    }

    //Huffman Code
    while (priorityQueue.size() != 1) {
      Node a = priorityQueue.poll();
      Node b = priorityQueue.poll();
      if (a != null && b != null) {
        int sum = a.freq + b.freq;
        priorityQueue.add(new Node(null, sum, a, b));
      }
    }

    Map<Character, String> huffmanCode = new HashMap<>();
    encode(priorityQueue.peek(), "", huffmanCode);

    for (var entry : huffmanCode.entrySet()) {
      System.out.println(entry.getKey() + " - " + entry.getValue());
    }

    StringBuilder sb = new StringBuilder();
    for (char c : str.toCharArray()) {
      sb.append(huffmanCode.get(c));
    }
    System.out.println(sb);
    //
    decode(sb.toString(), huffmanCode);
  }

  private static void encode(Node node, String str, Map<Character, String> huffmanCode) {
    if (node == null) {
      return;
    }
    if (node.leftChild == null && node.rightChild == null) {
      huffmanCode.put(node.c, str);
    }
    encode(node.leftChild, str + '0', huffmanCode);
    encode(node.rightChild, str + '1', huffmanCode);
  }

  private static void decode(String str, Map<Character, String> huffmanCode) {
    StringBuilder sb = new StringBuilder();
    int len = 1;
    int position = 0;
    while (position + len <= str.length()) {
      String subString = str.substring(position, position + len);
      boolean f = false;
      for (var entry : huffmanCode.entrySet()) {
        if (entry.getValue().equals(subString)) {
          sb.append(entry.getKey());
          position = position + len;
          len = 1;
          f = true;
          break;
        }
      }
      if (!f) {
        len = len + 1;
      }
    }
    System.out.println(sb);
  }

  //  private static void decode2(String str, Map<Character, String> huffmanCode) {
////    StringBuilder sb = new StringBuilder();
////    Map<String, Character> convertHuffmanCode =
////            huffmanCode.entrySet()
////                    .stream()
////                    .collect(Collectors.toMap(Map.Entry::getValue, Map.Entry::getKey, (a, b) -> a, HashMap::new));
////    int len = 1;
////    int position = 0;
//
//  }
  private static class Node {
    Character c;
    int freq;
    Node leftChild, rightChild;

    public Node(Character c, int freq) {
      this.c = c;
      this.freq = freq;
    }

    public Node(Character c, int freq, Node leftChild, Node rightChild) {
      this.c = c;
      this.freq = freq;
      this.leftChild = leftChild;
      this.rightChild = rightChild;
    }
  }
}
