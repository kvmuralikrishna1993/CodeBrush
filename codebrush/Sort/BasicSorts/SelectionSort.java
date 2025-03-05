package codebrush.Sort.BasicSorts;

public class SelectionSort{

    int[]  unSortedArray;

    SelectionSort(int[] unSortedArray){
        this.unSortedArray = unSortedArray;
    }

    public int[] sort() {
        int arraySize = unSortedArray.length;

        for (int i = 0; i < arraySize-1; i++) {
            int minIndex = i;
            for (int j = i+1; j < arraySize; j++) {
                if(isGreaterThan(minIndex,j)) minIndex = j;
            }
            swapValues(i,minIndex);
        }
        return unSortedArray;
    }

    public Boolean isGreaterThan(int left ,int right){
        return unSortedArray[left] > unSortedArray[right];
    }

    public void swapValues(int left, int right){
        int temp = unSortedArray[left];
        unSortedArray[left] = unSortedArray[right];
        unSortedArray[right] =temp;
    }
}