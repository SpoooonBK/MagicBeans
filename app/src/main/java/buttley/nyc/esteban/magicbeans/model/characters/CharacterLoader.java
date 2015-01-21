package buttley.nyc.esteban.magicbeans.model.characters;

import buttley.nyc.esteban.magicbeans.model.characters.Beans.BabyBean;

/**
 * This class creates all the GameCharacters and puts them in a CharacterPool.
 * The CharacterPool is filled with all GameCharacters on instantiation.
 */
public class CharacterLoader {
    public CharacterPool mCharacterPool;

    CharacterLoader(){
        loadCharacters();
    }


    public CharacterPool getCharacterPool() {
        return mCharacterPool;
    }

    public void loadCharacters(){
        mCharacterPool = new CharacterPool();

        for(NamesEnum name: NamesEnum.values()) {
            mCharacterPool.addCharacterToPool(buildCharacter(name));
        }
    }




    public GameCharacter buildCharacter(NamesEnum name){
        GameCharacter character = null;
        switch (name){
            case BABY:{
                character = new BabyBean();
                break;
            }

        }

        return character;
    }



//TODO setup check if character is unlocked
    private boolean isUnlocked(NamesEnum name){
        boolean isUnlocked = true;
        return isUnlocked;
    }


}
