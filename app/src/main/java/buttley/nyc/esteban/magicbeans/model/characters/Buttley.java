package buttley.nyc.esteban.magicbeans.model.characters;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.util.Log;

import buttley.nyc.esteban.magicbeans.logging.LoggerConfig;
import buttley.nyc.esteban.magicbeans.main.Assets;

/**
 * Created by Spoooon on 1/18/2015.
 */
public class Buttley extends GameCharacter {

    Bitmap buttleypic;
    int characterSound;

    public Buttley(){
        setmSnapshot(Assets.sCharacterBitmaps.get(CharacterNamesEnum.BUTTLEY));
        characterSound = Assets.getsCharacterSounds().get(CharacterNamesEnum.BUTTLEY);

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
        Assets.sSoundPool.play(characterSound,1,1,1,0,1);
        if(LoggerConfig.ON){
            Log.v(LoggerConfig.LOG_TAG, "buttley sound played");
        }
    }
}
