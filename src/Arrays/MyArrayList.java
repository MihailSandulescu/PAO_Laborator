package Arrays;

import java.util.Arrays;

public class MyArrayList {

    private double [] array;
    private int maxSize;
    private int nextFreeNdx;

    //constructors
    public MyArrayList(){
        array = new double[10];
        maxSize = 10;
        nextFreeNdx = 0;
    }
    public MyArrayList(int size){
        array = new double[size];
        this.maxSize = size;
        nextFreeNdx = 0;
    }

    public void add(double value) {
        if(nextFreeNdx == maxSize) {
            double [] copy = new double[maxSize];
            System.arraycopy(array, 0, copy, 0, array.length);
            maxSize *= 2;
            array = new double[maxSize];
            System.arraycopy(copy,0,array,0,copy.length);
        }
        array[nextFreeNdx++] = value;
    }

    public boolean contains(double value){
        int left = 0;
        int right = array.length - 1;
        int med, compVal;
        double [] copy = new double[maxSize];
        System.arraycopy(array,0,copy,0,array.length);
        Arrays.sort(copy);

        while(left <= right) {
            med = (left+right) / 2;
            compVal = Double.compare(value, copy[med]);
            if (compVal == 0) {
                return true;
            }
            if(compVal < 0) {
                right = med-1;
            } else {
                left = med+1;
            }
        }
        return false;
    }

    public void remove(int index) throws IndexOutOfBoundsException{
        if(index >= array.length) {
            throw new IndexOutOfBoundsException();
        }
        --maxSize;
        --nextFreeNdx;
        double [] copy = new double[maxSize];
        System.arraycopy(array, 0, copy, 0, index + 1);
        System.arraycopy(array, index + 1, copy, index, array.length - 1 - index);
        array = new double[maxSize];
        System.arraycopy(copy,0,array,0,copy.length);
    }

    public double get(int index) throws IndexOutOfBoundsException {
        if(index >= array.length) {
            throw new IndexOutOfBoundsException();
        }
        double v = array[index];
        return v;
    }

    public int size() {
        return array.length;
    }

    @Override
    public String toString() {
        String stringArr = Arrays.toString(array);
        return stringArr;
    }
}
