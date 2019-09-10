import java.util.ArrayList;
import java.util.List;

/**
 * Created by Bauka on 10-Sep-19
 */

public class Inventory {
    private List<Film> films;
    public Inventory() {
        films = new ArrayList<>();
    }

    public void addFilm(String name, String type) {
        films.add(new Film(name,type));
    }

    public void removeFilm(String name) {
        for (Film film : films) {
            if (film.getName().equals(name)) {
                films.remove(film);
                return;
            }
        }
    }

    public List<Film> getFilms() {
        return films;
    }

    public void changeType(String name, String type) {
        for (Film film : films) {
            if (film.getName().equals(name)) {
                film.setTypeString(type);
                return;
            }
        }
    }

    public Film getFilm(String name) {
        for (Film film : films) {
            if (film.getName().equals(name)) return film;
        }
        return null;
    }

    public void setFilmRented(String name) {
        for (Film film : films) {
            if (film.getName().equals(name)) {
                film.setRented(true);
                return;
            }
        }
    }

    public void listAllFilms() {
        for (Film film : films) {
            System.out.println(film);
        }
    }

    public void listAllAvailableFilms() {
        for (Film film : films) {
            if (!film.isRented()) System.out.println(film);
        }
    }
}
