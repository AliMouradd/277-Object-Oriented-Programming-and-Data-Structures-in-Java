package zybooks_labs;

import java.util.Arrays;

public class MergeSortDouble {
    public void sort(double[] arr){
      if(arr.length <2){
          return;
      }
      int midIdx = arr.length/2;
      double[] leftarr = new double[midIdx];
      double[] rightarr = new double [arr.length - midIdx];

      for( int i = 0; i< midIdx; i++){
          leftarr[i] = arr[i];
      }
      for( int i = midIdx; i< arr.length; i++){
          rightarr[i-midIdx] = arr[i];
      }

      sort(leftarr);
      sort(rightarr);
      mergeSort(leftarr, rightarr, arr);
    }

    private void mergeSort(double[] leftarr, double[] rightarr, double[] arr){
        int leftidx = 0;
        int rightidx = 0;
        int mgidx = 0;

        while( leftidx < leftarr.length && rightidx < rightarr.length) {
            if (leftarr[leftidx] <= rightarr[rightidx]) {
                arr[mgidx] = leftarr[leftidx];
                leftidx++;
                mgidx++;
            } else {
                arr[mgidx] = rightarr[rightidx];
                mgidx++;
                rightidx++;
            }
        }
        while(leftidx < leftarr.length){
            arr[mgidx] = leftarr[leftidx];
            mgidx++;
            leftidx++;
        }
        while(rightidx < rightarr.length){
            arr[mgidx] = rightarr[rightidx];
            mgidx++;
            rightidx++;
        }
    }

    public static void main(String[] args) {
        double[] arr = {6.283, 24.162, 16.0, 14.999726, 5.131211, 32.635416, 63.1283, 2.1, 1.0};
        MergeSortDouble a = new MergeSortDouble();
        a.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
