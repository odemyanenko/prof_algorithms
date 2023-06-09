package classworks.lesson11_20230523;

import java.util.*;

public class Main2 {

  public static void main(String[] args) {
    // Множество рассматриваемых штатов, которые необходимо покрыть
    Set<String> statesNeeded = new HashSet<>(List.of("MT", "WA", "OR", "ID", "NV", "UT", "CA", "AZ"));
    // Станции и покрываемые ими штаты
    Map<Integer, Set<String>> stations = new HashMap<>();
    stations.put(1, new HashSet<>(List.of("ID", "NV", "UT")));
    stations.put(2, new HashSet<>(List.of("WA", "ID", "MT")));
    stations.put(3, new HashSet<>(List.of("OR", "NV", "CA")));
    stations.put(4, new HashSet<>(List.of("NV", "UT")));
    stations.put(5, new HashSet<>(List.of("CA", "AZ")));
    // Ответ - итоговый набор станций
    Set<Integer> finalStations = new HashSet<>();
    while (!statesNeeded.isEmpty()){
      Set<String> statesCovered = new HashSet<>();    // Текущее покрытие штатов
      int bestStation = 0;    // Станция, которая покрывает больше всего штатов, не входящих в statesCovered
      for (Map.Entry<Integer, Set<String>> entry: stations.entrySet()) {

        Set<String> covered = intersect(statesNeeded, entry.getValue());
        if (covered.size() > statesCovered.size()){
          bestStation = entry.getKey();
          statesCovered = covered;
        }
      }
      statesNeeded.retainAll(statesCovered);
      finalStations.add(bestStation);
    }
    System.out.println(finalStations);
  }

  private  static Set<String> intersect(Set<String> set1, Set<String > set2){
    Set<String> set = new HashSet<>(set1);
    set.retainAll(set2);

    return set;
  }

}