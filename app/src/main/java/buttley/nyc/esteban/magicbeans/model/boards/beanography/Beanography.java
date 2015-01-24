package buttley.nyc.esteban.magicbeans.model.boards.beanography;


import java.util.List;

import buttley.nyc.esteban.magicbeans.model.boards.Board;
import buttley.nyc.esteban.magicbeans.model.boards.BoardTypeEnum;
import buttley.nyc.esteban.magicbeans.model.boards.widgets.BoardWidget;

/**
 * Created by Tara on 1/2/2015.
 */
public class Beanography extends Board{

        List<BeanographyPost> beanographyPostList;

    public Beanography(BoardTypeEnum boardType, List<BoardWidget> widgetList) {
        super(boardType, widgetList);
    }


}
