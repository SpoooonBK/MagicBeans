package buttley.nyc.esteban.magicbeans.model.boards.widgets;

import android.graphics.Canvas;

/**
 * Created by Spoooon on 1/18/2015.
 */
public abstract class BoardWidget {

    protected BoardWidget() {
    }

    public abstract void draw(Canvas canvas);
}
