import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 1. Сортування списку чисел
        List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 9);
        sortList(numbers);
        System.out.println("Відсортований список за зростанням: " + numbers);

        // 2. Видалення дублікатів у списку рядків
        List<String> strings = Arrays.asList("apple", "banana", "orange", "apple", "grape", "banana");
        removeDuplicates(strings);
        System.out.println("Список після видалення дублікатів: " + strings);

        // 3. Пошук найбільшого та найменшого елементів у списку чисел
        List<Integer> numbersToSearch = Arrays.asList(10, 5, 8, 3, 15, 7);
        findMinMax(numbersToSearch);

        // 4. Об'єднання двох списків без дублікатів
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list2 = Arrays.asList(3, 4, 5, 6, 7);
        mergeListsNoDuplicates(list1, list2);
        System.out.println("Об'єднаний список без дублікатів: " + list1);

        // 5. Перевірка наявності певного елемента у списку
        int elementToCheck = 8;
        checkElementExistence(numbersToSearch, elementToCheck);
    }

    // 1. Сортування списку чисел
    private static void sortList(List<Integer> list) {
        Collections.sort(list);
    }

    // 2. Видалення дублікатів у списку рядків
    private static void removeDuplicates(List<String> list) {
        Set<String> uniqueSet = new LinkedHashSet<>(list);
        list.clear();
        list.addAll(uniqueSet);
    }

    // 3. Пошук найбільшого та найменшого елементів у списку чисел
    private static void findMinMax(List<Integer> list) {
        int min = Collections.min(list);
        int max = Collections.max(list);
        System.out.println("Мінімальний елемент: " + min);
        System.out.println("Максимальний елемент: " + max);
    }

    // 4. Об'єднання двох списків без дублікатів
    private static void mergeListsNoDuplicates(List<Integer> list1, List<Integer> list2) {
        Set<Integer> uniqueElements = new HashSet<>(list1);
        uniqueElements.addAll(list2);
        list1.clear();
        list1.addAll(uniqueElements);
    }

    // 5. Перевірка наявності певного елемента у списку
    private static void checkElementExistence(List<Integer> list, int element) {
        if (list.contains(element)) {
            System.out.println("Елемент " + element + " присутній у списку.");
        } else {
            System.out.println("Елемент " + element + " відсутній у списку.");
        }
    }
}
