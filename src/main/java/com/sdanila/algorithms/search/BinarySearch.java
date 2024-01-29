package com.sdanila.algorithms.search;

public class BinarySearch {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,8,9,10,99,104};
        System.out.println(search(8, numbers));
    }

    private static int search(int aNumber, int[] sortedNumbers) {
        int begin = 0;
        int end = sortedNumbers.length - 1;
        while (begin <= end) {
            int middle =  (begin + end) / 2;
            if(sortedNumbers[middle] == aNumber) {
                return middle;
            } else if (aNumber > middle) {
                begin = middle + 1;
            } else {
                end = middle - 1;
            }
        }
        return -1;
    }
}
