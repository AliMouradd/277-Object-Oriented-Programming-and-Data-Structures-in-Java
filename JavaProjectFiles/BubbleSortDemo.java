package zybooks_labs;

import java.util.Arrays;

public class BubbleSortDemo {
    public void sortB( int[] arrB){
        for( int j = 0; j< arrB.length-1; j++) {// REMOVE SORTED ITEM FROM ITERATION
            for (int i = 0; i < arrB.length - 1; i++) {// MOVES GREATEST VALUE TO THE RIGHT MOST ELEMENT
                if (arrB[i] > arrB[i + 1]) {
                    int temp = arrB[i];
                    arrB[i] = arrB[i + 1];
                    arrB[i + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        BubbleSortDemo test = new BubbleSortDemo();
        int[] num ={1,4,2,6,7,8,11};
        test.sortB(num);
        System.out.println(Arrays.toString(num));
    }
}
