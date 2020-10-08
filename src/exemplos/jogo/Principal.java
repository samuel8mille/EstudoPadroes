package exemplos.jogo;

import exemplos.jogo.characters.CharFactory;
import exemplos.jogo.characters.CharType;
import exemplos.jogo.characters.MyCharacter;

public class Principal {

    public static void main(String[] args) {

        CharFactory charFactory = new CharFactory();

        MyCharacter mario = charFactory.getCharacter(CharType.MARIO);
        MyCharacter superMario = charFactory.getCharacter(CharType.SUPER_MARIO);
        MyCharacter fireMario = charFactory.getCharacter(CharType.FIRE_MARIO);
        MyCharacter marioInvencivel = charFactory.getCharacter(CharType.MARIO_INVENCIVEL);
        MyCharacter marioMorto = charFactory.getCharacter(CharType.MARIO_MORTO);

        mario.atacar(superMario);
        mario = mario.pegarCogumelo();
        fireMario.atacar(superMario);

        System.out.println(mario.getHp());
        System.out.println(superMario.getHp());
        System.out.println(fireMario.getHp());
        System.out.println(marioInvencivel.getHp());
//        System.out.println(marioMorto.getHp());

//        mario.atacar(superMario);
//        mario.atacar(superMario);
//        mario.atacar(superMario);
//        mario.atacar(superMario);
//        mario.atacar(superMario);
//        mario.atacar(superMario);
//        mario.atacar(superMario);
//        mario.atacar(superMario);
//        mario.atacar(superMario);
//        mario.atacar(superMario);
    }
}
