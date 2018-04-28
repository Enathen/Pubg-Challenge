package growing.endless.creative.fortnitedrop;

import android.content.Context;

import java.util.ArrayList;

/**
 * @author Jonathan Alexander Norberg
 * @version 2018-04-27
 */

public class Locations {

    public static ArrayList<Location> getFortniteLocations(Context context){
        ArrayList<Location> locations = new ArrayList<>();
        fortniteAddBigTowns(context, locations);
        fortniteAddMediumTowns(context, locations);
        return locations;
    }

    private static void fortniteAddMediumTowns(Context context, ArrayList<Location> locations) {
        locations.add(new Location(245,155,Radius.getMedium(),context.getString(R.string.junkJunction)));
        locations.add(new Location(190,295,Radius.getMedium(),context.getString(R.string.hauntedHills)));
        locations.add(new Location(112,570,Radius.getMedium(),context.getString(R.string.snobbyShores)));
        locations.add(new Location(460,800,Radius.getMedium(),context.getString(R.string.shiftyShafts)));
        locations.add(new Location(545,470,Radius.getMedium(),context.getString(R.string.lootLake)));
        locations.add(new Location(730,565,Radius.getMedium(),context.getString(R.string.dustyDepot)));
        locations.add(new Location(735,765,Radius.getMedium(),context.getString(R.string.saltySprings)));
        locations.add(new Location(833,390,Radius.getMedium(),context.getString(R.string.tomatoTown)));
        locations.add(new Location(1035,365,Radius.getMedium(),context.getString(R.string.wailingWoods)));
        locations.add(new Location(1110,505,Radius.getMedium(),context.getString(R.string.lonelyLodge)));
        locations.add(new Location(1040,975,Radius.getMedium(),context.getString(R.string.moistyMire)));

    }

    private static void fortniteAddBigTowns(Context context, ArrayList<Location> locations){
        locations.add(new Location(350,370,Radius.getLarge(),context.getString(R.string.pleasantPark)));
        locations.add(new Location(465,622,Radius.getLarge(),context.getString(R.string.tiltedTowers)));
        locations.add(new Location(292,780,Radius.getLarge(),context.getString(R.string.greasyGrove)));
        locations.add(new Location(445,1085,Radius.getLarge(),context.getString(R.string.flushFactory)));
        locations.add(new Location(750,950,Radius.getLarge(),context.getString(R.string.fatalFields)));
        locations.add(new Location(655,280,Radius.getLarge(),context.getString(R.string.anarchyAcres)));
        locations.add(new Location(940,665,Radius.getLarge(),context.getString(R.string.retailRows)));
        locations.add(new Location(715,1142,Radius.getLarge(),context.getString(R.string.luckyLanding)));
    }

}
