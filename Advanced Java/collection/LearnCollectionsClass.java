package collection;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class LearnCollectionsClass {

    public static void main(String[] args) {
        // The Collections class in Java is a utility class in the java.util package
        // that provides static methods for manipulating collections. It provides a wide
        // range of methods for sorting, searching, and manipulating collections.
        List<Integer> numbers = Arrays.asList(5, 3, 1, 2, 4);

        // Sorting
        Collections.sort(numbers);
        System.out.println("Sorted list: " + numbers);

        // Reversing
        // Collections.sort(numbers,Comparator.reverseOrder());
        // System.out.println("Reversed list: " + numbers);
        Collections.reverse(numbers);
        System.out.println("Reversed list: " + numbers);
        // Shuffling
        Collections.shuffle(numbers);
        System.out.println("Shuffled list: " + numbers);

        // Finding minimum and maximum
        int min = Collections.min(numbers);
        int max = Collections.max(numbers);
        System.out.println("Min: " + min + ", Max: " + max);

        // Synchronizing list
        List<Integer> synchronizedList = Collections.synchronizedList(new ArrayList<>(numbers));
        System.out.println(synchronizedList);
    }
}
