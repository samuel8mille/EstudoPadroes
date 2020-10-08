package exemplos.jogo.characters;

public abstract class MyCharacter implements Char {

    private int hp;
    private int dammmage;
    private String name;

    public void atacar(MyCharacter inimigo) {
        if (inimigo.getHp() <= getDammmage()) {
            inimigo.morrer(this);
        } else {
            inimigo.receberDano(this);
        }
    }

    private void receberDano(MyCharacter inimigo) {
        System.out.println("Você recebeu " + inimigo.getDammmage() + " de dano de " + inimigo.getName() + "!");
        setHp(getHp() - inimigo.getDammmage());
        System.out.println("O seu hp é " + getHp() + "!");
    }

    private void morrer(MyCharacter inimigo) {
        if (getHp() > 0) {
            System.out.println("Você recebeu " + inimigo.getDammmage() + " de dano de " + inimigo.getName() + "!");
            System.out.println("Você morreu!!");
            setHp(0);
        }
    }

    public int getHp() {
        return hp;
    }

    void setHp(int hp) {
        this.hp = hp;
    }

    private int getDammmage() {
        return dammmage;
    }

    void setDammmage(int dammmage) {
        this.dammmage = dammmage;
    }

    private String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }
}
