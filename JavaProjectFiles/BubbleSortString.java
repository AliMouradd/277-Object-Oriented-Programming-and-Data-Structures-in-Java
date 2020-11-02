package zybooks_labs;

import java.util.Arrays;

public class BubbleSortString {
    public void bubbleSort( String[] arrB){
        for( int j = 0; j< arrB.length-1; j++) {// REMOVE SORTED ITEM FROM ITERATION
            for (int i = 0; i < arrB.length - 1; i++) {// MOVES GREATEST VALUE TO THE RIGHT MOST ELEMENT
                if (arrB[i].toUpperCase().compareTo(arrB[i+1].toUpperCase())>0) {
                    String temp = arrB[i];
                    arrB[i] = arrB[i + 1];
                    arrB[i + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        BubbleSortString test = new BubbleSortString();
        String[] arrB = {"roar","Lion","1999", "CECS274","example"};
        test.bubbleSort(arrB);
        System.out.println(Arrays.toString(arrB));
    }
}
