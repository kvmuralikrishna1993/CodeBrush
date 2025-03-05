package codebrush.Sort.BasicSorts;

public class InsertionSort{

    int[] unSortedArray;

    InsertionSort(int[] unSortedArray){
        this.unSortedArray =unSortedArray;
    }

    public int[] sort() {
        int arraySize = unSortedArray.length;
        for(int i=1; i<arraySize; i++){
            for (int j=i; j>0; j--){
                if(isGreaterThan(j-1,j)) swapValues(j-1,j);
                else break;
            }
        }
        return unSortedArray;
    }

    public Boolean isGreaterThan(int left ,int right){
        return unSortedArray[left] > unSortedArray[right];
    }

    public void swapValues(int left, int right){
        int temp = unSortedArray[left];
        unSortedArray[left] = unSortedArray[right];
        unSortedArray[right] = temp;
    }
}