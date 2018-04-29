package growing.endless.creative.pubgchallenge;

/**
 * @author Jonathan Alexander Norberg
 * @version 2018-04-27
 */

public class Location {
    private int x;
    private int y;
    private int radius;
    private String name;

    public Location(int x, int y, int radius,String Name) {

        this.x = x;
        this.y = y;
        this.radius = radius;
        name = Name;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getRadius() {
        return radius;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
