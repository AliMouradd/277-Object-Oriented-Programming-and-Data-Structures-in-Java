package zybooks_labs;

public class StackBal {
    NodeChar top;

    public StackBal(){
        top = null;
    }
    private void push(char a){
        NodeChar n = new NodeChar(a);
        n.next = top;
        top = n;
    }
    private char pop(){
        NodeChar temp = null;
        if(top != null){
            temp = top;
            top = top.next;
        }
        return temp.data;
    }

    private void addToFirst(char a){
        NodeChar n = new NodeChar(a);
        n.next = top;
        top = n;
    }

    public boolean isBalanced(String text){
        int size = 0;
        for(int i = 0; i < text.length(); i++){
            addToFirst(text.charAt(i));

        }
        NodeChar current = top;
        while(current != null){
            if(current.data == '(' || current.data =='[' || current.data == '{' ){
                push(current.data);
                size++;
            }
            if(current.data == ')' || current.data ==']' || current.data == '}' ){
                pop();
                size --;
                if(!(pop() == ')' && top.data=='('||pop() == ']' && top.data == '['||pop() == '}' && top.data == '{')){
                    return false;
                }

            }
            current = current.next;
        }
        return true;
    }

    public static void main(String[] args) {
        StackBal o = new StackBal();
        System.out.println(o.isBalanced("[3]"));
    }

}
