package buttley.nyc.esteban.magicbeans.model.boards.widgets;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;

import java.util.Map;

import buttley.nyc.esteban.magicbeans.R;
import buttley.nyc.esteban.magicbeans.main.Assets;
import buttley.nyc.esteban.magicbeans.main.ContextHolder;



/**
 * Created by Spoooon on 1/22/2015.
 */
public class BackgroundWidget extends BoardWidget {
    private final String bathroomHiRes =
            "/widgets/backgrounds/hi-res-9-16/background_bathroom.png";

    Map<BackgroundNames, Bitmap> mBackgroundMap;
    Bitmap background;

    public BackgroundWidget(){
        loadBitmaps();
    }

    @Override
    public void setmBitmaps() {
            mBitmaps = Assets.getsWidgetBitmaps().get(WidgetTypeEnum.BACKGROUND);
    }

    @Override
    public void placeWidget() {

    }


    public void loadBitmaps(){

//        try {
//            InputStream inputStream = Assets.sAssetManager.open(bathroomHiRes);
//            background = BitmapFactory.decodeStream(inputStream);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        background = BitmapFactory.decodeResource(ContextHolder.sContext.getResources(),R.drawable.background_9_16_bathroom);
//        mBackgroundMap.put(BackgroundNames.BATHROOM, background);

    }

    @Override
    public void draw(Canvas canvas) {
        canvas.drawBitmap(background,0,0,null);
    }

    public enum BackgroundNames {
        BATHROOM
    }
}
