public class Mago extends Personagem{


    public Mago(String nome, String classe, int nivel, double poderBase, int pontosDeVida, String habilidade) {
        super(nome, classe, nivel, poderBase, pontosDeVida, habilidade);
    }

    @Override
    public void exibirStatus() {
        super.exibirStatus();
    }

    @Override
    public void usarHabilidade() {
        System.out.printf( "Mago %s usa cajado magico %.0f vezes quando ameaçado de morte!", super.getNome(), super.getPoderBase() );

    }

    @Override
    public String toString() {
        return "Mago{" +
                super.toString()+
                '}';
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

}
