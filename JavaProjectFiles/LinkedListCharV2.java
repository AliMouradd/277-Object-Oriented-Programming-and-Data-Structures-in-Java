package zybooks_labs;

public class LinkedListCharV2 {
    NodeCharD head;
    NodeCharD tail;
    public LinkedListCharV2(){
        head = null;
        tail = null;
    }
    private void addToFirst(char a){
        NodeCharD n = new NodeCharD(a);
        if(head == null){
            head = n;
            tail = n;
        }
        else{
            n.next = head;
            head.prev = n;
            head = n;
        }
    }
    private void addToLast(char a){
        NodeCharD n = new NodeCharD(a);
        if(head == null){
            head = n;
            tail=n;
        }
        else{
            tail.next = n;
            n.prev = tail;
            tail = n;
        }
    }

    public void append(String text){
        for(int i = 0; i < text.length(); i++){
            addToLast(text.charAt(i));
        }
    }
    public void prepend(String text){
        for(int i = text.length()-1; i >=0; i--){
            addToFirst(text.charAt(i));
        }
    }
    public String toString() {
        NodeCharD current = head;
        String result = "";
        while (current != null){
            result += current.data;
            current = current.next;
        }
        return result;
    }
    public String toStringBackwards(){

        NodeCharD current = tail;
        String result = "";
        while (current != null){
            result += current.data;
            current = current.prev;
        }
        return result;
    }

    public static void main(String[] args) {
        LinkedListCharV2 myDLC = new LinkedListCharV2();
        myDLC.append("got");
        System.out.println(myDLC.toStringBackwards());   // should output "tog"
        myDLC.prepend("Joe");
        myDLC.append("this");
        System.out.println(myDLC);  // should output "Joegotthis"
    }
}
class NodeCharD{
    public char data;
    public NodeCharD next;
    public NodeCharD prev;

    public NodeCharD(char o){
        data = o;
        next = null;
        prev = null;
    }
}
