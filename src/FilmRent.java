/**
 * Created by Bauka on 10-Sep-19
 */
public class FilmRent {
    private Film film;
    private int cost;
    private int days;
    private boolean bonus;

    public FilmRent(Film film, int cost, int days, boolean bonus) {
        this.film = film;
        this.cost = cost;
        this.days = days;
        this.bonus = bonus;
    }

    public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public boolean isBonus() {
        return bonus;
    }

    public void setBonus(boolean bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "main.FilmRent{" +
                "film=" + film +
                ", cost=" + cost +
                ", days=" + days +
                ", bonus=" + bonus +
                '}';
    }
}
