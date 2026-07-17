public class Guerreiro extends Personagem{

    public Guerreiro(String nome, String classe, int nivel, double poderBase, int pontosDeVida, String habilidade){
        super(nome, classe, nivel, poderBase, pontosDeVida, habilidade);

    }

    @Override
    public void exibirStatus() {
        super.exibirStatus();
    }

    @Override
    public void usarHabilidade() {
        System.out.printf( "Guerreiro %s conjura %.0f bola de fogo!", super.getNome(), super.getPoderBase());

    }

    @Override
    public String toString() {
        return "Guerreiro{" +
                super.toString()+
                '}';
    }
}
