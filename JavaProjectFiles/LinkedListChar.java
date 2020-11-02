package zybooks_labs;

public class LinkedListChar {
    NodeChar head;
    public LinkedListChar(){
        head = null;
    }
    public void store(String text){

        for(int i = 0; i< text.length(); i++){
            addToLast(text.charAt(i));
        }

    }

    private void addToLast(char a){
        NodeChar current = head;
        NodeChar n = new NodeChar(a);
        if (current != null){
            while(current.next != null){
                current = current.next;
            }
            current.next = n;
        }
        else{
            head = n;
        }
    }

    public String toString() {
        NodeChar current = head;
        String result = "";
        while (current != null){
            result += current.data;
            current = current.next;
        }
        return result;
    }

    public static void main(String[] args) {
        LinkedListChar myLLC = new LinkedListChar();
        myLLC.store("Enjoy Yourself");
        System.out.println(myLLC);;

    }
}


