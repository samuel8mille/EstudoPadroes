package exemplos.jogo.characters;

public class Mario extends MyCharacter {

    Mario() {
        setHp(100);
        setDammmage(10);
        setName(CharacterName.MARIO.value());
    }

    @Override
    public MyCharacter pegarCogumelo() {
        return new SuperMario();
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
