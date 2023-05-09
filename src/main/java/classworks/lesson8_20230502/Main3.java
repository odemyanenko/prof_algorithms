package classworks.lesson8_20230502;

import java.util.Arrays;
import java.util.stream.Stream;

public class Main3 {
  public static void main(String[] args) {
    int n = 3;
    int m = 4;

    Item[] items = {
            new Item("Gitarre", 1, 1500),
            new Item("Kettensäge", 4, 3000),
            new Item("Laptop", 3, 2000)
    };

    Backpack[][] bp = new Backpack[n + 1][m + 1];
    for (int i = 0; i < n + 1; i++) {
      for (int j = 0; j < m + 1; j++) {
        if (i == 0 || j == 0) {
          bp[i][j] = new Backpack(new Item[]{}, 0);
        } else if (i == 1) {
          bp[i][j] = items[0].getWeight() <= j ? new Backpack(new Item[]{items[0]}, items[0].getPrice()) : new Backpack(new Item[]{}, 0);
        } else {
          if (items[i - 1].getWeight() > j) {
            bp[i][j] = bp[i - 1][j];
          } else {
            int price = items[i - 1].getPrice() + bp[i - 1][j - items[i - 1].getWeight()].getPrice();
            if (bp[i - 1][j].getPrice() > price) {
              bp[i][j] = bp[i - 1][j];
            }
            else {
/*              bp[i][j] = new Backpack(Stream.concat(Arrays.stream(new Item[]{items[i - 1]}),
                      Arrays.stream(bp[i - 1][ j - items[i - 1].getWeight()].getItems())).toArray()
                      ));*/
            }
          }
        }
      }
    }
    for (int i = 0; i < n + 1; i++) {
      for (int j = 0; j < m + 1; j++) {
        System.out.print(bp[i][j].getDescription() + " ");
      }
      System.out.println();
    }
  }
}
