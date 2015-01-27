package buttley.nyc.esteban.magicbeans.controller;

import android.content.Context;
import android.view.SurfaceView;

import buttley.nyc.esteban.magicbeans.gamelogic.GameLogic;
import buttley.nyc.esteban.magicbeans.gamelogic.Sequencer;
import buttley.nyc.esteban.magicbeans.main.MainGamePanel;
import buttley.nyc.esteban.magicbeans.model.boards.Board;
import buttley.nyc.esteban.magicbeans.model.boards.BoardLoader;
import buttley.nyc.esteban.magicbeans.model.boards.BoardPool;
import buttley.nyc.esteban.magicbeans.model.boards.BoardTypeEnum;
import buttley.nyc.esteban.magicbeans.model.boards.soundboard.SoundPool;
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
    private BoardLoader mBoardLoader;
    private CharacterPool mCharacterPool;
    private Board board;


    public GameController (){
       mCharacterLoader = new CharacterLoader();
       mCharacterPool = mCharacterLoader.getCharacterPool();
       mBoardLoader = new BoardLoader();
       mGameLogic = new GameLogic();

    }

    public Board runGame(){

        if(mRunning = false) {
           board= mBoardLoader.loadBoard(BoardTypeEnum.TITLE);
            mRunning = true;
        }
        return board;
    }

    public void changeBoard(BoardTypeEnum boardType){

        board = mBoardLoader.loadBoard(boardType);

    }


}
