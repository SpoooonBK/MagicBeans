package buttley.nyc.esteban.magicbeans.main;

/**
 * Created by Spoooon on 1/24/2015.
 */
public class ScreenSizer {

    public static int sScreenWidth;
    public static int sScreenHeight;



    ScreenSizer(int width, int height){
        setsWidth(width);
       setsScreenHeight(height);
        setAspectRatio();

    }


    public static int getsWidth() {
        return sScreenWidth;
    }

    public static void setsWidth(int sWidth) {
        ScreenSizer.sScreenWidth = sWidth;
    }

    public static int getsScreenHeight() {
        return sScreenHeight;
    }

    public static void setsScreenHeight(int sScreenHeight) {
        ScreenSizer.sScreenHeight = sScreenHeight;
    }

    private void setAspectRatio() {
    }

    public enum AspectRatio{}

}
