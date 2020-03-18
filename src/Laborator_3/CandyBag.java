package Laborator_3;
import java.util.ArrayList;

public class CandyBag {

    private ArrayList<CandyBox> boxes;

    //constructors
    public CandyBag() {}
    public CandyBag(ArrayList<CandyBox> boxes) {
        for(CandyBox box : boxes){
            this.boxes.add(box);
        }
    }

    public boolean equalityOfLindt() throws Exception{
        if (!(boxes.get(0) instanceof Lindt)) {
            throw new Exception();
        }
        for(int i = 1; i < boxes.size(); ++i){
            if (!(boxes.get(i).equals(boxes.get(0)))) {
                return false;
            }
        }
        return true;
    }
}
