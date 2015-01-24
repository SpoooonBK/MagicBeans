package buttley.nyc.esteban.magicbeans.model.characters;

import android.graphics.Bitmap;
import android.graphics.Canvas;

import buttley.nyc.esteban.magicbeans.main.Assets;

/**
 * Created by Spoooon on 1/18/2015.
 */
public class Buttley extends GameCharacter {

    Bitmap buttleypic;

    public Buttley(){
        setmSnapshot(Assets.characterBitmaps.get(CharacterNamesEnum.BUTTLEY));

    }


    @Override
    public void draw(Canvas canvas) {
        canvas.drawBitmap(getmSnapshot(),100,400,null);
    }

    @Override
    public void animate() {

    }

    @Override
    public void playSound() {

    }
}
