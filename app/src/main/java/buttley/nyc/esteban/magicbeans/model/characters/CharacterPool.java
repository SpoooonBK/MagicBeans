package buttley.nyc.esteban.magicbeans.model.characters;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import buttley.nyc.esteban.magicbeans.model.characters.Beans.Bean;

/**
 * Created by Spoooon on 1/18/2015.
 */
public class CharacterPool {


    private Buttley buttley;
    private List<GameCharacter> beanList;
    private List<GameCharacter> patientList;


    public CharacterPool(){

        buttley = new Buttley();
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


    public void addCharacterToPool(GameCharacter gameCharacter){
        if (gameCharacter.getmCharacterType() == CharacterType.BEAN){
            beanList.add(gameCharacter);
        }
        if (gameCharacter.getmCharacterType() == CharacterType.PATIENT)
            patientList.add(gameCharacter);
    }


    public GameCharacter getGameCharacter(NamesEnum characterName){

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

    private GameCharacter findCharacter(List<GameCharacter> list, NamesEnum characterName) {
        Iterator<GameCharacter> iterator = list.iterator();
        while (iterator.hasNext()){
            if(iterator.next().mCharacterName == characterName){
                return iterator.next();
            }
        }
        return null;
    }


}
