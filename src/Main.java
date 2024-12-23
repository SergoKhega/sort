import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        int indexInArray = MyArrays.binarySearch(array, 4);
        System.out.println("Индекс элемента 4 в массиве: " + indexInArray);

        List<String> list = Arrays.asList("apple", "banana", "cherry", "date");
        int indexInList = MyCollections.binarySearch(list, "cherry");
        System.out.println("Индекс элемента 'cherry' в списке: " + indexInList);

        List<String> customList = Arrays.asList("apple", "banana", "cherry", "date");
        int indexInCustomList = MyCollections.binarySearch(customList, "banana", Comparator.reverseOrder());
        System.out.println("Индекс элемента 'banana' в списке (обратный порядок): " + indexInCustomList);
    }
}
