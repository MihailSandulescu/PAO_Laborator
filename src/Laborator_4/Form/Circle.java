package Laborator_4.Form;

public class Circle extends Form {
    private double radius;

    public Circle() {
        super();
    }

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius * radius * (22/7);
    }

    @Override
    public String toString() {
        return "Cerc: " +
                super.toString() + " " +
                this.getArea();
    }

    @Override
    public void printDimensions() {
        System.out.println(this.radius);
    }

    //    public void printCircleDimensions() {
//        System.out.println(this.radius);
//    }
}
