package buttley.nyc.esteban.magicbeans.model.boards.soundboard;

import java.util.List;

import buttley.nyc.esteban.magicbeans.model.boards.Board;
import buttley.nyc.esteban.magicbeans.model.boards.BoardTypeEnum;
import buttley.nyc.esteban.magicbeans.model.boards.widgets.BoardWidget;

/**
 * Created by Spoooon on 1/19/2015.
 */
public class SoundBoard extends Board {

    public SoundBoard(BoardTypeEnum boardType, List<BoardWidget> widgetList) {
        super(boardType, widgetList);
    }


}
