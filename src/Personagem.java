public abstract class Personagem {

    protected String nome;
    protected String classe;
    protected int nivel;
    protected int pontosDeVida;
    protected double poderBase;
    protected String habilidade;

    public Personagem( String nome, String classe, int nivel, double poderBase, int pontosDeVida, String habilidade) {
        this.nome = nome;
        this.classe = classe;
        this.nivel = nivel;
        this.poderBase = poderBase;
        this.pontosDeVida = pontosDeVida;
        this.habilidade=habilidade;

    }

    public abstract void usarHabilidade();

    public void exibirStatus(){
        System.out.printf(" Nome : %s%n Classe : %s%n Nivel : %d%n Pontos de vida : %d%n" +
                " Poder base: %.0f%n Habilidade %s%n ", nome, classe, nivel, pontosDeVida,poderBase, habilidade);

    }

    @Override
    public String toString() {
        return "Personagem{" +
                "classe='"  + classe + '\''+
                ", nome='" + nome + '\'' +
                ", nivel=" + nivel +
                ", pontosDeVida=" + pontosDeVida +
                ", poderBase=" + poderBase +
                ", habilidade='" + habilidade + '\'' +
                '}';
    }
}
