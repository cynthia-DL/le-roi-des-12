import java.util.ArrayList;
import java.util.Objects;

public class Joueur {
    private final String playerName;
    private int point;
    private Carte activeCard;
    private ArrayList<Carte> deck;
    private int roundWin;
    private De de;

    public Joueur(String playerName){
        this.playerName = Objects.requireNonNull(playerName);
        this.point = 0;
        this.activeCard = null;
        this.deck = new ArrayList<>();
        this.roundWin = 0;
        this.de = new De();
    }

    public void playCard(){}
    public void addPoint(){}
    public void resetPoint(){}
    public void modifyPower(){}
}
