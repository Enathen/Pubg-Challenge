package growing.endless.creative.fortnitechallenge;

import java.util.ArrayList;

/**
 * @author Jonathan Alexander Norberg
 * @version 2018-04-29
 */

class RandomTip {
    private ArrayList<Integer> splashScreenTip;

    public static ArrayList<Integer> getSplashScreenTip() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(R.string.tipToWin);
        arrayList.add(R.string.tipDontDie);
        arrayList.add(R.string.tipDontRPG);
        arrayList.add(R.string.tipWin);
        arrayList.add(R.string.tipNoShit);
        arrayList.add(R.string.tipDontGrenade);
        arrayList.add(R.string.tipLoose);
        arrayList.add(R.string.tipDontKill);
        arrayList.add(R.string.tipOhReally);
        arrayList.add(R.string.tipBiggerChangeSquad);

        return arrayList;
    }
}
