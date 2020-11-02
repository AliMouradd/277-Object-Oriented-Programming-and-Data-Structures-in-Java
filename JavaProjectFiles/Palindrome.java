package zybooks_labs;

public class Palindrome {
//    public static void main(String[] args) {
//        Palindrome w = new Palindrome();
//        System.out.println(w.isPal("Eh"));
//    }
    static boolean isPal(String word){
        word = word.toUpperCase();
        if(word.length()<=1 ) {
            return true;
        }else{
            if(word.charAt(0) == word.charAt(word.length()-1)){
                return isPal(word.substring(1,word.length()-1));
            }
            else{
                return false;
            }

        }
    }
}
