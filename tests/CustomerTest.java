import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Bauka on 10-Sep-19
 */
class CustomerTest {
    Customer customer = new Customer();
    @Test
    void addFilm() {
        Film film = new Film("Spider Man", "new");
        customer.addFilm(film, 1, 30);
        assertEquals(customer.getFilms().size(), 1);
    }

    @Test
    void addFilmBonus() {
        Film film = new Film("Spider Man", "regular");
        customer.addFilmBonus(film, 3, 30);
        assertEquals(customer.getFilms().size(), 1);
    }

    @Test
    void getFilms() {
        Film film = new Film("Spider Man", "regular");
        customer.addFilmBonus(film, 3, 30);
        customer.addFilm(film, 2, 30);
        assertEquals(customer.getFilms().size(), 2);
    }

    @Test
    void getBonusPointsNew() {
        Film film  = new Film("Almaty never sleeps", "new");
        customer.addFilm(film, 3, 30);
        assertEquals(customer.getBonusPoints(), 2);
    }

    @Test
    void getBonusPointsRegular() {
        Film film  = new Film("Almaty never sleeps", "regular");
        customer.addFilm(film, 3, 30);
        assertEquals(customer.getBonusPoints(), 1);
    }

    @Test
    void getBonusPointsRegular2() {
        Film film  = new Film("Almaty never sleeps", "regular");
        customer.setBonusPoints(75);
        customer.addFilmBonus(film, 3, 30);
        assertEquals(customer.getBonusPoints(), 0);
    }
}