import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Bauka on 10-Sep-19
 */
class MainTest {
    Inventory inventory = new Inventory();
    Customer customer = new Customer();

    @Test
    void customerBonus() {
        inventory.addFilm("Spider Man", "regular");
        int cost = Price.getCost(inventory.getFilm("Spider Man"), 3);
        customer.addFilm(inventory.getFilm("Spider Man"), 3,  cost);
        assertEquals(customer.getBonusPoints(), 1);
    }

    @Test
    void customerFilms() {
        inventory.addFilm("Spider Man", "regular");
        int cost = Price.getCost(inventory.getFilm("Spider Man"), 3);
        customer.addFilm(inventory.getFilm("Spider Man"), 3,  cost);
        assertEquals(customer.getFilms().size(), 1);
    }
}