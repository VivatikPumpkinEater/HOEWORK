package by.academy.hw2.task2;

import by.academy.hw2.task2.SearchNumber;

public class Main {

    public static void main(String[] args) {
        SearchNumber result = new SearchNumber();
        Integer[] array = new Integer[]{20, 1, -1, 2, -2, 3, 3, 5, 5, 1, 2, 4, 20, 4, -1, -2, 5};
        Integer[] array1 = new Integer[]{1, 1, 2, -2, 5, 2, 4, 4, -1, -2, 5};
        Integer[] array2 = new Integer[]{20, 1, 1, 2, 2, 3, 3, 5, 5, 4, 20, 4, 5};
        Integer[] array3 = new Integer[]{10};
        Integer[] array4 = new Integer[]{1, 1, 1, 1, 1, 1, 10, 1, 1, 1, 1};
        Integer[] array5 = new Integer[]{5, 4, 3, 2, 1, 5, 4, 3, 2, 10, 10};
        result.search(array);
        result.search(array1);
        result.search(array2);
        result.search(array3);
        result.search(array4);
        result.search(array5);
    }
}