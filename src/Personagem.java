public abstract class Personagem {
    private String nick;
    private int level;
    private int hp;
    private double dano;
    private String tipoArmadura;

    Personagem(String nick, int level, int hp, double dano, String tipoArmadura){
        this.nick = nick;
        this.hp = hp;
        this.dano = dano;
        this.level = level;
        this.tipoArmadura = tipoArmadura;

    }

    public void atacar(){
        System.out.println(this.nick + "Efetuou um ataque! Causou " + this.dano + "!");
    }

    public double getDano() {
        return dano;
    }

    public int getHp() {
        return hp;
    }
    
    public int getLevel() {
        return level;
    }

    public String getNick() {
        return nick;
    }

    public String getTipoArmadura() {
        return tipoArmadura;
    }

    public void setDano(double dano) {
        this.dano = dano;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public void setTipoArmadura(String tipoArmadura) {
        this.tipoArmadura = tipoArmadura;
    }
}
