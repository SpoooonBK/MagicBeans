package buttley.nyc.esteban.magicbeans.model.boards.widgets.stages;

import android.graphics.Bitmap;
import android.graphics.Canvas;

import buttley.nyc.esteban.magicbeans.main.ScreenSizer;
import buttley.nyc.esteban.magicbeans.model.boards.widgets.BoardWidget;
import buttley.nyc.esteban.magicbeans.model.characters.Buttley;
import buttley.nyc.esteban.magicbeans.model.characters.GameCharacter;

/**
 * Created by Spoooon on 1/22/2015.
 */
public class ButtleyStageWidget extends BoardWidget implements CharacterStage {

    Buttley buttley;

    public ButtleyStageWidget(){
       buttley = new Buttley();
       placeWidget(buttley.getmSnapshot());
    }


    @Override
    public void placeWidget(Bitmap bitmap) {
        int buttleyHeight = bitmap.getHeight();
        int buttleyWidth = bitmap.getWidth();

        mYCoordinate = ScreenSizer.getsScreenHeight() - buttleyHeight;
        mXCoordinate = (int)ScreenSizer.sScreenWidth/5;
        buttley.setmStartingXcoordinate(mXCoordinate);
        buttley.setmStartingYcoordinate(mYCoordinate);
    }

    @Override
    public void draw(Canvas canvas) {
        buttley.draw(canvas);

    }

    @Override
    public void enterStage(GameCharacter character) {

    }

    @Override
    public void exitStageRight(GameCharacter character) {

    }

    @Override
    public void exitStageLeft(GameCharacter character) {

    }
}
