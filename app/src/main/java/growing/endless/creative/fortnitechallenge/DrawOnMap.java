package growing.endless.creative.fortnitechallenge;

/**
 * @author Jonathan Alexander Norberg
 * @version 2018-04-27
 */

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;


public class DrawOnMap {
    private static final String TAG = "DRAW ON MAP";

    public DrawOnMap(TouchImageView touchImageView,int map, Location location, Activity activity){
        int x = location.getX();
        int y = location.getY();
        BitmapFactory.Options myOptions = new BitmapFactory.Options();
        myOptions.inDither = true;
        myOptions.inScaled = false;
        myOptions.inPreferredConfig = Bitmap.Config.ARGB_8888;
        myOptions.inPurgeable = true;

        Bitmap bitmap = BitmapFactory.decodeResource(activity.getResources(),map,myOptions);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(activity.getColor(R.color.colorPrimary));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(10);


        Bitmap workingBitmap = Bitmap.createBitmap(bitmap);
        Bitmap mutableBitmap = workingBitmap.copy(Bitmap.Config.ARGB_8888, true);


        Canvas canvas = new Canvas(mutableBitmap);
        canvas.drawCircle(x, y, location.getRadius(), paint);


        touchImageView.setAdjustViewBounds(true);
        touchImageView.setImageBitmap(mutableBitmap);
    }

    /**
     * this to center it out in the start
     * @param map
     * @param mapMap
     * @param activity
     */
    public DrawOnMap(TouchImageView map, int mapMap, Activity activity) {
        BitmapFactory.Options myOptions = new BitmapFactory.Options();
        myOptions.inDither = true;
        myOptions.inScaled = false;
        myOptions.inPreferredConfig = Bitmap.Config.ARGB_8888;
        myOptions.inPurgeable = true;

        Bitmap bitmap = BitmapFactory.decodeResource(activity.getResources(), mapMap,myOptions);



        Bitmap workingBitmap = Bitmap.createBitmap(bitmap);
        Bitmap mutableBitmap = workingBitmap.copy(Bitmap.Config.ARGB_8888, true);


        map.setAdjustViewBounds(true);
        map.setImageBitmap(mutableBitmap);
    }
}
