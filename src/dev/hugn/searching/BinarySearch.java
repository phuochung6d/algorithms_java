package dev.hugn.searching;

public class BinarySearch {
    public static int search(int[] array, int destiny) {
        int leftIdx = 0;
        int rightIdx = array.length - 1;

        return search(array, destiny, leftIdx, rightIdx);
    }

    public static int search(int[] array, int destiny, int leftIdx, int rightIdx) {
        if (leftIdx > rightIdx) return -1;

        int midIdx = (leftIdx + rightIdx) / 2;

        if (array[midIdx] == destiny) return midIdx;
        else if (array[midIdx] < destiny) {
            return search(array, destiny, midIdx + 1, rightIdx);
        } else {
            return search(array, destiny, leftIdx, midIdx - 1);
        }
    }
}
