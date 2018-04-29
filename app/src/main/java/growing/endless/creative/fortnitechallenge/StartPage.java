package growing.endless.creative.fortnitechallenge;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Spinner;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;

import java.util.ArrayList;
import java.util.LinkedHashMap;

import static growing.endless.creative.fortnitechallenge.Maps.createMaps;
import static growing.endless.creative.fortnitechallenge.Playstyle.getPlaystyle;
import static growing.endless.creative.fortnitechallenge.RandomPicker.getRandom;

public class StartPage extends AppCompatActivity {

    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Log.d(TAG, "onNavigationItemSelected: "+ item.getItemId());
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    if(findViewById(R.id.lin) != null){
                        findViewById(R.id.lin).setVisibility(View.VISIBLE);
                    }else{
                        findViewById(R.id.scrollView).setVisibility(View.VISIBLE);
                    }
                    findViewById(R.id.LinearLayoutButton).setVisibility(View.VISIBLE);
                    if(maps.size()>1){
                        findViewById(R.id.linearLayoutSpinner).setVisibility(View.VISIBLE);

                    }
                    //Map map = (Map) maps.values().toArray()[0];
                    //new DrawOnMap((TouchImageView) findViewById(R.id.imageViewClick),map.getMap(), StartPage.this);
                    findViewById(R.id.imageViewClick).setVisibility(View.VISIBLE);
                    findViewById(R.id.scrollView2).setVisibility(View.INVISIBLE);
                    return true;
                case R.id.navigation_notifications:
                    if(findViewById(R.id.lin) != null){
                        findViewById(R.id.lin).setVisibility(View.INVISIBLE);
                    }else{
                        findViewById(R.id.scrollView).setVisibility(View.INVISIBLE);
                    }
                    findViewById(R.id.LinearLayoutButton).setVisibility(View.INVISIBLE);
                    findViewById(R.id.imageViewClick).setVisibility(View.INVISIBLE);
                    findViewById(R.id.linearLayoutSpinner).setVisibility(View.GONE);
                    findViewById(R.id.scrollView2).setVisibility(View.VISIBLE);


                    return true;
            }
            return false;
        }
    };
    private String TAG = "STARTPAGE";
    private View buttonRollClick;
    private InterstitialAd mInterstitialAd;
    LinkedHashMap<String, Map> maps = new LinkedHashMap<>();
    private boolean notYetLoaded= false;

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_page);

        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-3607354849437438/7234401779");
        mTextMessage = (TextView) findViewById(R.id.message);
        final TouchImageView viewById = (TouchImageView) findViewById(R.id.imageViewClick);
        maps = createMaps(this);
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
        setupSettingsView();
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

    private void setupSettingsView() {
        findViewById(R.id.buttonSendTips).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent emailIntent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts(
                        "mailto", "creativeEndlessGrowing@gmail.com", null));
                startActivity(Intent.createChooser(emailIntent, getString(R.string.sendTipsFrom)));
            }
        });
        checkboxCheck((CheckBox) findViewById(R.id.checkBoxChallengeEasy));
        checkboxCheck((CheckBox) findViewById(R.id.checkBoxChallengeFunny));
        checkboxCheck((CheckBox) findViewById(R.id.checkBoxChallengeDuoSquad));
        checkboxCheck((CheckBox) findViewById(R.id.checkBoxChallengeYouWillDieAlot));
        checkboxCheck((CheckBox) findViewById(R.id.checkBoxLargeTown));
        checkboxCheck((CheckBox) findViewById(R.id.checkBoxCommonTown));
        checkboxCheck((CheckBox) findViewById(R.id.checkBoxUnnamedTown));
    }
    private void checkboxCheck(CheckBox checkBox){

        checkBox.setTypeface(ResourcesCompat.getFont(this, R.font.luckiestguy));
        final SharedPreferences sharedPreferences =
                PreferenceManager.getDefaultSharedPreferences(this);
        checkBox.setChecked(sharedPreferences.getBoolean(String.valueOf(checkBox.getText()),true));
        final SharedPreferences.Editor sharedPreferencesEditor =
                PreferenceManager.getDefaultSharedPreferences(this).edit();
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                sharedPreferencesEditor.putBoolean(String.valueOf(compoundButton.getText()),b).commit();
                maps = createMaps(StartPage.this);
            }
        });

    }
    public void buttonRollClick(TouchImageView viewById, Map map){
        final SharedPreferences sharedPreferences =
                PreferenceManager.getDefaultSharedPreferences(getBaseContext());
        SharedPreferences.Editor sharedPreferencesEditor =
                PreferenceManager.getDefaultSharedPreferences(getBaseContext()).edit();
        int interstitial = sharedPreferences.getInt("interstitial", 0);
        if(interstitial != 4){
            if(interstitial == 0)
                mInterstitialAd.loadAd(new AdRequest.Builder().addTestDevice("85566EDEF434C46837B6373FFB555990").build());
            sharedPreferencesEditor.putInt(
                    "interstitial", interstitial+1);
            sharedPreferencesEditor.apply();
            if(notYetLoaded){
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();

                }else{
                    notYetLoaded = true;
                }
            }
        }else{

            if (mInterstitialAd.isLoaded()) {
                mInterstitialAd.show();

            }else{
                notYetLoaded = true;
            }

            sharedPreferencesEditor.putInt(
                    "interstitial", 0);
            sharedPreferencesEditor.apply();
        }
        if(map.getLocations().isEmpty()){
            ((TextView)findViewById(R.id.textViewLocation)).setText(getString(R.string.noLocation));
            new DrawOnMap(viewById,map.getMap(),StartPage.this);
        }else{
            Location location = (Location) getRandom(map.getLocations());
            new DrawOnMap(viewById,map.getMap(), location, StartPage.this);
            ((TextView)findViewById(R.id.textViewLocation)).setText(location.getName());

        }
        ArrayList<String> playstyle = getPlaystyle(StartPage.this);
        if(playstyle.isEmpty()){
            ((TextView)findViewById(R.id.textViewChallenge)).setText(getString(R.string.noPlaystyle));
        }else{
            ((TextView)findViewById(R.id.textViewChallenge)).setText((String) getRandom(playstyle));

        }
    }


}
