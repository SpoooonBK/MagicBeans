package buttley.nyc.esteban.magicbeans.view;

import android.content.Context;
import android.opengl.GLSurfaceView;

/**
 * Created by Spoooon on 1/18/2015.
 */
public class GameGLSurfaceView extends GLSurfaceView {

    public GameGLSurfaceView(Context context) {
        super(context);

        setRenderer(new MyRenderer());
    }

}
