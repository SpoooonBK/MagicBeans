package buttley.nyc.esteban.magicbeans.model.boards.gamelevels;

import android.graphics.drawable.BitmapDrawable;

import java.util.List;

import buttley.nyc.esteban.magicbeans.model.boards.Board;
import buttley.nyc.esteban.magicbeans.model.characters.NamesEnum;
import buttley.nyc.esteban.magicbeans.model.boards.gamelevels.widgets.LevelWidget;

/**
 * Created by Spoooon on 1/18/2015.
 */
public class GameLevel extends Board {

    private int mLevelNumber;
    private NamesEnum patient;
    private BitmapDrawable background;
    private LevelType levelType;
    private List<LevelWidget> widgets;


//TODO implement draw method
    public void draw(){

    }
}
