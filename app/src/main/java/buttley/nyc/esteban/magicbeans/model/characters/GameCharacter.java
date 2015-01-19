package buttley.nyc.esteban.magicbeans.model.characters;

import android.graphics.Bitmap;
import android.graphics.drawable.AnimationDrawable;

import java.util.List;

import buttley.nyc.esteban.magicbeans.model.sounds.Sound;


/**
 * The base abstract GameCharacter class contains all the sounds and graphics for the characters
 */
public abstract class GameCharacter {

    private Bitmap mSnapshot;
    private List<AnimationDrawable> mAnimationsList;
    private List<Sound> mSoundsList;
    private boolean mUnlocked;
    private CharacterType mCharacterType;
    private NamesEnum mCharacterName;

    protected GameCharacter(){
    }

    public GameCharacter(Bitmap mSnapshot, List<AnimationDrawable> mAnimationsList, List<Sound> mSoundsList, boolean mUnlocked, CharacterType mCharacterType, NamesEnum mCharacterName) {
        this.mSnapshot = mSnapshot;
        this.mAnimationsList = mAnimationsList;
        this.mSoundsList = mSoundsList;
        this.mUnlocked = mUnlocked;
        this.mCharacterType = mCharacterType;
    }

    public NamesEnum getmCharacterName() {
        return mCharacterName;
    }

    public void setmCharacterName(NamesEnum mCharacterName) {
        this.mCharacterName = mCharacterName;
    }

    public CharacterType getmCharacterType() {
        return mCharacterType;
    }

    public void setmCharacterType(CharacterType mCharacterType) {
        this.mCharacterType = mCharacterType;
    }

    public Bitmap getmSnapshot() {
        return mSnapshot;
    }

    public void setmSnapshot(Bitmap mSnapshot) {
        this.mSnapshot = mSnapshot;
    }

    public List<AnimationDrawable> getmAnimationsList() {
        return mAnimationsList;
    }

    public void setmAnimationsList(List<AnimationDrawable> mAnimationsList) {
        this.mAnimationsList = mAnimationsList;
    }

    public List<Sound> getmSoundsList() {
        return mSoundsList;
    }

    public void setmSoundsList(List<Sound> mSoundsList) {
        this.mSoundsList = mSoundsList;
    }


    public boolean ismUnlocked() {
        return mUnlocked;
    }

//TODO set up unlocked
    public void setmUnlocked() {
    }



    //Abstract method
    public abstract void draw();
    public abstract void animate();
    public abstract void playSound();

}
