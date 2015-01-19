package buttley.nyc.esteban.magicbeans.model.boards.gamelevels.widgets;

/**
 * Created by Spoooon on 1/18/2015.
 */
public class PoopMeter extends LevelWidget{

    private final int mMAX_LEVEL = 100;
    private final int mMIN_LEVEL = 0;
    private int mStartingPoopLevel;
    private int mCurrentPoopLevel;

    public int getmStartingPoopLevel() {
        return mStartingPoopLevel;
    }

    public void setmStartingPoopLevel(int mStartingPoopLevel) {
        this.mStartingPoopLevel = mStartingPoopLevel;
    }

    public int getmCurrentPoopLevel() {
        return mCurrentPoopLevel;
    }

    public void setmCurrentPoopLevel(int mCurrentPoopLevel) {
        this.mCurrentPoopLevel = mCurrentPoopLevel;
    }

    @Override
    public void draw() {

    }
}
