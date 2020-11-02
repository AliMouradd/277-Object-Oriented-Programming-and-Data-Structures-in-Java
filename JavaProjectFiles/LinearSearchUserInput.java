package zybooks_labs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class LinearSearchUserInput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter up to 5 integers, followed by a non-number: ");
        String[] numbers = new String[5];
        ArrayList<String> numberLists = new ArrayList<>();
        int count = 0;
        boolean flag = true;

        while (in.hasNextInt()) {
            numbers[count] = in.next();
            count++;
            if(count == 5){
                System.out.println("Maximum number of elements (5) reached, discarded excess.");
                break;
            }
        }
        for (String number : numbers) {
            if (number != null) {
                numberLists.add(number);
            }
        }
        System.out.println("Enter an integer to search for:");
        in.nextLine();
        if(in.hasNextInt()) {
            String key = in.next();
            for (int i = 0; i < numberLists.size(); i++) {
                if (numberLists.get(i).equals(key)) {
                    System.out.println("Found at position: " + i);
                    flag = false;
                } else if (i == numberLists.size() - 1 && flag) {
                    System.out.println("Did not find the element.");
                }
            }
        } else{
            System.out.println("Invalid entry, search stopped!");
        }
    }
}
