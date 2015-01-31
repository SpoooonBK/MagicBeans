package buttley.nyc.esteban.magicbeans.model.boards;

import android.graphics.Canvas;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import buttley.nyc.esteban.magicbeans.model.boards.widgets.BoardWidget;
import buttley.nyc.esteban.magicbeans.model.boards.widgets.WidgetPool;
import buttley.nyc.esteban.magicbeans.model.boards.widgets.WidgetTypeEnum;

/**
 * Created by Spoooon on 1/18/2015.
 */
public abstract class Board {

    protected BoardTypeEnum mBoardType;

    public Board(WidgetPool widgetPool){
    }

    public BoardTypeEnum getmBoardType() {
        return mBoardType;
    }

    public void setmBoardType(BoardTypeEnum mBoardType) {
        this.mBoardType = mBoardType;
    }

    public abstract void draw(Canvas canvas);

}


