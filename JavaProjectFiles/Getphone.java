package zybooks_labs;

import java.util.Scanner;

public class Getphone {
    public static String getPhoneNumber(String[] nameVec, String[]
            phoneNumberVec, String contactName, int arraySize) {

        for (int i = 0; i < arraySize; i++) {

            if (nameVec[i].equals(contactName)) {

                return phoneNumberVec[i];
            }
        }
        return "Not Found";
    }

    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);

        int N;
        System.out.println("How many are in this contact list? ");
        N = scnr.nextInt();
        String[] nameVec = new String[N];
        String [] phoneNumberVec = new String[N];

        String contactName;
        for(int i=0; i<N; i++){
            nameVec[i] = scnr.next();
            phoneNumberVec[i] = scnr.next();
        }
        System.out.println("Search a name");
        contactName= scnr.next();
        System.out.println(getPhoneNumber(nameVec, phoneNumberVec,contactName,N));
    }
}
