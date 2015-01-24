package buttley.nyc.esteban.magicbeans.model.boards;

import java.util.ArrayList;
import java.util.List;

import buttley.nyc.esteban.magicbeans.model.boards.gamelevels.GameLevel;
import buttley.nyc.esteban.magicbeans.model.boards.widgets.BackgroundWidget;
import buttley.nyc.esteban.magicbeans.model.boards.widgets.BoardWidget;
import buttley.nyc.esteban.magicbeans.model.boards.widgets.PoopMeterWidget;
import buttley.nyc.esteban.magicbeans.model.boards.widgets.stages.BeanStageWidget;
import buttley.nyc.esteban.magicbeans.model.boards.widgets.stages.ButtleyStageWidget;
import buttley.nyc.esteban.magicbeans.model.boards.widgets.stages.PatientStageWidget;

/**
 * Created by Spoooon on 1/19/2015.
 */
public class BoardFactory {





    public static Board buildBoard(BoardTypeEnum boardType) {
        Board board = null;
        List<BoardWidget> boardWidgetList = new ArrayList<BoardWidget>();

        switch (boardType){
            case GAME_LEVEL:{
                boardWidgetList.add(new BackgroundWidget());
                boardWidgetList.add(new PoopMeterWidget());
                boardWidgetList.add(new BeanStageWidget());
                boardWidgetList.add(new ButtleyStageWidget());
                boardWidgetList.add(new PatientStageWidget());

                board = new GameLevel(boardType, boardWidgetList);
                break;
            }

            case BEANOGRAPHY:{
                break;
            }

            case SOUNDBOARD: {
                break;
            }

        }


        return board;
    }

}
