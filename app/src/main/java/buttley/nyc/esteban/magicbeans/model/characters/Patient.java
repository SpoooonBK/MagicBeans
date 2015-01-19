package buttley.nyc.esteban.magicbeans.model.characters;

import android.graphics.Bitmap;
import android.graphics.drawable.AnimationDrawable;

import java.util.List;

import buttley.nyc.esteban.magicbeans.model.boards.gamelevels.widgets.PoopMeter;
import buttley.nyc.esteban.magicbeans.model.sounds.Sound;

/**
 * Created by Spoooon on 1/18/2015.
 */
public class Patient extends GameCharacter {

    private int startingPoopLevel;

    public Patient(int startingPoopLevel) {
        this.startingPoopLevel = startingPoopLevel;
    }

    public Patient(Bitmap mSnapshot, List<AnimationDrawable> mAnimationsList,
                   List<Sound> mSoundsList, boolean mUnlocked, CharacterType mCharacterType,
                   NamesEnum mCharacterName, int startingPoopLevel) {
        super(mSnapshot, mAnimationsList, mSoundsList, mUnlocked, mCharacterType, mCharacterName);
        this.startingPoopLevel = startingPoopLevel;
    }

    public void setPoopMeter(PoopMeter poopMeter){
        poopMeter.setmStartingPoopLevel(startingPoopLevel);
    }

    @Override
    public void draw() {

    }

    @Override
    public void animate() {

    }

    @Override
    public void playSound() {

    }
}
