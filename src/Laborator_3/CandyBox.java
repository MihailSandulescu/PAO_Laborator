package Laborator_3;

class CandyBox {

    private String flavor;
    private String origin;

    //constructors
    public CandyBox(){}
    public CandyBox(String flavor, String origin){
        this.flavor = flavor;
        this.origin = origin;
    }

    //class methods
    public double getVolume() {
        return 0;
    }

    @Override
    public String toString() {
        return "The " + origin + " " + flavor + " has volume " + getVolume();
    }

    @Override
    public boolean equals(Object obj) {
        //ambele sunt referinta catre acelasi obiect
        if (obj == this) {
            return true;
        }

        //obj este instanta a obiectului cu care comparam?
        if(!(obj instanceof CandyBox)){
            return false;
        }

        //downcasting pentru a putea compara membrii
        if(this.flavor.equals(((CandyBox) obj).flavor)) {
            return this.origin.equals(((CandyBox) obj).origin);
        }
        return false;
    }
}
