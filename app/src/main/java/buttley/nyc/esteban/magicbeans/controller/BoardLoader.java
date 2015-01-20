package buttley.nyc.esteban.magicbeans.controller;

import buttley.nyc.esteban.magicbeans.model.boards.Board;
import buttley.nyc.esteban.magicbeans.model.boards.BoardFactory;
import buttley.nyc.esteban.magicbeans.model.boards.BoardTypeEnum;

/**
 * Created by Spoooon on 1/19/2015.
 */
public class BoardLoader {

    public Board lastBoard = null;
    public Board currentBoard = null;

    public Board loadBoard(BoardTypeEnum boardType){

        if(currentBoard !=null){
            setCurrentBoardToLast();
        }
        currentBoard = BoardFactory.createBoard(boardType);
        return currentBoard;
    }

    private void setCurrentBoardToLast(){
        lastBoard = currentBoard;
    }







}
