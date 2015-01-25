package buttley.nyc.esteban.magicbeans.main;

/**
 * Created by Spoooon on 1/24/2015.
 */
public class ScreenSizer {

    public static int sWidth;
    public static int sHeight;



    ScreenSizer(int width, int height){
        setsWidth(width);
       setsHeight(height);
        setAspectRatio();

    }


    public static int getsWidth() {
        return sWidth;
    }

    public static void setsWidth(int sWidth) {
        ScreenSizer.sWidth = sWidth;
    }

    public static int getsHeight() {
        return sHeight;
    }

    public static void setsHeight(int sHeight) {
        ScreenSizer.sHeight = sHeight;
    }

    private void setAspectRatio() {
    }

}
