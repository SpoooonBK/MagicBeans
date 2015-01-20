package buttley.nyc.esteban.magicbeans.controller;

import buttley.nyc.esteban.magicbeans.model.boards.Board;
import buttley.nyc.esteban.magicbeans.model.boards.BoardTypeEnum;

/**
 * Created by Spoooon on 1/19/2015.
 */
public class BoardLoader {

    Board lastBoard = null;
    Board currentBoard = null;
    Board nextBoard = null;

    public Board loadBoard(BoardTypeEnum boardType){

        return nextBoard;
    }

    private void setLastBoard(){
        lastBoard = currentBoard;
    }







}
