public class Mago extends Personagem {
    private String tipoCajado;
    private String tipoLivro;

    Mago(String nick, int level, int hp, double dano, String tipoArmadura, String tipoCajado, String tipoLivro){
        super(nick, level, hp, dano, tipoArmadura);
        this.tipoCajado = tipoCajado;
        this.tipoLivro = tipoLivro;
    }

    @Override
    public void atacar() {
        super.atacar();
        System.out.println("Armadura: " + getTipoArmadura());
        System.out.println("Tipo de dano: >Magico<");
        System.out.println("Cajado: " + this.tipoCajado);
        System.out.println("Livro: " + this.tipoLivro);
    }

    


}
