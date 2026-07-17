public abstract class Personagem {

    private String nome;
    private String classe;
    private int nivel;
    private int pontosDeVida;
    private double poderBase;
    private String habilidade;

    public Personagem( String nome, String classe, int nivel, double poderBase, int pontosDeVida, String habilidade) {
        this.nome = nome;
        this.classe = classe;
        this.nivel = nivel;
        this.poderBase = poderBase;
        this.pontosDeVida = pontosDeVida;
        this.habilidade=habilidade;

    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public String getHabilidade() {
        return habilidade;
    }

    public void setHabilidade(String habilidade) {
        this.habilidade = habilidade;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPoderBase() {
        return poderBase;
    }

    public void setPoderBase(double poderBase) {
        this.poderBase = poderBase;
    }

    public int getPontosDeVida() {
        return pontosDeVida;
    }

    public void setPontosDeVida(int pontosDeVida) {
        this.pontosDeVida = pontosDeVida;
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
