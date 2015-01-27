package buttley.nyc.esteban.magicbeans.main;

import android.content.Context;
import android.graphics.Canvas;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

import buttley.nyc.esteban.magicbeans.controller.GameController;
import buttley.nyc.esteban.magicbeans.logging.LoggerConfig;
import buttley.nyc.esteban.magicbeans.model.boards.Board;
import buttley.nyc.esteban.magicbeans.model.boards.widgets.BackgroundWidget;
import buttley.nyc.esteban.magicbeans.model.characters.Buttley;
import buttley.nyc.esteban.magicbeans.model.characters.CharacterNamesEnum;

/**
 * Created by Spoooon on 1/23/2015.
 */
public class MainGamePanel extends SurfaceView implements SurfaceHolder.Callback {

    private MainThread thread;
    private Context context;
    private GestureDetector gestureDetector;
    private GameController mGameController;
    private BackgroundWidget background;
    private Buttley buttley;
    private Board mBoard;


    public MainGamePanel(Context context) {
        super(context);
        getHolder().addCallback(this);
        setFocusable(true);
        ContextHolder contextHolder = new ContextHolder(context);
        setOnTouchListener(new OnSwipeTouchListener(context) {
            @Override
            public void onSwipeDown() {
                if (LoggerConfig.ON) {
                    Log.v(LoggerConfig.LOG_TAG, "swipe down");
                    buttley.playSound();
                }
            }

            @Override
            public void onSwipeLeft() {
                if (LoggerConfig.ON) {
                    Log.v(LoggerConfig.LOG_TAG, "swipe left");
                    int babysound = Assets.getsCharacterSounds().get(CharacterNamesEnum.BABY);
                    Assets.sSoundPool.play(babysound,1,1,1,0,1);
                }
            }

            @Override
            public void onSwipeUp() {
                if (LoggerConfig.ON) {
                    Log.v(LoggerConfig.LOG_TAG, "swipe up");
                    buttley.playSound();
                }
            }

            @Override
            public void onSwipeRight() {
                if (LoggerConfig.ON) {
                    Log.v(LoggerConfig.LOG_TAG, "swipe right");
                    buttley.playSound();
                }
            }
        });

        mGameController = new GameController();
        mBoard = mGameController.runGame();
    }



    @Override
    public boolean onTouchEvent(MotionEvent event) {


        float xCoordinate = event.getX();
        float yCoordinate = event.getY();

        int action = event.getAction();
            switch (action){
                case MotionEvent.ACTION_DOWN: {
                    buttley.playSound();
                    break;
                    }
                }

            if(LoggerConfig.ON){
                Log.v(LoggerConfig.LOG_TAG, "Touched: X: " + xCoordinate +"Y: " + yCoordinate);
             }

        return super.onTouchEvent(event);
    }

    @Override
    public void surfaceCreated(SurfaceHolder holder) {
        background = new BackgroundWidget();
        buttley = new Buttley();
        thread = new MainThread(getHolder(),this);
        thread.setRunning(true);
        thread.start();



    }

    @Override
    public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {

    }

    @Override
    public void surfaceDestroyed(SurfaceHolder holder) {

    }

    public void update() {
    }

    public void render(Canvas canvas) {
        mBoard.draw(canvas);


    }

}
