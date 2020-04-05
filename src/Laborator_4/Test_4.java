package Laborator_4;


import Laborator_4.Bookstore.Book;
import Laborator_4.Form.Circle;
import Laborator_4.Form.Form;
import Laborator_4.Form.Triangle;

public class Test_4 {
    public static void main(String[] args) {

        Book carte1 = new Book("Abecedarul", "Decebal", "Editura Didactica", 5800);

        Form[] forme = new Form[10];

        forme[0] = new Triangle("red", 11,4);
        forme[1] = new Circle("green",7);
        forme[2] = new Circle("blue", 3);

        for(int i = 0; i < 3; ++i) {
            System.out.println(forme[i].toString());
        }

        for(int i = 0; i < 3; ++i) {
//            if(forme[i] instanceof Triangle){
//                Triangle t = (Triangle)forme[i];
//                t.printTriangleDimensions();
//            } else {
//                if(forme[i] instanceof Circle) {
//                    Circle c = (Circle)forme[i];
//                    c.printCircleDimensions();
//                }
//            }
            forme[i].printDimensions();
        }
    }
}
