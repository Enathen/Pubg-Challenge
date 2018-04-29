package growing.endless.creative.fortnitechallenge;

import android.app.Activity;

import java.util.LinkedHashMap;

import static growing.endless.creative.fortnitechallenge.Locations.getFortniteLocations;

/**
 * @author Jonathan Alexander Norberg
 * @version 2018-04-28
 */

class Maps {

    static LinkedHashMap<String,Map> createMaps(Activity context){
        LinkedHashMap<String,Map> maps = new LinkedHashMap<>();
        maps.put("Fortnite",new Map(R.drawable.map, "Fortnite",getFortniteLocations(context)));

        return maps;
    }
}
