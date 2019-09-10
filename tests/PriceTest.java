import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Bauka on 10-Sep-19
 */
class PriceTest {

    @Test
    void getCost1() {
        Type type = Type.NEW_RELEASE;
        Film film = new Film("Matrix 11", type);
        int days = 1;
        assertEquals(Price.getCost(film, days), 40);
    }

    @Test
    void getCost2() {
        Type type = Type.REGULAR;
        Film film = new Film("Spider Man", type);
        int days = 5;
        assertEquals(Price.getCost(film, days), 90);
    }

    @Test
    void getCost3() {
        Type type = Type.REGULAR;
        Film film = new Film("Spider Man 2", type);
        int days = 2;
        assertEquals(Price.getCost(film, days), 30);
    }

    @Test
    void getCost4() {
        Type type = Type.OLD_FILM;
        Film film = new Film("Out Of Africa", type);
        int days = 7;
        assertEquals(Price.getCost(film, days), 90);
    }
}