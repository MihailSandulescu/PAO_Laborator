package Laborator_3;

public class Heidi extends CandyBox {

    private float side;

    //constructors
    public Heidi() {
        super();
    }
    public Heidi(String flavor, String origin, float side) {
        super(flavor, origin);
        this.side = side;
    }

    @Override
    public double getVolume() {
        return side*side*side;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public void printHeidiDim() {
        System.out.println("Cutia are latura = "+side);
    }
}
