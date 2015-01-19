package buttley.nyc.esteban.magicbeans.model.characters;

import android.graphics.Bitmap;
import android.graphics.drawable.AnimationDrawable;

import java.util.List;

import buttley.nyc.esteban.magicbeans.model.sounds.Sound;

/**
 * This class creates all the GameCharacters and puts them in a CharacterPool.
 * The CharacterPool is filled with all GameCharacters on instantiation.
 */
public class CharacterFactory {
    public CharacterPool mCharacterPool;

    public CharacterFactory(){
        fillCharacterPool();
    }


    public CharacterPool getCharacterPool() {
        return mCharacterPool;
    }

    public void fillCharacterPool(){

        mCharacterPool = new CharacterPool();
        mCharacterPool.addCharacter(new Buttley());

        for(NamesEnum name: NamesEnum.values()) {
            mCharacterPool.addCharacter(buildCharacter(name));
        }
    }

// buildCharacter Method returns a GameCharacter of two distinct types, Bean and Patient.

    public GameCharacter buildCharacter(NamesEnum name){
        CharacterType type = name.getCharacterType();
        GameCharacter character = null;

        if(isUnlocked(name)){
            switch (type){
                case BEAN:
                    character = buildBean(name);
                    break;
                case PATIENT:
                    character = buildPatient(name);
                    break;
            }
        }
        return character;
    }

    private Bean buildBean(NamesEnum name){
        Bean bean = new Bean();

        return bean;
    }

    private Patient buildPatient(NamesEnum name){
        Patient patient = null;

        return patient;
    }

//TODO setup check if character is unlocked
    private boolean isUnlocked(NamesEnum name){
        boolean isUnlocked = true;
        return isUnlocked;
    }


}
