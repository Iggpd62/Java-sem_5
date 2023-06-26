import java.util.*;
public class sem_5 {public static void main(String[] args) {
    Map<String, Set<String>> phoneBook = new HashMap<>();

    phoneBook.put("Иванов", new HashSet<>(Arrays.asList("+7(111)111-11-11", "+7(111)111-11-12")));
    phoneBook.put("Петров", new HashSet<>(Arrays.asList("+7(222)222-22-21", "+7(222)222-22-22")));
    phoneBook.put("Сидоров", new HashSet<>(Arrays.asList("+7(333)333-33-31", "+7(333)333-33-32", "+7(333)333-33-33")));
    phoneBook.put("Иванов", new HashSet<>(Arrays.asList("+7(111)111-11-13")));

    List<Map.Entry<String, Set<String>>> list = new ArrayList<>(phoneBook.entrySet());
    list.sort((o1, o2) -> o2.getValue().size() - o1.getValue().size());

    for (Map.Entry<String, Set<String>> entry : list) {
        System.out.println(entry.getKey() + ": " + entry.getValue());
    }
}
}
