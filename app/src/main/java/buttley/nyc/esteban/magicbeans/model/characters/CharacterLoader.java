package buttley.nyc.esteban.magicbeans.model.characters;

import buttley.nyc.esteban.magicbeans.controller.GameController;

/**
 * This class creates the CharacterPool and fills it with GameCharacters.
 *
 *
 */
public class CharacterLoader {
    public CharacterPool mCharacterPool;

    public  CharacterLoader(){
        mCharacterPool = new CharacterPool();
        loadAllCharacters();
    }


    public CharacterPool getCharacterPool() {
        return mCharacterPool;
    }

    public void loadAllCharacters(){

        for(CharacterNamesEnum name: CharacterNamesEnum.values()) {
            mCharacterPool.addToPool(CharacterFactory.buildCharacter(name));
        }
    }

}
