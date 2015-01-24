package buttley.nyc.esteban.magicbeans.main;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;

import buttley.nyc.esteban.magicbeans.R;
import buttley.nyc.esteban.magicbeans.logging.LoggerConfig;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(new buttley.nyc.esteban.magicbeans.main.MainGamePanel(this));
        if(LoggerConfig.ON) {
            Log.d(LoggerConfig.LOG_TAG, "View added");
        }
    }


}
