package growing.endless.creative.pubgchallenge;

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
    public static ArrayList<Location> getErangelLocations(Activity context){
        final SharedPreferences sharedPreferences =
                PreferenceManager.getDefaultSharedPreferences(context);
        ArrayList<Location> locations = new ArrayList<>();
        if(sharedPreferences.getBoolean(String.valueOf(((CheckBox)context.findViewById(R.id.checkBoxLargeTown)).getText()),true)) {
            erangelAddLargeTowns(context, locations);
        }

        if(sharedPreferences.getBoolean(String.valueOf(((CheckBox)context.findViewById(R.id.checkBoxCommonTown)).getText()),true)) {
            erangelAddCommonTowns(context, locations);
        }
        if(sharedPreferences.getBoolean(String.valueOf(((CheckBox)context.findViewById(R.id.checkBoxUnnamedTown)).getText()),true)) {
            erangelAddUnnamedTowns(context,locations);
        }
        return locations;
    }
    private static void erangelAddLargeTowns(Activity context, ArrayList<Location> locations) {
        locations.add(new Location(720,1040,Radius.getLarge(),context.getString(R.string.erangelMilitaryBase)));
        locations.add(new Location(1000,965,Radius.getLarge(),context.getString(R.string.erangelNovorepnoye)));
        locations.add(new Location(305,425,Radius.getLarge(),context.getString(R.string.erangelGeorgopolSouth)));
        locations.add(new Location(305,330,Radius.getLarge(),context.getString(R.string.erangelGeorgopolNorth)));
        locations.add(new Location(575,645,Radius.getMedium(),context.getString(R.string.erangelPochinki)));
        locations.add(new Location(880,360,Radius.getLarge(),context.getString(R.string.erangelYasnayaPolyana)));
        locations.add(new Location(605,170,Radius.getMedium(),context.getString(R.string.erangelSeverny)));
        locations.add(new Location(640,445,Radius.getMedium(),context.getString(R.string.erangelRozhok)));
        locations.add(new Location(245,980,Radius.getLarge(),context.getString(R.string.erangelPrimorsk)));
        locations.add(new Location(1145,520,Radius.getMedium(),context.getString(R.string.erangelLipovka)));
        locations.add(new Location(975,755,Radius.getMedium(),context.getString(R.string.erangelMylta)));
        locations.add(new Location(1180,690,Radius.getMedium(),context.getString(R.string.erangelMyltaPower)));
    }
    private static void erangelAddCommonTowns(Activity context, ArrayList<Location> locations) {
        locations.add(new Location(145,175,Radius.getMedium(),context.getString(R.string.erangelZharki)));
        locations.add(new Location(460,890,Radius.getMedium(),context.getString(R.string.erangelFerryPier)));
        locations.add(new Location(670,505,Radius.getSmall(),context.getString(R.string.erangelSchool)));
        locations.add(new Location(490,500,Radius.getSmall(),context.getString(R.string.erangelRuins)));
        locations.add(new Location(335,605,Radius.getSmall(),context.getString(R.string.erangelGatka)));
        locations.add(new Location(220,495,Radius.getSmall(),context.getString(R.string.erangelHospital)));
        locations.add(new Location(530,245,Radius.getMedium(),context.getString(R.string.erangelShootingRange)));
        locations.add(new Location(920,185,Radius.getMedium(),context.getString(R.string.erangelStalber)));
        locations.add(new Location(1080,140,Radius.getMedium(),context.getString(R.string.erangelKameshki)));
        locations.add(new Location(1010,470,Radius.getSmall(),context.getString(R.string.erangelMansion)));
        locations.add(new Location(1015,585,Radius.getSmall(),context.getString(R.string.erangelPrison)));
        locations.add(new Location(920,600,Radius.getSmall(),context.getString(R.string.erangelShelter)));
        locations.add(new Location(870,715,Radius.getSmall(),context.getString(R.string.erangelFarm)));
        locations.add(new Location(265,955,Radius.getMedium(),context.getString(R.string.erangelQuarry)));

    }

    private static void erangelAddUnnamedTowns(Activity context, ArrayList<Location> locations) {
        locations.add(new Location(550,485,Radius.getSmall(),context.getString(R.string.erangelFloodedCity)));
        locations.add(new Location(900,1005,Radius.getSmall(),context.getString(R.string.erangelRadioTower)));
        locations.add(new Location(1025,660,Radius.getMedium(),context.getString(R.string.erangelLumberjackVillage)));
        locations.add(new Location(800,270,Radius.getSmall(),context.getString(R.string.erangelTownNearLake)));
        locations.add(new Location(700,520,Radius.getMedium(),context.getString(R.string.erangelHouseComplex)));
        locations.add(new Location(585,815,Radius.getMedium(),context.getString(R.string.erangelTwinVillage)));
        locations.add(new Location(210,655,Radius.getSmall(),context.getString(R.string.erangelObservatory)));
        locations.add(new Location(715,465,Radius.getSmall(),context.getString(R.string.erangelVillageCloseToBridge)));
        locations.add(new Location(1120,735,Radius.getSmall(),context.getString(R.string.erangelMyltaPowerStorage)));
        locations.add(new Location(960,455,Radius.getSmall(),context.getString(R.string.erangelHillTown)));
    }




    public static ArrayList<Location> getMiramarLocations(Activity context){
        final SharedPreferences sharedPreferences =
                PreferenceManager.getDefaultSharedPreferences(context);
        ArrayList<Location> locations = new ArrayList<>();
        if(sharedPreferences.getBoolean(String.valueOf(((CheckBox)context.findViewById(R.id.checkBoxLargeTown)).getText()),true)) {
            miramarAddLargeTowns(context, locations);
        }

        if(sharedPreferences.getBoolean(String.valueOf(((CheckBox)context.findViewById(R.id.checkBoxCommonTown)).getText()),true)) {
            miramarAddCommonTowns(context, locations);
        }
        if(sharedPreferences.getBoolean(String.valueOf(((CheckBox)context.findViewById(R.id.checkBoxUnnamedTown)).getText()),true)) {
            miramarAddUnnamedTowns(context,locations);
        }
        return locations;
    }


    private static void miramarAddLargeTowns(Activity context, ArrayList<Location> locations) {
        locations.add(new Location(265,430,Radius.getMedium(),context.getString(R.string.miramarElPozo)));
        locations.add(new Location(370,215,Radius.getMedium(),context.getString(R.string.miramarLaCobreria)));
        locations.add(new Location(820,75,Radius.getMedium(),context.getString(R.string.miramarTorreAhumada)));
        locations.add(new Location(1060,75,Radius.getMedium(),context.getString(R.string.miramarCampoMilitar)));
        locations.add(new Location(980,400,Radius.getMedium(),context.getString(R.string.miramarElAzahar)));
        locations.add(new Location(985,720,Radius.getMedium(),context.getString(R.string.miramarImpala)));
        locations.add(new Location(740,835,Radius.getMedium(),context.getString(R.string.miramarLosLeones)));
        locations.add(new Location(580,660,Radius.getMedium(),context.getString(R.string.miramarPecado)));
        locations.add(new Location(420,810,Radius.getMedium(),context.getString(R.string.miramarChumacera)));
        locations.add(new Location(315,620,Radius.getMedium(),context.getString(R.string.miramarMonteNuevo)));
        locations.add(new Location(210,915,Radius.getMedium(),context.getString(R.string.miramarValleDelMar)));
        locations.add(new Location(1000,190,Radius.getMedium(),context.getString(R.string.miramarTierraBronca)));
        locations.add(new Location(590,445,Radius.getMedium(),context.getString(R.string.miramarSanMartin)));
    }
    private static void miramarAddCommonTowns(Activity context, ArrayList<Location> locations) {
        locations.add(new Location(390,1115,Radius.getMedium(),context.getString(R.string.miramarLosHigos)));
        locations.add(new Location(140,1110,Radius.getMedium(),context.getString(R.string.miramarPrison)));
        locations.add(new Location(190,1077,Radius.getMedium(),context.getString(R.string.miramarMinasDelSur)));
        locations.add(new Location(350,915,Radius.getMedium(),context.getString(R.string.miramarMinasDelValle)));
        locations.add(new Location(775,660,Radius.getMedium(),context.getString(R.string.miramarLaBendita)));
        locations.add(new Location(690,565,Radius.getMedium(),context.getString(R.string.miramarGravyard)));
        locations.add(new Location(790,565,Radius.getMedium(),context.getString(R.string.miramarMinasGenerales)));
        locations.add(new Location(900,520,Radius.getMedium(),context.getString(R.string.miramarJunkyard)));
        locations.add(new Location(666,430,Radius.getMedium(),context.getString(R.string.miramarHaciendaDelPatrón)));
        locations.add(new Location(490,540,Radius.getMedium(),context.getString(R.string.miramarPowerGrid)));
        locations.add(new Location(285,747,Radius.getMedium(),context.getString(R.string.miramarLadrillera)));
        locations.add(new Location(90,290,Radius.getMedium(),context.getString(R.string.miramarTrailerPark)));
        locations.add(new Location(35,215,Radius.getMedium(),context.getString(R.string.miramarRuins)));
        locations.add(new Location(320,310,Radius.getMedium(),context.getString(R.string.miramarCrateFields)));
        locations.add(new Location(665,290,Radius.getMedium(),context.getString(R.string.miramarWaterTreatment)));
        locations.add(new Location(665,840,Radius.getMedium(),context.getString(R.string.miramarCruzDelValle)));
    }

    private static void miramarAddUnnamedTowns(Activity context, ArrayList<Location> locations) {
        locations.add(new Location(240,1100,Radius.getArea(),context.getString(R.string.miramarIslandSouthWest)));
        locations.add(new Location(1130,780,Radius.getArea(),context.getString(R.string.miramarIslandEast)));
        locations.add(new Location(405,310,Radius.getMedium(),context.getString(R.string.miramarCrater)));
    }


    public static ArrayList<Location> getSavageLocations(Activity context){
        final SharedPreferences sharedPreferences =
                PreferenceManager.getDefaultSharedPreferences(context);
        ArrayList<Location> locations = new ArrayList<>();
        if(sharedPreferences.getBoolean(String.valueOf(((CheckBox)context.findViewById(R.id.checkBoxLargeTown)).getText()),true)) {
            savageAddLargeTowns(context, locations);
        }

        if(sharedPreferences.getBoolean(String.valueOf(((CheckBox)context.findViewById(R.id.checkBoxCommonTown)).getText()),true)) {
            savageAddCommonTowns(context, locations);
        }
        if(sharedPreferences.getBoolean(String.valueOf(((CheckBox)context.findViewById(R.id.checkBoxUnnamedTown)).getText()),true)) {
            savageAddUnnamedTowns(context,locations);
        }
        return locations;
    }

    private static void savageAddLargeTowns(Activity context, ArrayList<Location> locations) {
        locations.add(new Location(155,475,Radius.getMedium(),context.getString(R.string.savageBootcampAlpha)));
        locations.add(new Location(325,280,Radius.getMedium(),context.getString(R.string.savageManufacturing)));

        locations.add(new Location(700,145,Radius.getMedium(),context.getString(R.string.savageCoastal)));
        locations.add(new Location(550,565,Radius.getMedium(),context.getString(R.string.savageTrainingCenter)));
        locations.add(new Location(750,360,Radius.getMedium(),context.getString(R.string.savageAbandonedResort)));
        locations.add(new Location(540,840,Radius.getMedium(),context.getString(R.string.savageRiverTown)));
        locations.add(new Location(395,1140,Radius.getMedium(),context.getString(R.string.savageCommerce)));
        locations.add(new Location(700,1100,Radius.getMedium(),context.getString(R.string.savageBootcampCharlie)));
        locations.add(new Location(1080,890,Radius.getMedium(),context.getString(R.string.savageRiceFarmingTown)));
        locations.add(new Location(1080,430,Radius.getMedium(),context.getString(R.string.savageBootcampBravo)));

    }

    private static void savageAddCommonTowns(Activity context, ArrayList<Location> locations) {
        locations.add(new Location(950,1070,Radius.getMedium(),context.getString(R.string.savageDock)));
        locations.add(new Location(725,1187,Radius.getMedium(),context.getString(R.string.savageBeach)));
        locations.add(new Location(505,1023,Radius.getMedium(),context.getString(R.string.savageLoggingCamp)));
        locations.add(new Location(650,220,Radius.getMedium(),context.getString(R.string.savageLoggingCamp)));
        locations.add(new Location(305,795,Radius.getMedium(),context.getString(R.string.savageSwampTemple)));
        locations.add(new Location(910,550,Radius.getMedium(),context.getString(R.string.savageBanyanGrove)));
        locations.add(new Location(985,174,Radius.getMedium(),context.getString(R.string.savageCoconutFarm)));
    }

    private static void savageAddUnnamedTowns(Activity context, ArrayList<Location> locations) {
        locations.add(new Location(230,475,Radius.getMedium(),context.getString(R.string.savageWest)));
        locations.add(new Location(840,580,Radius.getMedium(),context.getString(R.string.savageEast)));
        locations.add(new Location(400,1000,Radius.getMedium(),context.getString(R.string.savageSouth)));
    }
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
