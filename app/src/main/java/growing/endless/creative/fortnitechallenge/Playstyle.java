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

public class Playstyle {
    public static ArrayList<String> getPlaystyle(Activity context){
        ArrayList<String> playStyles = new ArrayList<>();
        final SharedPreferences sharedPreferences =
                PreferenceManager.getDefaultSharedPreferences(context);
        if(sharedPreferences.getBoolean(String.valueOf(((CheckBox)context.findViewById(R.id.checkBoxChallengeYouWillDieAlot)).getText()),true)) {
            addSerious(context, playStyles);
        }
        if(sharedPreferences.getBoolean(String.valueOf(((CheckBox)context.findViewById(R.id.checkBoxChallengeEasy)).getText()),true)) {

        }
        if(sharedPreferences.getBoolean(String.valueOf(((CheckBox)context.findViewById(R.id.checkBoxChallengeFunny)).getText()),true)) {

        }
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
