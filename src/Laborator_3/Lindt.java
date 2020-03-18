package Laborator_3;

public class Lindt extends CandyBox {

    private double length;
    private double width;
    private double height;

    //constructors
    public Lindt(){
        super();
    }
    public Lindt(String flavor, String origin, double length, double width, double height){
        super(flavor, origin);
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public double getVolume() {
        return length*width*height;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public void printLindtDim() {
        System.out.println("Cutia are lungimea = "+length+" latimea = "+width+" si inaltimea = "+height);
    }
}
