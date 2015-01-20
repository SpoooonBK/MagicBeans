package buttley.nyc.esteban.magicbeans.model.boards.gamelevels;

import android.graphics.drawable.BitmapDrawable;

import java.util.List;

import buttley.nyc.esteban.magicbeans.model.boards.Board;
import buttley.nyc.esteban.magicbeans.model.boards.BoardTypeEnum;
import buttley.nyc.esteban.magicbeans.model.boards.widgets.BoardWidget;
import buttley.nyc.esteban.magicbeans.model.characters.NamesEnum;

/**
 * Created by Spoooon on 1/18/2015.
 */
public class GameLevel extends Board {

    private int mLevelNumber;
    private NamesEnum patient;
    private BitmapDrawable background;
    private BoardTypeEnum boardTypeEnum;
    private List<BoardWidget> widgets;


    @Override
    public void populateBoard() {

    }

    //TODO implement draw method
    public void draw(){

    }
}
