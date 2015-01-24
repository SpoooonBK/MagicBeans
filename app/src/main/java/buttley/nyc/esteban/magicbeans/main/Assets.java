package buttley.nyc.esteban.magicbeans.main;

import android.graphics.Bitmap;

import java.util.HashMap;
import java.util.Map;

import buttley.nyc.esteban.magicbeans.model.boards.widgets.WidgetTypeEnum;
import buttley.nyc.esteban.magicbeans.model.characters.CharacterNamesEnum;

/**
 * Created by Spoooon on 1/23/2015.
 */
public class Assets {

    public static Map<WidgetTypeEnum, Bitmap> widgetBitmaps;
    public static Map<CharacterNamesEnum, Bitmap> characterBitmaps;

    public Assets(){
        widgetBitmaps = new HashMap<WidgetTypeEnum, Bitmap>();
        characterBitmaps = new HashMap<CharacterNamesEnum, Bitmap>();

    }

    public static void loadAsset(CharacterNamesEnum name, Bitmap bitmap){
        characterBitmaps.put(name, bitmap);
    }

    public static void loadAsset(WidgetTypeEnum widgetType, Bitmap bitmap){
        widgetBitmaps.put(widgetType, bitmap);
    }

    public static Map<WidgetTypeEnum, Bitmap> getWidgetBitmaps() {
        return widgetBitmaps;
    }

    public static void setWidgetBitmaps(Map<WidgetTypeEnum, Bitmap> widgetBitmaps) {
        Assets.widgetBitmaps = widgetBitmaps;
    }

    public static Map<CharacterNamesEnum, Bitmap> getCharacterBitmaps() {
        return characterBitmaps;
    }

    public static void setCharacterBitmaps(Map<CharacterNamesEnum, Bitmap> characterBitmaps) {
        Assets.characterBitmaps = characterBitmaps;
    }
}
