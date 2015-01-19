package buttley.nyc.esteban.magicbeans.model.characters;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Spoooon on 1/18/2015.
 */
public class CharacterPool {

    private GameCharacter character;
    private List<GameCharacter> mGameCharacterList;
    private Iterator<GameCharacter> gameCharacterIterator;

    public CharacterPool(){

        mGameCharacterList= new ArrayList<GameCharacter>();
    }

    public void addCharacter(GameCharacter gameCharacter){
        mGameCharacterList.add(gameCharacter);
    }

    public GameCharacter getCharacter(NamesEnum characterName){

        //* Searches List for character by name and returns that character
        if(mGameCharacterList != null){
            gameCharacterIterator = mGameCharacterList.iterator();
            while(gameCharacterIterator.hasNext()){
                character = gameCharacterIterator.next();
                if(character.getmCharacterName()== characterName){
                    return character;
                }
            }
        }
        return character;
    }

}
