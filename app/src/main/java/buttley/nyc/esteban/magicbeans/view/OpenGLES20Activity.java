package buttley.nyc.esteban.magicbeans.view;

import android.app.Activity;
import android.opengl.GLSurfaceView;
import android.os.Bundle;

/**
 * Created by Spoooon on 1/18/2015.
 */
public class OpenGLES20Activity extends Activity {

    private GLSurfaceView mGLSurfaceView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mGLSurfaceView = new GameGLSurfaceView(this);
        setContentView(mGLSurfaceView);
    }
}
