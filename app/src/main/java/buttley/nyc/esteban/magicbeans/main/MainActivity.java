package buttley.nyc.esteban.magicbeans.main;

import android.app.Activity;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.view.Window;
import android.view.WindowManager;

import java.util.HashMap;
import java.util.Map;

import buttley.nyc.esteban.magicbeans.R;
import buttley.nyc.esteban.magicbeans.logging.LoggerConfig;
import buttley.nyc.esteban.magicbeans.model.boards.widgets.WidgetTypeEnum;
import buttley.nyc.esteban.magicbeans.model.characters.CharacterNamesEnum;

public class MainActivity extends Activity {

    private Assets assets = new Assets();
    private AudioManager audioManager;
    public SoundPool soundPool;
    public static int sScreenWidth;
    public static int sScreenHeight;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(new buttley.nyc.esteban.magicbeans.main.MainGamePanel(this));
        getScreenSize();
        loadAssets();

        if(LoggerConfig.ON) {
            Log.d(LoggerConfig.LOG_TAG, "View added");
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    // loads all assets into Assets class
    public void loadAssets(){
        loadBitmaps();
        loadSounds();

        if(LoggerConfig.ON){
            Log.v(LoggerConfig.LOG_TAG, "assets loaded");
        }

    }

    public void loadSounds(){

        Map<CharacterNamesEnum, Integer> characterSoundMap =
                new HashMap<CharacterNamesEnum, Integer>();

        audioManager = (AudioManager)getSystemService(AUDIO_SERVICE);
        soundPool = new SoundPool(10, AudioManager.STREAM_MUSIC, 0);

        soundPool.setOnLoadCompleteListener(new SoundPool.OnLoadCompleteListener() {
            @Override
            public void onLoadComplete(SoundPool soundPool, int sampleId, int status) {
                if (LoggerConfig.ON) {
                    Log.v(LoggerConfig.LOG_TAG, "sounds loaded");
                }
            }
        });


        characterSoundMap.put(CharacterNamesEnum.BUTTLEY,soundPool.load(this, R.raw.sound1, 1));
        characterSoundMap.put(CharacterNamesEnum.BABY, soundPool.load(this, R.raw.sound2, 1));
        characterSoundMap.put(CharacterNamesEnum.AIR_BISCUIT, soundPool.load(this, R.raw.sound3, 1));
        characterSoundMap.put(
                CharacterNamesEnum.SILENT_BUT_DEADLY, soundPool.load(this, R.raw.sound4,1));

//Todo find out if I need to reference audioManager in Assets
        Assets.loadSounds(audioManager, soundPool, characterSoundMap);

    }

    public void loadBitmaps(){

        //load widget bitmaps
        Assets.loadAsset(WidgetTypeEnum.BACKGROUND,
                BitmapFactory.decodeResource(getResources(),
                        R.drawable.background_9_16_bathroom));

        //load character bitmaps
        Assets.loadAsset(CharacterNamesEnum.BUTTLEY,
                BitmapFactory.decodeResource(getResources(),R.drawable.buttley_body_large));
        Assets.loadAsset(CharacterNamesEnum.BABY,
                BitmapFactory.decodeResource(getResources(), R.drawable.baby_walking_sheet) );

    }

    public void getScreenSize(){
        Display display = getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        sScreenWidth = size.x;
        sScreenHeight = size.y;
        if(LoggerConfig.ON){
            Log.v(LoggerConfig.LOG_TAG, "Screen size: Width: " + sScreenWidth
                    + " Height: " +sScreenHeight );
        }

    }



}
