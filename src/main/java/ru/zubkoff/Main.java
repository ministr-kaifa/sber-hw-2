package ru.zubkoff;

import static org.assertj.core.api.Assertions.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {
      var task1 = new Task1();
      task1.run();

      var phoneBook = new PhoneBook();
      assertThat(phoneBook.get("Non existing name").size()).isEqualTo(0);
      phoneBook.add("Ivanov", "88887776655");
      phoneBook.add("Ivanov", "89008007060");
      assertThat(phoneBook.get("Ivanov")).hasSameElementsAs(List.of("88887776655", "89008007060"));
      phoneBook.add("Sidorov", "88888888888");
      phoneBook.add("Sidorov", "88888888888");
      assertThat(phoneBook.get("Sidorov").size()).isEqualTo(1);

    }
}
