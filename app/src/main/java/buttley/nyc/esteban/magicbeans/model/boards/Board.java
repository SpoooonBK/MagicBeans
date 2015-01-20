package buttley.nyc.esteban.magicbeans.model.boards;

import java.util.List;

import buttley.nyc.esteban.magicbeans.model.boards.widgets.BoardWidget;

/**
 * Created by Spoooon on 1/18/2015.
 */
public abstract class Board {

    List<BoardWidget> widgetList;



    public abstract void populateBoard();
    public abstract void draw();
}


