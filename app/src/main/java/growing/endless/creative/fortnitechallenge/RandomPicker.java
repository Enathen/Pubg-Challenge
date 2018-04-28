package growing.endless.creative.fortnitechallenge;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author Jonathan Alexander Norberg
 * @version 2018-04-27
 */

public class RandomPicker {
    static public Object getRandom(ArrayList<?> tArrayList) {
        return tArrayList.get(new Random().nextInt(tArrayList.size()));
    }
}
