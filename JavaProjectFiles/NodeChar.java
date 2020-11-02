package zybooks_labs;

public class NodeChar {
        public char data;
        public NodeChar next;
        public NodeChar(char a){
            data = a;
            next = null;
        }
        public String toString(){
            return Character.toString(data);
        }
}
