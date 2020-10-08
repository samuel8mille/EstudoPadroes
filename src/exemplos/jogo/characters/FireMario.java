package exemplos.jogo.characters;

public class FireMario extends MyCharacter {

    FireMario() {
        setHp(100);
        setDammmage(25);
        setName(CharacterName.FIRE_MARIO.value());
    }

    @Override
    public MyCharacter pegarCogumelo() {
        return this;
    }

    @Override
    public MyCharacter pegarEstrela() {
        return new MarioInvencivel();
    }

    @Override
    public MyCharacter pegarFlorDeFogo() {
        return this;
    }

    @Override
    public MyCharacter colidirComOInimigo() {
        return new MarioMorto();
    }

}
