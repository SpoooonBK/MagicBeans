package buttley.nyc.esteban.magicbeans.model.boards;

import android.graphics.Canvas;

import java.util.List;

import buttley.nyc.esteban.magicbeans.model.boards.widgets.BoardWidget;

/**
 * Created by Spoooon on 1/18/2015.
 */
public abstract class Board {

    private BoardTypeEnum mBoardType;
    private List<BoardWidget> mWidgetList;


    public Board(BoardTypeEnum boardType, List<BoardWidget> widgetList ){
        mBoardType = boardType;
        mWidgetList = widgetList;
    }

    public BoardTypeEnum getmBoardType() {
        return mBoardType;
    }

    public void setmBoardType(BoardTypeEnum mBoardType) {
        this.mBoardType = mBoardType;
    }

    public List<BoardWidget> getmWidgetList() {
        return mWidgetList;
    }

    public void setmWidgetList(List<BoardWidget> mWidgetList) {
        this.mWidgetList = mWidgetList;
    }

    public void draw(Canvas canvas){
        for(BoardWidget widget: mWidgetList){
            widget.draw(canvas);
        }
    }
}


