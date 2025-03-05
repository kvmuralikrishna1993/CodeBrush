package codebrush.Sort.BasicSorts;

public class BubbleSort {

    int[] unSortedArray;

    BubbleSort(int[] unSortedArray) {
        this.unSortedArray = unSortedArray;
    }

    public int[] sort() {
        int arraySize = unSortedArray.length;
        for (int i = 0; i < arraySize - 1; i++) { // Iterate through the array
            boolean swapped = false; // Track if any swaps occur
            for (int j = 0; j < arraySize - i - 1; j++) { // Bubble up the largest element
                if (isGreaterThan(j, j + 1)) {
                    swapValues(j, j + 1);
                    swapped = true;
                }
            }
            // If no swaps were made in the inner loop, array is already sorted
            if (!swapped) break;
        }
        return unSortedArray;
    }

    public Boolean isGreaterThan(int left, int right) {
        return unSortedArray[left] > unSortedArray[right];
    }

    public void swapValues(int left, int right) {
        int temp = unSortedArray[left];
        unSortedArray[left] = unSortedArray[right];
        unSortedArray[right] = temp;
    }
}