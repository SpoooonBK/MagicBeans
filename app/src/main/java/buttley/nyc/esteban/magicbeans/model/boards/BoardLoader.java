package buttley.nyc.esteban.magicbeans.model.boards;

/**
 * Created by Spoooon on 1/19/2015.
 */
public class BoardLoader {

    public static BoardLoader boardLoader;
    private static BoardPool sBoardPool;

    private BoardLoader(){
        sBoardPool = new BoardPool();
        loadBoards();
    }

    private static BoardPool getBoardPool() {
        if(boardLoader == null){
            boardLoader = new BoardLoader();
        }
        return sBoardPool;
    }

    public void loadBoards(){

        for(BoardTypeEnum boardType: BoardTypeEnum.values()) {
            sBoardPool.addToPool(BoardFactory.buildBoard(boardType));
        }
    }



}
