package Laborator_4.Form;

public class Triangle extends Form {
    private double height, base;

    public Triangle() {
        super();
    }

    public Triangle(String color, double height, double base) {
        super(color);
        this.height = height;
        this.base = base;
    }

    @Override
    public double getArea() {
        return height * base * 0.5;
    }

    @Override
    public String toString() {
        return "Triunghi: " +
                super.toString() + " " +
                this.getArea();
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this) {
            return true;
        }

        if(!(obj instanceof Triangle)) {
            return false;
        }

        Triangle tr = (Triangle)obj;

        return (tr.base == this.base) && (tr.height == this.height);
    }

    @Override
    public void printDimensions() {
        System.out.println(this.base + " " + this.height);
    }

    //    public void printTriangleDimensions() {
//        System.out.println(this.base + " " + this.height);
//    }
}
