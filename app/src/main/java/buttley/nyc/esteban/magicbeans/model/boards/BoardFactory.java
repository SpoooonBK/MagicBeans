package buttley.nyc.esteban.magicbeans.model.boards;

import buttley.nyc.esteban.magicbeans.model.boards.beanography.Beanography;
import buttley.nyc.esteban.magicbeans.model.boards.gamelevels.GameLevel;
import buttley.nyc.esteban.magicbeans.model.boards.soundboard.SoundBoard;

/**
 * Created by Spoooon on 1/19/2015.
 */
public class BoardFactory {

    public static Board buildBoard(BoardTypeEnum boardType) {
        Board board = null;

        switch (boardType){
            case TITLE:{
                board = new TitleBoard();
            }

            case GAME_LEVEL:{
                board = new GameLevel();
                break;
            }

            case BEANOGRAPHY:{
                board = new Beanography();
                break;
            }

            case SOUNDBOARD: {
                board = new SoundBoard();
                break;
            }

            case TRANSITION: {
                board = new TransitionBoard();
                break;
            }

        }


        return board;
    }

}
