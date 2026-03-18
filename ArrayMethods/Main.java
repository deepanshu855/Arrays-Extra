package ArrayMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
//        list.add(10);
//        list.add(20);
//        list.add(30);

        // Method1- Arrays.asList();
        list= Arrays.asList(10, 20, 30);

        // Method2- Arrays.sort();
        int [] arr= new int[] {2, 4, 1, 5, 9};

        Arrays.sort(arr, 2, arr.length-1); // This will sort the array for specified index.
        System.out.println(Arrays.toString(arr));

        // Method3- Arrays.binarySearch(arr, key)
        int idx= Arrays.binarySearch(arr, 9);
        System.out.println(idx);

        int [] arr1= new int[5];
        // Method4- Arrays.fill(arr, val): to fill array for given value
        Arrays.fill(arr1, 1);
        System.out.println(Arrays.toString(arr1));

        // Method5- Custom Comparator
    }
}
