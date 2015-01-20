package buttley.nyc.esteban.magicbeans.view.opengl;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ConfigurationInfo;
import android.opengl.GLSurfaceView;
import android.os.Build;
import android.os.Bundle;
import android.widget.Toast;

/**
 * Created by Spoooon on 1/18/2015.
 */
public class OpenGLES20Activity extends Activity {

    private GLSurfaceView mGLSurfaceView;
    private boolean renderset = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mGLSurfaceView = new GLSurfaceView(this);

        final ActivityManager activityManager =
                (ActivityManager) getSystemService(Context.ACTIVITY_SERVICE);
        final ConfigurationInfo configurationInfo =
                activityManager.getDeviceConfigurationInfo();
        final boolean supportsEs2 = configurationInfo.reqGlEsVersion >= 0x20000
                || (Build.VERSION.SDK_INT >=
                Build.VERSION_CODES.ICE_CREAM_SANDWICH_MR1
                && (Build.FINGERPRINT.startsWith("unknown")
                || Build.MODEL.contains("google_sdk")
                || Build.MODEL.contains("Emulator")
                || Build.MODEL.contains("Android SDK built for x86")
        ));


        if(supportsEs2) {
            mGLSurfaceView.setEGLContextClientVersion(2);
            mGLSurfaceView.setRenderer(new MyOpenGLRenderer(this));
            renderset = true;
        } else {
            Toast.makeText(this,"This device does not support OpenGL ES 2.0",
                    Toast.LENGTH_LONG).show();
            return;
        }
        setContentView(mGLSurfaceView);
    }



    @Override
    protected void onResume() {
        super.onResume();

        if(renderset) {
            mGLSurfaceView.onResume();
        }
    }

    @Override
    protected void onPause() {
        super.onPause();

        if(renderset) {
            mGLSurfaceView.onPause();
        }
    }
}
