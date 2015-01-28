package buttley.nyc.esteban.magicbeans.model.characters;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



/**
 * This class contains two ArrayLists with Bean characters and Patient Characters
 */
public class CharacterPool {


    private Buttley buttley = new Buttley();
    private List<GameCharacter> beanList;
    private List<GameCharacter> patientList;


    public CharacterPool(){
        beanList = new ArrayList<GameCharacter>();
        patientList = new ArrayList<GameCharacter>();

    }

    public Buttley getButtley() {
        return buttley;
    }

    public List<GameCharacter> getBeanList() {
        return beanList;
    }

    public List<GameCharacter> getPatientList() {
        return patientList;
    }


    public void addToPool(GameCharacter gameCharacter){
        if (gameCharacter.getmCharacterType() == CharacterType.BUTTLEY){
            buttley = new Buttley();
        }
        if (gameCharacter.getmCharacterType() == CharacterType.BEAN){
            beanList.add(gameCharacter);
        }
        if (gameCharacter.getmCharacterType() == CharacterType.PATIENT)
            patientList.add(gameCharacter);
    }


    public GameCharacter getGameCharacter(CharacterNamesEnum characterName){

        if (characterName.getCharacterType() == CharacterType.BUTTLEY){
            return getButtley();
        }
        if(characterName.getCharacterType()== CharacterType.BEAN){
            return findCharacter(beanList, characterName);
        }
        if(characterName.getCharacterType()== CharacterType.PATIENT){
            return findCharacter(patientList, characterName);
        }
        return null;
    }

    private GameCharacter findCharacter(List<GameCharacter> list, CharacterNamesEnum characterName) {
        Iterator<GameCharacter> iterator = list.iterator();
        while (iterator.hasNext()){
            if(iterator.next().mCharacterName == characterName){
                return iterator.next();
            }
        }
        return null;
    }


}
