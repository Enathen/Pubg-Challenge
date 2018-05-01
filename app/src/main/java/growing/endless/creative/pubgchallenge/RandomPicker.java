package growing.endless.creative.pubgchallenge;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author Jonathan Alexander Norberg
 * @version 2018-04-27
 */

public class RandomPicker {
    private int random;
    public Object getRandom(ArrayList<?> tArrayList) {
        if(tArrayList.size()>1){
            while (true){
                int i = new Random().nextInt(tArrayList.size());
                if(i != random){
                    random = i;
                    break;
                }
            }

        }else{
            random = 0;
        }

        return tArrayList.get(random);
    }
}
