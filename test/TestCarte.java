import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestCarte {
    @Nested
    class InitialFeatures {

        @Test
        void shouldBeCorrectlyNamed() {
            assertAll("equals",
                    () -> assertEquals("Aucune carte selectionné", Carte.VIDE.toString()),
                    () -> assertEquals("LE CHEVALIER", Carte.CHEVALIER.toString()),
                    () -> assertEquals("L'ALCHIMISTE", Carte.ALCHIMISTE.toString()),
                    () -> assertEquals("LE PARASITE", Carte.PARASITE.toString()),
                    () -> assertEquals("LE SORCIER", Carte.SORCIER.toString()),
                    () -> assertEquals("L'ORACLE", Carte.ORACLE.toString()),
                    () -> assertEquals("LE GOLEM", Carte.GOLEM.toString())
            );
        }
    }
}
