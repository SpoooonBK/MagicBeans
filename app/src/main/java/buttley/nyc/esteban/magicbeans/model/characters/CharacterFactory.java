package buttley.nyc.esteban.magicbeans.model.characters;

import buttley.nyc.esteban.magicbeans.model.characters.Beans.BabyBean;

/**
 * Created by Spoooon on 1/22/2015.
 */
public class CharacterFactory {

//TODO implement CharacterFactory

    public static GameCharacter buildCharacter(NamesEnum name){
        GameCharacter character = null;
        switch (name){
            case BABY:{
                character = new BabyBean();
                break;
            }

        }

        return character;
    }

}
