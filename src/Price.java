/**
 * Created by Bauka on 10-Sep-19
 */
public class Price {
    public static final int premiumFee = 40;
    public static final int regularFee = 30;

    public static int getCost(Film film, int days) {
        int cost=0;
        if (film.getType()==Type.NEW_RELEASE) {
            cost+= days*Price.premiumFee;
        } else if (film.getType()==Type.REGULAR) {
            cost+= Price.regularFee;
            if (days>3) cost+= (days-3)*Price.regularFee;
        } else if (film.getType()==Type.OLD_FILM) {
            cost+= Price.regularFee;
            if (days>5) cost+= (days-5)*Price.regularFee;
        }
        return cost;
    }
}
