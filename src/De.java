import java.util.Objects;

public class De {
    private int face;
    private int value;
    static final int BORNE=13;

    public De(){
        this.face = newJet();
        this.value = this.face;
    }

    public int newJet(){
        // Calcul d'un nombre aléatoire entre 1 et 12 compris
        this.value= 1+(int)(Math.random()*12);
        this.face=this.value;

        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof De)) {return false;}

        De de=(De)o;

        return this.value == de.getValue() && this.face==de.getFace();
    }

    @Override
    public int hashCode() {
        return value ^ face;
    }

    public void reverseFace(){
        this.face=this.BORNE-this.face;
    }

    public int getFace() {
        return face;
    }

    public void setFace(int face) {
        this.face = face;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
