import java.util.Objects;

public enum Carte {
    VIDE("Aucune carte selectionées"),
    AUTOMATE ("L'AUTOMATE"),
    CHEVALIER ("LE CHEVALIER"),
    ALCHIMISTE("L'ALCHIMISTE"),
    PARASITE ("LE PARASITE"),
    SORCIER ("LE SORCIER"),
    ORACLE("L'ORACLE"),
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
