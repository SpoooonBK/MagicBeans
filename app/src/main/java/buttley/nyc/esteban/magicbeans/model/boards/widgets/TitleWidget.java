package buttley.nyc.esteban.magicbeans.model.boards.widgets;

import android.graphics.Bitmap;
import android.graphics.Canvas;

import buttley.nyc.esteban.magicbeans.main.Assets;

/**
 * Created by Tara on 1/27/2015.
 */
public class TitleWidget extends BoardWidget {

    public TitleWidget (){

    }

    @Override
    public void setmBitmaps() {
       mBitmaps = Assets.getsWidgetBitmaps().get(WidgetTypeEnum.TITLE);
    }

    @Override
    public void placeWidget() {
        Bitmap widgetBitmap = mBitmaps.get(0);

    }

    @Override
    public void draw(Canvas canvas) {
        for(Bitmap bitmap: mBitmaps){
            canvas.drawBitmap(bitmap,mXCoordinate, mYCoordinate, null);
        }

    }
}
