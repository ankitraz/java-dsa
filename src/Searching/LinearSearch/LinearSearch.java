package Searching.LinearSearch;

import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,54};
        System.out.println(linearSearch(arr,0));
    }

    public static int linearSearch(int[] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}
