package buttley.nyc.esteban.magicbeans.main;

import android.graphics.Bitmap;
import android.media.AudioManager;
import android.media.SoundPool;

import java.util.HashMap;
import java.util.Map;

import buttley.nyc.esteban.magicbeans.model.boards.widgets.WidgetTypeEnum;
import buttley.nyc.esteban.magicbeans.model.characters.CharacterNamesEnum;

/**
 * Created by Spoooon on 1/23/2015.
 */
public class Assets {

    public static Map<WidgetTypeEnum, Bitmap> sWidgetBitmaps;
    public static Map<CharacterNamesEnum, Bitmap> sCharacterBitmaps;
    public static Map<CharacterNamesEnum, Integer> sCharacterSounds;
    public static AudioManager sAudioManager;
    public static SoundPool sSoundPool;

    public Assets(){
        sWidgetBitmaps = new HashMap<WidgetTypeEnum, Bitmap>();
        sCharacterBitmaps = new HashMap<CharacterNamesEnum, Bitmap>();

    }

    public static void loadAsset(CharacterNamesEnum name, Bitmap bitmap){
        sCharacterBitmaps.put(name, bitmap);
    }

    public static void loadAsset(WidgetTypeEnum widgetType, Bitmap bitmap){
        sWidgetBitmaps.put(widgetType, bitmap);
    }

    public static Map<WidgetTypeEnum, Bitmap> getsWidgetBitmaps() {
        return sWidgetBitmaps;
    }

    public static void setsWidgetBitmaps(Map<WidgetTypeEnum, Bitmap> sWidgetBitmaps) {
        Assets.sWidgetBitmaps = sWidgetBitmaps;
    }

    public static Map<CharacterNamesEnum, Bitmap> getsCharacterBitmaps() {
        return sCharacterBitmaps;
    }

    public static void setsCharacterBitmaps(Map<CharacterNamesEnum, Bitmap> sCharacterBitmaps) {
        Assets.sCharacterBitmaps = sCharacterBitmaps;
    }

    public static Map<CharacterNamesEnum, Integer> getsCharacterSounds() {
        return sCharacterSounds;
    }

    public static void setsCharacterSounds(Map<CharacterNamesEnum, Integer> sCharacterSounds) {
        Assets.sCharacterSounds = sCharacterSounds;
    }

    public static AudioManager getsAudioManager() {
        return sAudioManager;
    }

    public static void setsAudioManager(AudioManager sAudioManager) {
        Assets.sAudioManager = sAudioManager;
    }

    public static SoundPool getsSoundPool() {
        return sSoundPool;
    }

    public static void setsSoundPool(SoundPool sSoundPool) {
        Assets.sSoundPool = sSoundPool;
    }

    public static void loadSounds(AudioManager audioManager, SoundPool soundPool, Map<CharacterNamesEnum, Integer> characterSoundMap){
            setsAudioManager(audioManager);
            setsSoundPool(soundPool);
            setsCharacterSounds(characterSoundMap);
    }
}