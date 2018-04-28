package growing.endless.creative.fortnitedrop;

import android.content.Context;

import java.util.LinkedHashMap;

import static growing.endless.creative.fortnitedrop.Locations.getFortniteLocations;

/**
 * @author Jonathan Alexander Norberg
 * @version 2018-04-28
 */

class Maps {

    static LinkedHashMap<String,Map> createMaps(Context context){
        LinkedHashMap<String,Map> maps = new LinkedHashMap<>();
        maps.put("Fortnite",new Map(R.drawable.map, "Fortnite",getFortniteLocations(context)));

        return maps;
    }
}
