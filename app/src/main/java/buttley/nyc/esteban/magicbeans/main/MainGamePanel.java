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
import buttley.nyc.esteban.magicbeans.model.boards.TitleBoard;
import buttley.nyc.esteban.magicbeans.model.boards.widgets.BackgroundWidget;
import buttley.nyc.esteban.magicbeans.model.characters.Buttley;

/**
 * Created by Spoooon on 1/23/2015.
 */
public class MainGamePanel extends SurfaceView implements SurfaceHolder.Callback {

    private MainThread thread;
    private Context context;
    private GestureDetector gestureDetector;
    private GameController mGameController;
    private Board mCurrentBoard;


    public MainGamePanel(Context context) {
        super(context);
        getHolder().addCallback(this);
        setFocusable(true);
        ContextHolder contextHolder = new ContextHolder(context);
        setOnTouchListener(new OnSwipeTouchListener(context) {
            @Override
            public void onSwipeDown() {
                if (LoggerConfig.ON) {

                }
                int fart1 = Assets.getsSoundMap().get(SoundNames.FART_1);
                Assets.sSoundPool.play(fart1,1,1,1,0,1);
            }

            @Override
            public void onSwipeLeft() {
                if (LoggerConfig.ON) {
                    Log.v(LoggerConfig.LOG_TAG, "swipe left");

                }
                int fart2 = Assets.getsSoundMap().get(SoundNames.FART_2);
                Assets.sSoundPool.play(fart2,1,1,1,0,1);
            }

            @Override
            public void onSwipeUp() {
                if (LoggerConfig.ON) {
                    Log.v(LoggerConfig.LOG_TAG, "swipe up");

                }
                int fart3 = Assets.getsSoundMap().get(SoundNames.FART_3);
                Assets.sSoundPool.play(fart3,1,1,1,0,1);
            }

            @Override
            public void onSwipeRight() {
                if (LoggerConfig.ON) {

                }
                int fart4 = Assets.getsSoundMap().get(SoundNames.FART_4);
                Assets.sSoundPool.play(fart4,1,1,1,0,1);
            }
        });
    }



    @Override
    public boolean onTouchEvent(MotionEvent event) {


        float xCoordinate = event.getX();
        float yCoordinate = event.getY();

        int action = event.getAction();
            switch (action){
                case MotionEvent.ACTION_DOWN: {
                    break;
                    }
                }

            if(LoggerConfig.ON){
                Log.v(LoggerConfig.LOG_TAG, "Touched: X: " + xCoordinate +"Y: " + yCoordinate);
             }

        return super.onTouchEvent(event);
    }

    public void setCurrentBoard(Board board){

    }

    @Override
    public void surfaceCreated(SurfaceHolder holder) {
        mGameController = new GameController(this);

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
        mCurrentBoard.draw(canvas);
    }



}
