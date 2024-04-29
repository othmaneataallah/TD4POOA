import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(returnTotalOddNumbers(list));

        LinkedList<Integer> linkedList = new LinkedList<>(list);
        System.out.println(linkedList);
        cleanThenSortThenPrintList(linkedList);

        String[] list1 = { "a", "b", "c" };
        String[] list2 = { "b", "c", "c" };

        System.out.println(doListsContainSameElements(list1, list2));
    }

    public static int returnTotalOddNumbers(List<Integer> list) {
        int total = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 != 0) {
                total++;
            }
        }
        return total;
    }

    public static void cleanThenSortThenPrintList(LinkedList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
            }
        }
        Collections.sort(list);
        for (int i : list) {
            System.out.println(i);
        }
    }

    public static boolean doListsContainSameElements(String[] list1, String[] list2) {
        if (list1.length != list2.length) {
            return false;
        }

        Set<String> set1 = new HashSet<>(Arrays.asList(list1));
        Set<String> set2 = new HashSet<>(Arrays.asList(list2));

        if (set1.equals(set2)) {
            return true;
        }
        return false;
    }
}