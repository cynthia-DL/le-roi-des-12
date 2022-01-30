import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Joueur {
    private final String playerName;
    private int point;
    private Carte activeCard;
    private ArrayList<Carte> deck;
    private int roundWin;
    private final De de;

    public Joueur(String playerName){
        this.playerName = Objects.requireNonNull(playerName);
        this.point = 0;
        this.activeCard = Carte.VIDE;
        this.deck = new ArrayList<>(List.of(Carte.ALCHIMISTE, Carte.AUTOMATE, Carte.ORACLE, Carte.GOLEM, Carte.PARASITE, Carte.CHEVALIER, Carte.GOLEM, Carte.SORCIER));
        this.roundWin = 0;
        this.de = new De();
    }

    // TODO : Implement playCard method
    public void playCard(){}

    //TODO : Implement modifyPower method
    public void modifyPower(){}

    public void addPoint(int points){
        point += points;
    }
    public void resetPoint(){
        point = 0;
    }

    /*** GETTER, SETTER, HASHCODE AND EQUALS ***/
    @Override
    public boolean equals(Object obj){
        if (!(obj instanceof Joueur)){
            return false;
        }

        Joueur other = (Joueur) obj;

        return this.playerName.equals(other.playerName)
                && this.point == other.point
                && this.activeCard.equals(other.activeCard)
                && this.deck.equals(other.deck)
                && this.roundWin == other.roundWin
                && this.de.equals(other.de);
    }

    @Override
    public int hashCode(){
        return playerName.hashCode() ^ point ^ activeCard.hashCode() ^ deck.hashCode() ^ roundWin ^ de.hashCode();
    }

    public String getPlayerName() {
        return playerName;
    }

    public int getPoint() {
        return point;
    }

    public Carte getActiveCard() {
        return activeCard;
    }

    public void setActiveCard(Carte activeCard) {
        this.activeCard = activeCard;
    }

    public ArrayList<Carte> getDeck() {
        return deck;
    }

    public void setDeck(ArrayList<Carte> deck) {
        this.deck = deck;
    }

    public int getRoundWin() {
        return roundWin;
    }

    public void setRoundWin(int roundWin) {
        this.roundWin = roundWin;
    }

    public De getDe() {
        return de;
    }

}
