package buttley.nyc.esteban.magicbeans.model.boards;

import java.util.EnumMap;
import java.util.Map;

import buttley.nyc.esteban.magicbeans.model.boards.beanography.Beanography;
import buttley.nyc.esteban.magicbeans.model.boards.gamelevels.GameLevel;
import buttley.nyc.esteban.magicbeans.model.boards.soundboard.SoundBoard;
import buttley.nyc.esteban.magicbeans.model.boards.widgets.WidgetPool;


/**
 * Created by Spoooon on 1/22/2015.
 */
public class BoardPool {


    private Map<BoardTypeEnum, Board> mBoardMap;
    private WidgetPool mWidgetPool;

    public BoardPool(WidgetPool widgetPool) {

        mBoardMap = new EnumMap<BoardTypeEnum, Board>(BoardTypeEnum.class);
        mWidgetPool = widgetPool;
    }

    public Map<BoardTypeEnum, Board> getBoardMap() {
        return mBoardMap;
    }

    public void addBoard(Board board){
        mBoardMap.put(board.getmBoardType(), board);
    }

    public Board getBoard(BoardTypeEnum boardType){
        return mBoardMap.get(boardType);
    }

    private void loadAllBoards(){
        mBoardMap.put(BoardTypeEnum.GAME_LEVEL, new GameLevel(mWidgetPool));
        mBoardMap.put(BoardTypeEnum.TITLE, new TitleBoard(mWidgetPool));
        mBoardMap.put(BoardTypeEnum.BEANOGRAPHY, new Beanography(mWidgetPool));
        mBoardMap.put(BoardTypeEnum.SOUNDBOARD, new SoundBoard(mWidgetPool));
        mBoardMap.put(BoardTypeEnum.TRANSITION, new TransitionBoard(mWidgetPool));

    }





}


