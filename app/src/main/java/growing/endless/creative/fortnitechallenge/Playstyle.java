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
            addEasyChallenges(context,playStyles);
        }
        if(sharedPreferences.getBoolean(String.valueOf(((CheckBox)context.findViewById(R.id.checkBoxChallengeFunny)).getText()),true)) {
            addFunny(context, playStyles);
        }
        if(sharedPreferences.getBoolean(String.valueOf(((CheckBox)context.findViewById(R.id.checkBoxChallengeDuoSquad)).getText()),true)) {
            addSquadDuoChallenges(context, playStyles);
        }
        return playStyles;
    }

    private static void addEasyChallenges(Activity context, ArrayList<String> playStyles) {
    }

    private static void addSquadDuoChallenges(Activity context, ArrayList<String> playStyles) {
        playStyles.add(context.getString(R.string.squadOrDuoLove));
        playStyles.add(context.getString(R.string.squadOrDuoSilence));
        playStyles.add(context.getString(R.string.squadOrDuoCarePackage));
        playStyles.add(context.getString(R.string.squadOrDuoCarePackageNoKIll));
    }

    private static void addFunny(Activity context, ArrayList<String> playStyles) {

    }

    private static void addSerious(Context context, ArrayList<String> playStyles) {
        playStyles.add(context.getString(R.string.challengeWithoutKilling));
        playStyles.add(context.getString(R.string.challengeOnlyHandguns));
        playStyles.add(context.getString(R.string.challengeOnlySniper));
        playStyles.add(context.getString(R.string.challengeOnlyHipfireSniper));
        playStyles.add(context.getString(R.string.challengeOnlyShotgun));
        playStyles.add(context.getString(R.string.challengeOnlyMelee));
    }
}
