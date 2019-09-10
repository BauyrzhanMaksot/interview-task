/**
 * Created by Bauka on 10-Sep-19
 */
enum Type {
    NEW_RELEASE, REGULAR, OLD_FILM
}
public class Film {
    private String name;
    private Type type;
    private boolean isRented;

    public Film(String name) {
        this.name = name;
    }

    public Film(String name, Type type) {
        this.name = name;
        this.type = type;
    }

    public Film(String name, String typeString) {
        this.name = name;
        setTypeString(typeString);
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public void setTypeString(String type) {
        if (type.equals("new")) setType(Type.NEW_RELEASE);
        else if (type.equals("regular")) setType(Type.REGULAR);
        else if (type.equals("old")) setType(Type.OLD_FILM);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isRented() {
        return isRented;
    }

    public void setRented(boolean rented) {
        isRented = rented;
    }

    @Override
    public String toString() {
        return "main.Film Name:" + name + " main.Film type:" + type;
    }
}
