package buttley.nyc.esteban.magicbeans.model.boards;

import java.util.List;

import buttley.nyc.esteban.magicbeans.model.boards.widgets.BoardWidget;

/**
 * Created by Spoooon on 1/18/2015.
 */
public abstract class Board {


    public BoardTypeEnum getmBoardTypeEnum() {
        return mBoardTypeEnum;
    }

    public void setmBoardTypeEnum(BoardTypeEnum mBoardTypeEnum) {
        this.mBoardTypeEnum = mBoardTypeEnum;
    }

    public List<BoardWidget> getmWidgetList() {
        return mWidgetList;
    }

    public void setmWidgetList(List<BoardWidget> mWidgetList) {
        this.mWidgetList = mWidgetList;
    }

    private BoardTypeEnum mBoardTypeEnum;
    private List<BoardWidget> mWidgetList;



    public abstract void populateBoard();
    public abstract void draw();
}


