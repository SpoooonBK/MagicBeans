package buttley.nyc.esteban.magicbeans.model.characters;

/**
 * This class creates the CharacterPool and fills it with GameCharacters.
 *
 *
 */
public class CharacterLoader {
    public static CharacterPool sCharacterPool;
    private static CharacterLoader sCharacterLoader;


    public  CharacterLoader(){
        sCharacterPool = new CharacterPool();
        loadCharacters();
    }


    private static CharacterPool getCharacterPool() {
        if(sCharacterLoader == null){
            sCharacterLoader = new CharacterLoader();
        }
        return sCharacterPool;
    }

    public void loadCharacters(){

        for(NamesEnum name: NamesEnum.values()) {
            sCharacterPool.addToPool(CharacterFactory.buildCharacter(name));
        }
    }

}
