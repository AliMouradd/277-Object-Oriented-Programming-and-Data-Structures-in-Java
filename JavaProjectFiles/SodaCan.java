
public class SodaCan {
    private double height;
    private double radius;

    public void setHeight(double height) {
        this.height = height;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
     public double getSurfaceArea(){
        return ((2*Math.PI*radius*height)+2*Math.PI*(Math.pow(radius, 2)));
     }

     public double getVolume(){
        return (Math.pow(radius,2)*Math.PI*height);
     }
}
