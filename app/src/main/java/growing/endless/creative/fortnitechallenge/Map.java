package growing.endless.creative.fortnitechallenge;

import java.util.ArrayList;

/**
 * @author Jonathan Alexander Norberg
 * @version 2018-04-27
 */

public class Map {
    private int x;
    private int y;
    private int map;
    private ArrayList<Location> locations;
    private String mapName;
    public Map(int map, String mapName, ArrayList<Location> locations){

        this.map = map;
        //x = map.getDrawable().getIntrinsicWidth();
        //y = map.getDrawable().getIntrinsicHeight();
        this.mapName = mapName;
        this.locations = locations;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getMap() {
        return map;
    }

    public String getMapName() {
        return mapName;
    }

    @Override
    public String toString() {
        return mapName;
    }

    public ArrayList<Location> getLocations() {
        return locations;
    }

    public void updateLocations() {
    }
}
