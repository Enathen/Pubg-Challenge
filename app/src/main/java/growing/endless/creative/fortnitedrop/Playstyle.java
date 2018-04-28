package growing.endless.creative.fortnitedrop;

import android.content.Context;

import java.util.ArrayList;

/**
 * @author Jonathan Alexander Norberg
 * @version 2018-04-27
 */

public class Playstyle {
    public static ArrayList<String> getPlaystyle(Context context){
        ArrayList<String> playStyles = new ArrayList<>();
        addSerious(context, playStyles);
        return playStyles;
    }

    private static void addSerious(Context context, ArrayList<String> playStyles) {
        playStyles.add(context.getString(R.string.withoutKilling));
        playStyles.add(context.getString(R.string.onlyHandguns));
        playStyles.add(context.getString(R.string.onlySniper));
        playStyles.add(context.getString(R.string.onlyHipfireSniper));
        playStyles.add(context.getString(R.string.onlyShotgun));
        playStyles.add(context.getString(R.string.onlyMelee));
    }
}
