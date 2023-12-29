package ru.zubkoff;

import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task1 implements Runnable {

  @Override
  public void run() {
    //Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
    String[] words = {
      "apple", "banana", "cherry", "grape",
      "date", "elderberry", "apple", "elderberry",
      "fig", "grape", "banana", "honeydew", 
      "kiwi", "lemon", "fig",  "honeydew",
      "mango", "orange", "pear", "quince"
    };
    System.out.println("Изначальный набор слов:\n" + Arrays.toString(words));

    //Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
    System.out.println("Уникальные слова:\n" + new HashSet<>(Arrays.asList(words)));

    //Посчитать сколько раз встречается каждое слово.
    var wordCounters = Stream.of(words)
      .collect(Collectors.toMap(
        word -> word,
        word -> 1,
        (counter1, counter2) -> counter1 + counter2
      ));

    System.out.println("Количество слов:\n" + wordCounters);
  }

  
}
