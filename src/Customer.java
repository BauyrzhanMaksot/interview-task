import java.util.ArrayList;
import java.util.List;

/**
 * Created by Bauka on 10-Sep-19
 */
public class Customer {
    private int bonusPoints;
    private List<FilmRent> films;
    private String name;

    public Customer() {
        bonusPoints = 0;
        films = new ArrayList<>();
    }

    public void addFilm(Film film, int days, int cost) {
        films.add(new FilmRent(film, days, cost, false));
        if (film.getType()==Type.NEW_RELEASE) bonusPoints++;
        bonusPoints++;
    }

    public void addFilmBonus(Film film, int days, int cost) {
        films.add(new FilmRent(film, days, cost, true));
        bonusPoints-= days*25;
    }
    @Override
    public String toString() {
        return "main.Customer{" +
                "bonusPoints=" + bonusPoints +
                ", films=" + films +
                '}';
    }

    public int getBonusPoints() {
        return bonusPoints;
    }

    public void setBonusPoints(int bonusPoints) {
        this.bonusPoints = bonusPoints;
    }

    public List<FilmRent> getFilms() {
        return films;
    }

    public void setFilms(List<FilmRent> films) {
        this.films = films;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
