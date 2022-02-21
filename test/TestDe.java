import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class TestDe{
    @Nested
    class InitialFeatures {
        @Test
        void shouldAlwaysHaveFaceValueBetweenZeroAndTwelve() {
            var de = new De();

            assertAll("Valeures interdites",
                    () -> assertThrows(IllegalArgumentException.class, () -> de.setFace(13)),
                    () -> assertThrows(IllegalArgumentException.class, () -> de.setFace(0)),
                    () -> assertThrows(IllegalArgumentException.class, () -> de.setFace(-1))
            );
        }

        @Test
        void equalsAndHashcode () {
            De d1 = new De();
            De d2 = new De();
            De d3 = new De();

            d1.setFace(12);
            d2.setFace(12);
            d3.setFace(9);

            d1.setValue(12);
            d2.setValue(12);
            d3.setValue(9);

            assertAll("Equals",
                    () -> assertEquals(d1, d2),
                    () -> assertNotEquals(d2, d3)
            );
        }

    }
}
