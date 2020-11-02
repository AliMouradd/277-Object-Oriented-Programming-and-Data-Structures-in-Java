package zybooks_labs;

import java.util.Arrays;

public class BubbleSortCards {
    public void bubbleSortCards(Card[] arrB){
        for( int j = 0; j< arrB.length-1; j++) {
            for (int i = 0; i < arrB.length - 1; i++) {
                if (arrB[i].compareTo(arrB[i],arrB[i+1])>0) {
                    Card temp = arrB[i];
                    arrB[i] = arrB[i + 1];
                    arrB[i + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        BubbleSortCards a = new BubbleSortCards();
        Card myHand[] = {Card.queen, Card.seven, Card.jack, Card.five,Card.ace};
        System.out.println(Arrays.toString(myHand));
        a.bubbleSortCards(myHand);
        System.out.println(Arrays.toString(myHand));
    }
}
