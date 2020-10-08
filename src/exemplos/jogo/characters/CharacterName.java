package exemplos.jogo.characters;

public enum CharacterName {

    MARIO ( "Mario Comum"),
    SUPER_MARIO ("Super Mario"),
    FIRE_MARIO ("Fire Mario"),
    MARIO_INVENCIVEL ("Mario Invencível");

    private String value;

    CharacterName(String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }
}
