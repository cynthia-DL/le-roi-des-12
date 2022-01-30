import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class TestJoueur {
    @Nested
    class InitialFeatures {

        @Test
        void shouldNotHaveANullName() {
            assertThrows(NullPointerException.class, () -> new Joueur(null));
        }

        /*
        @Test
        void testingEqualsAndHashcode(){
            var joueur = new Joueur("Théodore");
            var memeJoueur = new Joueur("Théodore");
            var autreJoueur = new Joueur("Renégonde");

            assertAll("equals",
                    () -> assertTrue(joueur.equals(memeJoueur)),
                    () -> assertFalse(joueur.equals(autreJoueur)),
                    () -> assertFalse(autreJoueur.equals(memeJoueur))
            );
        }*/

    }
}
