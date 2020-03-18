package Laborator_3;

public class Milka extends CandyBox {

    private float radius;
    private float height;

    //constructors
    public Milka() {
        super();
    }
    public Milka(String flavor, String origin, float radius, float height) {
        super(flavor, origin);
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double getVolume() {
        return ((22*radius*radius*height)/7);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public void printMilkadDim() {
        System.out.println("Cutia are raza = "+radius+" si inaltimea = "+height);
    }
}
