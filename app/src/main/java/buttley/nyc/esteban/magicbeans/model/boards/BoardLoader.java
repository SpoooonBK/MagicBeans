package buttley.nyc.esteban.magicbeans.model.boards;

/**
 * This class loads all Boards into the BoardPool.  It is also used to set the current board to be
 * displayed.
 */
public class BoardLoader {

    private BoardPool boardPool;

    private Board lastBoard;
    private Board currentBoard;


    public BoardLoader(){
        boardPool = new BoardPool();
        loadAllBoards();
    }

    public Board getLastBoard() {
        return lastBoard;
    }

    public void setLastBoard() {
        lastBoard = getCurrentBoard();
    }

    public Board getCurrentBoard() {
        return currentBoard;
    }

    public void setCurrentBoard(Board board) {
        currentBoard = board;
    }

    public BoardPool getBoardPool() {
        return boardPool;
    }

    private void loadAllBoards(){

        for(BoardTypeEnum boardType: BoardTypeEnum.values()) {
            boardPool.addToPool(BoardFactory.buildBoard(boardType));
        }
    }

    public Board loadBoard(BoardTypeEnum boardType) {

        if (currentBoard != null) {
            setCurrentBoard(boardPool.getBoard(boardType));
        } else {
            setLastBoard();
            setCurrentBoard(boardPool.getBoard(boardType));
        }

        return getCurrentBoard();
    }




}
