package zybooks_labs;

public class MyArrayList {
    private int size = 3;
    private int index = 0;
    private String[] my_array = new String[size];

    private void resize(int d){

        String[] temp_arr = new String[d];
//        for(int i = 0; i< temp_arr.length; i++){
//            if(i <= my_array.length -1){
//                temp_arr[i] = my_array[i];
//            }
//            else{
//                temp_arr[i] = null;
//            }
//
//    }
        for(int i = 0; i< size; i++){
            temp_arr[i] = my_array[i];
        }
        my_array= temp_arr;

}
    public void add(String a) {

//        for (int i = 0; i < my_array.length; i++) {
//            if (my_array[i] == null) {
//                my_array[i] = a;
//                break;
//            } else {
//                resize(my_array.length + 1);
//                my_array[my_array.length - 1] = a;
//                break;
//            }
//        }
        int growth = 3;
        if(index == size){
            resize(size + growth);
        }
        my_array[index] = a;
        index++;
    }


    public void set(int b, String c){
        my_array[b]=c;
    }

    @Override
    public String toString() {
        String toReturn = "";
        int count = 0;
        for(int i= 0; i<my_array.length; i++){
            if(my_array[i] != null) {
                toReturn += count + ": " + my_array[i] + "\n";
                count++;
            }
        }
        return toReturn;
    }

    public static void main(String[] args) {
        MyArrayList myList = new MyArrayList();
        myList.add("First");
        myList.add("Second");
        myList.add("thirds");
        myList.add("fourth");
        myList.set(1,"helloworld");
        System.out.println(myList);
    }




}
