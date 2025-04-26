public class Guerreiro extends Personagem{
    private String tipoEspada;
    private String tipoEscudo;

    Guerreiro(String nick, int level, int hp, double dano, String tipoArmadura, String tipoEspada, String tipoEscudo){
        super(nick, level, hp, dano, tipoArmadura);
        this.tipoEscudo = tipoEscudo;
        this.tipoEspada = tipoEspada;
    }

    @Override
    public void atacar() {
        super.atacar();
        System.out.println("Armadura: " + getTipoArmadura());
        System.out.println("Tipo de dano: >Fisico<");
        System.out.println("Espada: " + this.tipoEspada);
        System.out.println("Escudo: " + this.tipoEscudo);
    }
}
