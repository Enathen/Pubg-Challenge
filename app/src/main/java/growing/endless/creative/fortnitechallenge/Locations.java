package growing.endless.creative.fortnitechallenge;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.widget.CheckBox;

import java.util.ArrayList;

/**
 * @author Jonathan Alexander Norberg
 * @version 2018-04-27
 */

public class Locations {

    public static ArrayList<Location> getFortniteLocations(Activity context){
        final SharedPreferences sharedPreferences =
                PreferenceManager.getDefaultSharedPreferences(context);
        ArrayList<Location> locations = new ArrayList<>();
        if(sharedPreferences.getBoolean(String.valueOf(((CheckBox)context.findViewById(R.id.checkBoxLargeTown)).getText()),true)) {
            fortniteAddLargeTowns(context, locations);
        }

        if(sharedPreferences.getBoolean(String.valueOf(((CheckBox)context.findViewById(R.id.checkBoxCommonTown)).getText()),true)) {
            fortniteAddCommonTowns(context, locations);
        }
        if(sharedPreferences.getBoolean(String.valueOf(((CheckBox)context.findViewById(R.id.checkBoxUnnamedTown)).getText()),true)) {
            fortniteAddUnnamedTowns(context,locations);
        }
        return locations;
    }

    private static void fortniteAddUnnamedTowns(Context context, ArrayList<Location> locations) {
        locations.add(new Location(955,920,Radius.getMedium(),context.getString(R.string.fortnitePrison)));
        locations.add(new Location(630,885,Radius.getMedium(),context.getString(R.string.fortniteHouseOnHill)));
        locations.add(new Location(505,215,Radius.getMedium(),context.getString(R.string.fortniteMotel)));
        locations.add(new Location(302,602,Radius.getMedium(),context.getString(R.string.fortniteIndoorFootballField)));
        locations.add(new Location(915,505,Radius.getMedium(),context.getString(R.string.fortniteCargoArea)));
        locations.add(new Location(545,1015,Radius.getMedium(),context.getString(R.string.fortniteFactory)));
        locations.add(new Location(1130,745,Radius.getLarge(),context.getString(R.string.fortniteRaceTrack)));
        locations.add(new Location(1048,625,Radius.getMedium(),context.getString(R.string.fortniteCampSite)));
        locations.add(new Location(945,240,Radius.getLarge(),context.getString(R.string.fortniteNorthHouses)));
    }

    private static void fortniteAddCommonTowns(Context context, ArrayList<Location> locations) {
        locations.add(new Location(175,260,Radius.getMedium(),context.getString(R.string.fortniteHauntedHills)));
        locations.add(new Location(245,155,Radius.getMedium(),context.getString(R.string.fortniteJunkJunction)));
        locations.add(new Location(112,570,Radius.getLarge(),context.getString(R.string.fortniteSnobbyShores)));
        locations.add(new Location(460,800,Radius.getMedium(),context.getString(R.string.fortniteShiftyShafts)));
        locations.add(new Location(545,470,Radius.getMedium(),context.getString(R.string.fortniteLootLake)));
        locations.add(new Location(730,565,Radius.getMedium(),context.getString(R.string.fortniteDustyDepot)));
        locations.add(new Location(730,765,Radius.getLarge(),context.getString(R.string.fortniteSaltySprings)));
        locations.add(new Location(833,390,Radius.getMedium(),context.getString(R.string.fortniteTomatoTown)));
        locations.add(new Location(1035,365,Radius.getMedium(),context.getString(R.string.fortniteWailingWoods)));
        locations.add(new Location(1110,505,Radius.getMedium(),context.getString(R.string.fortniteLonelyLodge)));
        locations.add(new Location(1040,975,Radius.getLarge(),context.getString(R.string.fortniteMoistyMire)));

    }

    private static void fortniteAddLargeTowns(Context context, ArrayList<Location> locations){
        locations.add(new Location(350,370,Radius.getLarge(),context.getString(R.string.fortnitePleasantPark)));
        locations.add(new Location(465,622,Radius.getLarge(),context.getString(R.string.fortniteTiltedTowers)));
        locations.add(new Location(292,780,Radius.getLarge(),context.getString(R.string.fortniteGreasyGrove)));
        locations.add(new Location(445,1085,Radius.getMedium(),context.getString(R.string.fortniteFlushFactory)));
        locations.add(new Location(750,950,Radius.getLarge(),context.getString(R.string.fortniteFatalFields)));
        locations.add(new Location(655,280,Radius.getLarge(),context.getString(R.string.fortniteAnarchyAcres)));
        locations.add(new Location(940,665,Radius.getLarge(),context.getString(R.string.fortniteRetailRows)));
        locations.add(new Location(715,1142,Radius.getLarge(),context.getString(R.string.fortniteLuckyLanding)));
    }

}
