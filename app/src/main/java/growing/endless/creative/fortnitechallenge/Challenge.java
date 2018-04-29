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

public class Challenge {
    public static ArrayList<String> getChallenge(Activity context){
        ArrayList<String> challenges = new ArrayList<>();
        final SharedPreferences sharedPreferences =
                PreferenceManager.getDefaultSharedPreferences(context);
        if(sharedPreferences.getBoolean(String.valueOf(((CheckBox)context.findViewById(R.id.checkBoxChallengeYouWillDieAlot)).getText()),true)) {
            addYouWillDie(context, challenges);
        }
        if(sharedPreferences.getBoolean(String.valueOf(((CheckBox)context.findViewById(R.id.checkBoxChallengeEasy)).getText()),true)) {
            addEasy(context,challenges);
        }
        if(sharedPreferences.getBoolean(String.valueOf(((CheckBox)context.findViewById(R.id.checkBoxChallengeFunny)).getText()),true)) {
            addFunny(context, challenges);
        }
        if(sharedPreferences.getBoolean(String.valueOf(((CheckBox)context.findViewById(R.id.checkBoxChallengeDuoSquad)).getText()),true)) {
            addSquadDuo(context, challenges);
        }
        return challenges;
    }

    private static void addEasy(Activity context, ArrayList<String> challenges) {
        challenges.add(context.getString(R.string.challengeOnlyShotgun));
        challenges.add(context.getString(R.string.challengeOnlyHandguns));
        challenges.add(context.getString(R.string.challengeOnlySniper));
        challenges.add(context.getString(R.string.challengeHilltop));
    }

    private static void addSquadDuo(Activity context, ArrayList<String> challenges) {
        challenges.add(context.getString(R.string.squadOrDuoLove));
        challenges.add(context.getString(R.string.squadOrDuoSilence));
        challenges.add(context.getString(R.string.squadOrDuoCarePackage));
        challenges.add(context.getString(R.string.squadOrDuoPackageNoKIll));
        challenges.add(context.getString(R.string.squadOrDuoKillFriendFinal));
        challenges.add(context.getString(R.string.squadOrDuoLetterE));
    }

    private static void addFunny(Activity context, ArrayList<String> challenges) {
        challenges.add(context.getString(R.string.challengeSneak));
        challenges.add(context.getString(R.string.challengeThreesixtie));
        challenges.add(context.getString(R.string.challengeDance));
        challenges.add(context.getString(R.string.challengeLink));

    }

    private static void addYouWillDie(Context context, ArrayList<String> challenges) {
        challenges.add(context.getString(R.string.challengeWithoutKilling));

        challenges.add(context.getString(R.string.challengeOnlyHipfireSniper));

        challenges.add(context.getString(R.string.challengeOnlyMelee));
        challenges.add(context.getString(R.string.challengeWinTwoTimes));
        challenges.add(context.getString(R.string.challengeWinWithoutKilling));
        challenges.add(context.getString(R.string.challengeKillTen));

    }
}
