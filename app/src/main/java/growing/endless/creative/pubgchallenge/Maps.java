package growing.endless.creative.pubgchallenge;

import android.app.Activity;

import java.util.LinkedHashMap;

import static growing.endless.creative.pubgchallenge.Locations.getErangelLocations;
import static growing.endless.creative.pubgchallenge.Locations.getMiramarLocations;
import static growing.endless.creative.pubgchallenge.Locations.getSavageLocations;

/**
 * @author Jonathan Alexander Norberg
 * @version 2018-04-28
 */

class Maps {

    static LinkedHashMap<String,Map> createMaps(Activity context){
        LinkedHashMap<String,Map> maps = new LinkedHashMap<>();
        maps.put("Erangel",new Map(R.drawable.erangel, "Erangel",getErangelLocations(context)));
        maps.put("Miramar",new Map(R.drawable.miramar, "Miramar",getMiramarLocations(context)));
        maps.put("Savage",new Map(R.drawable.savage, "Savage",getSavageLocations(context)));

        return maps;
    }
}
