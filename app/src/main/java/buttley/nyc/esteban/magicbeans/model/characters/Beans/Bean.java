package buttley.nyc.esteban.magicbeans.model.characters.Beans;

import buttley.nyc.esteban.magicbeans.model.characters.CharacterType;
import buttley.nyc.esteban.magicbeans.model.characters.GameCharacter;

/**
 * Created by Spoooon on 1/18/2015.
 */
public abstract class Bean extends GameCharacter {

    Bean(){
        super();
        setmCharacterType(CharacterType.BEAN);
    }


    @Override
    public abstract void draw();

    @Override
    public abstract void animate();

    @Override
    public abstract void playSound();
}
