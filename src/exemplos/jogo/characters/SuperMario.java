package exemplos.jogo.characters;

public class SuperMario extends MyCharacter {

    SuperMario() {
        setHp(100);
        setDammmage(15);
        setName(CharacterName.SUPER_MARIO.value());
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
        return new FireMario();
    }

    @Override
    public MyCharacter colidirComOInimigo() {
        return new MarioMorto();
    }

}
