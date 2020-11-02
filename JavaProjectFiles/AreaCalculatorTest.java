package zybooks_labs;

import java.util.Scanner;

public class AreaCalculatorTest {
    public static void main(String[] args) {
        AreaCalculator a1 = new AreaCalculator();
        Scanner scnr = new Scanner(System.in);
        int length;
        int height;
        int area;
        System.out.println("Enter the length:");
        length = scnr.nextInt();
        System.out.println("Enter the height:");
        height = scnr.nextInt();
        try{
            area = a1.calculateRectangle(height, length);
            System.out.println(area);
        }
        catch(IllegalArgumentException e){
            System.out.println(e);
        }
    }
}
