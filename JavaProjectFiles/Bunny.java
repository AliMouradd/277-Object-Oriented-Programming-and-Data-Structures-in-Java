package zybooks_labs;

public class Bunny {
    public static void main(String[] args) {
        Bunny bunny = new Bunny();
//        System.out.println("total bunny ears :"+bunny.bunnyEars(4));
        System.out.println("total funny bunny ears :"+bunny.bunnyFunnyEars(4));
    }
    int bunnyEars(int bun){
        if(bun > 0){
            return 2 + bunnyEars(bun-1);
        }
        return 0;
    }

    int bunnyFunnyEars(int bun){
        if(bun>0) {
            if (bun % 2 == 1) {
                return 2 + bunnyFunnyEars(bun - 1);
            } else{
                return 3 + bunnyFunnyEars(bun - 1);
            }
        }
        return 0;
    }
}
