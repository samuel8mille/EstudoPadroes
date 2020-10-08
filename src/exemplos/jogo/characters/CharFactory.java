package exemplos.jogo.characters;

public class CharFactory {

    public MyCharacter getCharacter(CharType type) {
        switch (type) {
            case MARIO:
                return new Mario();
            case SUPER_MARIO:
                return new SuperMario();
            case FIRE_MARIO:
                return new FireMario();
            case MARIO_INVENCIVEL:
                return new MarioInvencivel();
            case MARIO_MORTO:
                return new MarioMorto();
            default:
                return null;
        }
    }
}

