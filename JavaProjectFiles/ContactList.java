package zybooks_labs;

import java.util.Scanner;

public class ContactList {
    ContactNode head;
    ContactNode tail;
    public ContactList(){
        head = null;
        tail = null;
    }
    public void addLast(ContactNode o){
        if(head == null){
            head = o;
            tail= o;
        }
        else{
            tail.setNext(o);
            tail = o;
        }
    }
    public String toString() {
        ContactNode current = head;
        String result = "";
        System.out.println("CONTACT LIST");
        while (current != null){
            result += "Name: \n"+current.getName();
            result+="Phone number: "+ current.getPhoneNumber()+"\n";
            current = current.getNext();
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ContactList myList = new ContactList();
        String name;
        String number;
        String flag;
        System.out.println("Enter a contact to the contact list:");
        do{
            System.out.println("Enter name: ");
            name = in.nextLine();
            System.out.println("Enter phone number: ");
            number = in.nextLine();
            ContactNode a = new ContactNode(name, number);
            myList.addLast(a);
            System.out.println("Enter \"Y\" to add more contacts: ");
            flag = in.nextLine();
        }while(flag.equals("Y"));
        System.out.println(myList);
    }
}
class ContactNode {
    private String name;
    private String number;
    private ContactNode next;

    public ContactNode(String a, String b) {
        name = a;
        number = b;
        next = null;
    }
    public String getName() {
        return name;
    }
    public String getPhoneNumber() {
        return number;
    }
    public ContactNode getNext(){
        return next;
    }
    public void setNext(ContactNode next) {
        this.next = next;
    }
    public String toString() {
        return "Name: "+getName()+"\nPhone number: " + getPhoneNumber();
    }
}