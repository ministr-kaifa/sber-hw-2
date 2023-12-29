package ru.zubkoff;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * Написать простой класс ТелефонныйСправочник,
 * который хранит в себе список фамилий и телефонных номеров.
 * В этот телефонный справочник с помощью метода add()
 * можно добавлять записи. С помощью метода get()
 * искать номер телефона по фамилии. Следует учесть, что под
 * одной фамилией может быть несколько телефонов (в случае однофамильцев),
 * тогда при запросе такой фамилии должны выводиться все телефоны.
 */
public class PhoneBook {

  private Map<String, List<String>> book;

  public PhoneBook() {
    book = new HashMap<>();
  }

  public List<String> get(String name) {
    return book.getOrDefault(name, Collections.emptyList());
  }

  public void add(String name, String number) {
    if (book.containsKey(name)) {
      book.get(name).add(number);
    } else {
      book.put(name, new ArrayList<>(List.of(number)));
    }
  }
}
