package zybooks_labs;

import java.util.Scanner;

public class LinsearchTest {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int a[]=new int[5];
        int i;
        System.out.println("Enter up to 5 integers, followed by a non-number:");
        for(i=0;i<5;i++){
            try{
                int b;
                b=s.nextInt();
                a[i]=b;
            }
            catch(Exception e){
                s.next();
                break;
            }
        }
        if(i==5){
            System.out.println("Maximum number of elements (5) reached, discarded excess.");
        }
        System.out.println("Enter an integer to search for:");
        int n,j,f=0;
        try{
            n=s.nextInt();
            for(j=0;j<i;j++){
                if(n==a[j]){
                    f=1;
                    System.out.println("Found at position: "+j);
                }
            }
            if(f==0){
                System.out.println("Did not find the element.");
            }
        }
        catch(Exception e){
            System.out.println("Invalid entry, search stopped!");
        }
    }
}
