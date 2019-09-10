import java.util.ArrayList;
import java.util.List;

/**
 * Created by Bauka on 10-Sep-19
 */
public class Rental {
    List<Customer> customerRentals;
    Inventory inventory;

    public Rental() {
        customerRentals = new ArrayList<>();
        inventory = new Inventory();
    }

    public String customerAddMovie(String customerName, String filmName, int days, int cost) {
        Film film = inventory.getFilm(filmName);
        for (Customer customer: customerRentals) {
            if (customer.getName().equals(customerName)) {
                customer.addFilm(film, days, cost);
                film.setRented(true);
                return filmName+" ("+film.getType()+") " + days + " days " + cost + " EUR";
            }
        }
        return "Could not add";
    }

    public String customerAddMovieBonus(String customerName, String filmName, int days, int cost) {
        Film film = inventory.getFilm(filmName);
        for (Customer customer: customerRentals) {
            if (customer.getName().equals(customerName)) {
                customer.addFilmBonus(film, days, cost);
                film.setRented(true);
                return filmName+" ("+film.getType()+") " + days + " days " + cost + " EUR + /n (Paid with bonus)";
            }
        }
        return "Could not add";
    }

    public boolean canPayWithBonus(String customerName, String filmName, int days) {
        Film film = inventory.getFilm(filmName);
        if (film.getType()!=Type.NEW_RELEASE) return false;
        for (Customer customer: customerRentals) {
            if (customer.getName().equals(customerName)) {
                if (customer.getBonusPoints()/25>=days) return true;
                else return false;
            }
        }
        return false;
    }
}
