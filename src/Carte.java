import java.util.Objects;

public enum Carte {
    VIDE("Aucune carte selectionné"),

    // +7 a la valeur du dé
    AUTOMATE ("L'AUTOMATE"),

    // Lors de cette manche, c'est le dé le plus faible qui gagne
    CHEVALIER ("LE CHEVALIER"),

    // Doubler la valeur du dé
    ALCHIMISTE("L'ALCHIMISTE"),

    // -7 a la valeur du dé
    PARASITE ("LE PARASITE"),

    // Faites pivoter votre dé sur une face adjacente
    SORCIER ("LE SORCIER"),

    // Relancer votre dé
    ORACLE("L'ORACLE"),

    // Votre dé vaut pour ce tour. Si il était déja sur la face 12, il faut 1
    GOLEM("LE GOLEM");

    Carte(String dn){
        this.displayName = Objects.requireNonNull(dn);
    }

    private final String displayName;

    @Override
    public String toString(){
        return this.displayName;
    }
}
