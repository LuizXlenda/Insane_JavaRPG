public class Arqueiro extends Personagem {
    private String tipoArco;
    private int qtdFlechas;

    Arqueiro(String nick, int hp, int lvl, double dano, String tipoArm, String tipoArco, int qtdFlechas){
        super(nick, qtdFlechas, hp, dano, tipoArm);
        this.tipoArco = tipoArco;
        this.qtdFlechas = qtdFlechas;
    }

    @Override
    public void atacar() {
        super.atacar();
        this.qtdFlechas -= 1;
        System.out.println("Armadura: " + getTipoArmadura());
        System.out.println("Tipo de dano: >Fisico<");
        System.out.println("Arco: " + this.tipoArco);
        System.out.println("Flechas restantes: " + this.qtdFlechas);
    }

    
}
