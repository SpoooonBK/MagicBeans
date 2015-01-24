package buttley.nyc.esteban.magicbeans.model.boards;

import java.util.HashMap;
import java.util.Map;


/**
 * Created by Spoooon on 1/22/2015.
 */
public class BoardPool {


    private Map<BoardTypeEnum, Board> boardMap;

    public BoardPool() {
        boardMap = new HashMap<BoardTypeEnum, Board>();
    }

    public Map<BoardTypeEnum, Board> getBoardMap() {
        return boardMap;
    }

    public void addToPool(Board board){
        boardMap.put(board.getmBoardType(), board);
    }

    public Board getBoard(BoardTypeEnum boardType){

        return boardMap.get(boardType);
    }



}


