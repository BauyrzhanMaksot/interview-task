import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Bauka on 10-Sep-19
 */
class InventoryTest {
    Inventory inventory = new Inventory();

    @Test
    void addFilm() {
        inventory.addFilm("Spider Man", "new");
        assertEquals(inventory.getFilms().size(), 1);
    }

    @Test
    void removeFilm() {
        inventory.addFilm("Spider Man", "new");
        inventory.removeFilm("Spider Man");
        assertEquals(inventory.getFilms().size(), 0);
    }

    @Test
    void changeType() {
        inventory.addFilm("Spider Man", "new");
        inventory.changeType("Spider Man", "regular");
        assertEquals(inventory.getFilm("Spider Man").getType(), Type.REGULAR);
    }

    @Test
    void getFilmCheckName() {
        inventory.addFilm("Spider man", "old");
        assertEquals(inventory.getFilm("Spider man").getName(), "Spider man");
    }

    @Test
    void getFilmCheckType() {
        inventory.addFilm("Spider man", "old");
        assertEquals(inventory.getFilm("Spider man").getType(), Type.OLD_FILM);
    }

    @Test
    void setFilmRented() {
        inventory.addFilm("Spider Man", "old");
        inventory.setFilmRented("Spider Man");
        assertEquals(inventory.getFilm("Spider Man").isRented(), true);
    }
}