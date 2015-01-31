package buttley.nyc.esteban.magicbeans.controller;

import android.content.Context;
import android.util.Log;
import android.view.SurfaceView;

import buttley.nyc.esteban.magicbeans.gamelogic.GameLogic;
import buttley.nyc.esteban.magicbeans.gamelogic.Sequencer;
import buttley.nyc.esteban.magicbeans.logging.LoggerConfig;
import buttley.nyc.esteban.magicbeans.main.MainGamePanel;
import buttley.nyc.esteban.magicbeans.model.boards.Board;
import buttley.nyc.esteban.magicbeans.model.boards.BoardPool;
import buttley.nyc.esteban.magicbeans.model.boards.BoardTypeEnum;
import buttley.nyc.esteban.magicbeans.model.boards.soundboard.SoundPool;
import buttley.nyc.esteban.magicbeans.model.boards.widgets.WidgetPool;
import buttley.nyc.esteban.magicbeans.model.characters.CharacterLoader;
import buttley.nyc.esteban.magicbeans.model.characters.CharacterPool;

/**
 * Created by Spoooon on 1/19/2015.
 */
public class GameController {

    private Boolean mRunning = false;
    private SoundPool soundPool;
    private Sequencer sequencer;
    private GameLogic mGameLogic;
    private CharacterLoader mCharacterLoader;
    private CharacterPool mCharacterPool;
    private WidgetPool mWidgetPool;
    private BoardPool mBoardPool;



    public GameController (){
       mCharacterLoader = new CharacterLoader();
       mCharacterPool = mCharacterLoader.getCharacterPool();
       mWidgetPool = new WidgetPool();
       mBoardPool =  new BoardPool(mWidgetPool);
       mGameLogic = new GameLogic();

    }

    public Board loadBoard(BoardTypeEnum boardType) {
        return mBoardPool.getBoard(boardType);
    }
}
