package buttley.nyc.esteban.magicbeans.main;

import android.app.Activity;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;

import buttley.nyc.esteban.magicbeans.R;
import buttley.nyc.esteban.magicbeans.logging.LoggerConfig;
import buttley.nyc.esteban.magicbeans.model.boards.widgets.WidgetTypeEnum;
import buttley.nyc.esteban.magicbeans.model.characters.CharacterNamesEnum;

public class MainActivity extends Activity {

    private Assets assets = new Assets();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(new buttley.nyc.esteban.magicbeans.main.MainGamePanel(this));
        loadAllAssets();

        if(LoggerConfig.ON) {
            Log.d(LoggerConfig.LOG_TAG, "View added");
        }
    }

    public void loadAllAssets(){

        //load widget bitmaps
        Assets.loadAsset(WidgetTypeEnum.BACKGROUND,
                BitmapFactory.decodeResource(getResources(),
                        R.drawable.background_9_16_bathroom));

        //load character bitmaps
        Assets.loadAsset(CharacterNamesEnum.BUTTLEY,
                BitmapFactory.decodeResource(getResources(),R.drawable.buttley_body_large));
        if(LoggerConfig.ON){
            Log.v(LoggerConfig.LOG_TAG, "assets loaded");
        }

    }




}
