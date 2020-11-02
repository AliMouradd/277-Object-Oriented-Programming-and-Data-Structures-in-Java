package zybooks_labs;

public class AreaCalculator {
    public int calculateRectangle(int height, int length) throws IllegalArgumentException {
        if (height < 0){
            throw new IllegalArgumentException("Height should be a positive number");
        }
        else if(length < 0 ){
            throw new IllegalArgumentException("Length should be a positive number");
        }
        else{
            return height*length;
        }
    }
}
