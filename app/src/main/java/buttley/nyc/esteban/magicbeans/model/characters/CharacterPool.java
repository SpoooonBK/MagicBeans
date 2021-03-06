package buttley.nyc.esteban.magicbeans.model.characters;

import java.util.EnumMap;
import java.util.Map;

import buttley.nyc.esteban.magicbeans.model.characters.beans.*;


/**
 *
 */
public class CharacterPool {


    private Map<CharacterNamesEnum, GameCharacter> mCharacterMap;


    public CharacterPool(){
        mCharacterMap = new EnumMap<CharacterNamesEnum, GameCharacter>(CharacterNamesEnum.class);
        loadAllCharacters();
    }


    public Map<CharacterNamesEnum, GameCharacter> getmCharacterMap() {
        return mCharacterMap;
    }

    public void addCharacter(GameCharacter gameCharacter){
        mCharacterMap.put(gameCharacter.getmCharacterName(), gameCharacter);
    }

    public GameCharacter getGameCharacter(CharacterNamesEnum characterName){
        return mCharacterMap.get(characterName);
    }

    private void loadAllCharacters(){
        mCharacterMap.put(CharacterNamesEnum.BUTTLEY, new Buttley());
        mCharacterMap.put(CharacterNamesEnum.BABY, new BabyBean());
        mCharacterMap.put(CharacterNamesEnum.AIR_BISCUIT, new AirBiscuit());
        mCharacterMap.put(CharacterNamesEnum.BAKED_JAKE, new BakedJake());
        mCharacterMap.put(CharacterNamesEnum.BUBBA, new Bubba());
        mCharacterMap.put(CharacterNamesEnum.DUSTY, new Dusty());
        mCharacterMap.put(CharacterNamesEnum.EDEMAMA, new Edemama());
        mCharacterMap.put(CharacterNamesEnum.DUTCH_OVEN, new DutchOven());
        mCharacterMap.put(CharacterNamesEnum.HOLY_FRIJOLE, new HolyFrijole());
        mCharacterMap.put(CharacterNamesEnum.JOE, new Joe());
        mCharacterMap.put(CharacterNamesEnum.SHARTY, new Sharty());
        mCharacterMap.put(CharacterNamesEnum.SILENT_BUT_DEADLY, new SilentButDeadly());
        mCharacterMap.put(CharacterNamesEnum.TWERK, new Twerk());

    }


}
