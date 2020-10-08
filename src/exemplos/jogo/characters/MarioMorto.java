package exemplos.jogo.characters;

public class MarioMorto extends MyCharacter {

    MarioMorto() {
        setHp(0);
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
