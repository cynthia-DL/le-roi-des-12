public class De {
    private int face;
    private int value;

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
