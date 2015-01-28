package buttley.nyc.esteban.magicbeans.model.characters;

import android.util.Log;

import buttley.nyc.esteban.magicbeans.controller.GameController;
import buttley.nyc.esteban.magicbeans.logging.LoggerConfig;

/**
 * This class creates the CharacterPool and fills it with GameCharacters.
 *
 *
 */
public class CharacterLoader {
    public CharacterPool mCharacterPool;

    public  CharacterLoader(){
        mCharacterPool = new CharacterPool();
        if(LoggerConfig.ON){
            Log.v(LoggerConfig.LOG_TAG, "Attempting to Load all Characters");
        }
        loadAllCharacters();
        if(LoggerConfig.ON){
            Log.v(LoggerConfig.LOG_TAG, "all characters loaded");
        }
    }


    public CharacterPool getCharacterPool() {
        return mCharacterPool;
    }

    public void loadAllCharacters(){

        for(CharacterNamesEnum name: CharacterNamesEnum.values()) {
            if(LoggerConfig.ON){
                Log.v(LoggerConfig.LOG_TAG, "attempting to add "+ name.toString());
            }
            mCharacterPool.addToPool(CharacterFactory.buildCharacter(name));
            if(LoggerConfig.ON){
                Log.v(LoggerConfig.LOG_TAG, "added "+ name.toString());
            }
        }
    }

}
