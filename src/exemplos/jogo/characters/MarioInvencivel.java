package exemplos.jogo.characters;

public class MarioInvencivel extends MyCharacter {

    MarioInvencivel() {
        setHp(10000);
        setDammmage(100);
        setName(CharacterName.MARIO_INVENCIVEL.value());
    }

    @Override
    public MyCharacter pegarCogumelo() {
        return this;
    }

    @Override
    public MyCharacter pegarEstrela() {
        return this;
    }

    @Override
    public MyCharacter pegarFlorDeFogo() {
        return this;
    }

    @Override
    public MyCharacter colidirComOInimigo() {
        return this;
    }

}
