package zybooks_labs;

import java.util.Arrays;
import java.util.Scanner;

public class LabProgram {
    public static void sortArray(int[] myArr, int arrSize){
        for(int i =0; i<arrSize-1; i++){
            int minIndex = i;
            for(int j = i+1; j<arrSize; j++){
                if(myArr[j]< myArr[minIndex]){
                    minIndex = j;

                }
            }
            int temp = myArr[i];
            myArr[i] = myArr[minIndex];
            myArr[minIndex] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int arrSize = scnr.nextInt();
        int[] myArr = new int[arrSize];
        for(int i = 0; i<arrSize; i++){
            myArr[i]=scnr.nextInt();
        }
        sortArray(myArr, arrSize);
        for( int elements : myArr){
            System.out.print(elements + " ");
        }
        System.out.println("");
    }
}
