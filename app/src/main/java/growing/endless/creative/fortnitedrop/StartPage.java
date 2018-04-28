package growing.endless.creative.fortnitedrop;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.LinkedHashMap;

import static growing.endless.creative.fortnitedrop.Maps.createMaps;
import static growing.endless.creative.fortnitedrop.Playstyle.getPlaystyle;
import static growing.endless.creative.fortnitedrop.RandomPicker.getRandom;

public class StartPage extends AppCompatActivity {

    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    Toast.makeText(StartPage.this, "Not Implemented", Toast.LENGTH_LONG).show();
                    return true;
                case R.id.navigation_dashboard:
                    Toast.makeText(StartPage.this, "Not Implemented", Toast.LENGTH_LONG).show();
                    return true;
                case R.id.navigation_notifications:
                    Toast.makeText(StartPage.this, "Not Implemented", Toast.LENGTH_LONG).show();
                    return true;
            }
            return false;
        }
    };
    private String TAG = "STARTPAGE";
    private View buttonRollClick;

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_page);

        mTextMessage = (TextView) findViewById(R.id.message);
        final TouchImageView viewById = (TouchImageView) findViewById(R.id.imageViewClick);
        final LinkedHashMap<String, Map> maps = createMaps(this);
        buttonRollClick = findViewById(R.id.button);
        buttonRollClick.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
                Map map = (Map) maps.values().toArray()[0];
                buttonRollClick(viewById, map);
            }
        });
        Map map = (Map) maps.values().toArray()[0];
        new DrawOnMap(viewById,map.getMap(), this);
        if(maps.size()>1){
            findViewById(R.id.linearLayoutSpinner).setVisibility(View.VISIBLE);
            Spinner spinner = findViewById(R.id.spinner);
            spinner.setVisibility(View.VISIBLE);
            final String[] keys = maps.keySet().toArray(new String[0]);
            final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                    R.layout.spinner_item, keys);
            adapter.setDropDownViewResource(R.layout.spinner_dropdown_item);
            spinner.setAdapter(adapter);
            spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    final TouchImageView touchImageView = (TouchImageView) findViewById(R.id.imageViewClick);
                    final Map map = maps.get(((TextView) view).getText());
                    touchImageView.setImageDrawable(getDrawable(map.getMap()));
                    Log.d(TAG, "onItemSelected: "+ touchImageView.getMeasuredWidth());
                    buttonRollClick.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            buttonRollClick(touchImageView, map);
                        }
                    });
                    ((TextView)findViewById(R.id.textViewLocation)).setText(getString(R.string.location));
                    ((TextView)findViewById(R.id.textViewChallenge)).setText(getString(R.string.challenge));
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

        }
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }
    public void buttonRollClick(TouchImageView viewById, Map map){

        Location location = (Location) getRandom(map.getLocations());

        Log.d(TAG, "buttonRollClick: "+ viewById.getMeasuredWidth());

        new DrawOnMap(viewById,map.getMap(), location, StartPage.this);
        ((TextView)findViewById(R.id.textViewLocation)).setText(location.getName());
        ((TextView)findViewById(R.id.textViewChallenge)).setText((String)getRandom(getPlaystyle(StartPage.this)));
    }


}
