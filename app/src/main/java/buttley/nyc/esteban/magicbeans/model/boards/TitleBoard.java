package buttley.nyc.esteban.magicbeans.model.boards;

import buttley.nyc.esteban.magicbeans.model.boards.widgets.BackgroundWidget;
import buttley.nyc.esteban.magicbeans.model.boards.widgets.TitleWidget;
import buttley.nyc.esteban.magicbeans.model.boards.widgets.stages.ButtleyStageWidget;

/**
 * Created by Spoooon on 1/19/2015.
 */
public class TitleBoard extends Board {

    public TitleBoard (){
        mBoardType = BoardTypeEnum.TITLE;
        mWidgetList.add(new BackgroundWidget());
        mWidgetList.add(new TitleWidget());
        mWidgetList.add(new ButtleyStageWidget());
    }



}
