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
        System.out.printf( "Guerreiro %s usa espada %.0f vezes !", super.getNome(), super.getPoderBase() );

    }

    @Override
    public String toString() {
        return "Guerreiro{" +
                super.toString() +
                '}';
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}