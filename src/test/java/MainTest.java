import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void sortInsertion() {
        int[] arr1 = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        int[] arr1Sorted = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        Main.sort(arr1, "insertion");
        Assertions.assertArrayEquals(arr1Sorted, arr1);
    }
    @Test
    void sortSelection() {
        int[] arr1 = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        int[] arr1Sorted = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        Main.sort(arr1, "selection");
        Assertions.assertArrayEquals(arr1Sorted, arr1);
    }
    @Test
    void sortBubble() {
        int[] arr1 = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        int[] arr1Sorted = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        Main.sort(arr1, "bubble");
        Assertions.assertArrayEquals(arr1Sorted, arr1);
    }
    @Test
    void sortMerge() {
        int[] arr1 = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        int[] arr1Sorted = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        Main.sort(arr1, "merge");
        Assertions.assertArrayEquals(arr1Sorted, arr1);
    }
    @Test
    void sortQuick() {
        int[] arr1 = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        int[] arr1Sorted = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        Main.sort(arr1, "quick");
        Assertions.assertArrayEquals(arr1Sorted, arr1);
    }

    @Test
    void selectionSort() {
        int[] arr1 = {6, 2, 4, 1, 0, 7, 9, 8, 3, 5};
        int[] arr1Sorted = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        Main.selectionSort(arr1);
        Assertions.assertArrayEquals(arr1Sorted, arr1);
    }

    @Test
    void bubbleSort() {
        int[] arr1 = {6, 2, 4, 1, 0, 7, 9, 8, 3, 5};
        int[] arr1Sorted = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        Main.bubbleSort(arr1);
        Assertions.assertArrayEquals(arr1Sorted, arr1);
    }

    @Test
    void insertionSort() {
        int[] arr1 = {6, 2, 4, 1, 0, 7, 9, 8, 3, 5};
        int[] arr1Sorted = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        Main.insertionSort(arr1);
        Assertions.assertArrayEquals(arr1Sorted, arr1);
    }

    @Test
    void mergeSort() {
        int[] arr1 = {6, 2, 4, 1, 0, 7, 9, 8, 3, 5};
        int[] arr1Sorted = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        Main.mergeSort(arr1);
        Assertions.assertArrayEquals(arr1Sorted, arr1);
    }

    @Test
    void quickSort() {
        int[] arr1 = {6, 2, 4, 1, 0, 7, 9, 8, 3, 5};
        int[] arr1Sorted = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        Main.quickSort(arr1);
        Assertions.assertArrayEquals(arr1Sorted, arr1);
    }
}