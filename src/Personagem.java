public abstract class Personagem {

    private String nome;
    private String classe;
    private int nivel;
    private int pontosDeVida;
    private double poderBase;
    private String habilidade;

    public Personagem( String nome, String classe, int nivel, double poderBase, int pontosDeVida, String habilidade) {
        this.setNome(nome);
        this.setClasse(classe);
        this.setNivel(nivel);
        this.setPoderBase(poderBase);
        this.setPontosDeVida(pontosDeVida);
        this.setHabilidade(habilidade);

    }

    public abstract void usarHabilidade();

    public void exibirStatus(){
        System.out.printf(" Nome : %s%n Classe : %s%n Nivel : %d%n Pontos de vida : %d%n" +
                " Poder base: %.0f%n Habilidade %s%n ", getNome(), getClasse(), getNivel(), getPontosDeVida(), getPoderBase(), getHabilidade());

    }

    @Override
    public String toString() {
        return "Personagem{" +
                "classe='"  + getClasse() + '\''+
                ", nome='" + getNome() + '\'' +
                ", nivel=" + getNivel() +
                ", pontosDeVida=" + getPontosDeVida() +
                ", poderBase=" + getPoderBase() +
                ", habilidade='" + getHabilidade() + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getPontosDeVida() {
        return pontosDeVida;
    }

    public void setPontosDeVida(int pontosDeVida) {
        this.pontosDeVida = pontosDeVida;
    }

    public double getPoderBase() {
        return poderBase;
    }

    public void setPoderBase(double poderBase) {
        this.poderBase = poderBase;
    }

    public String getHabilidade() {
        return habilidade;
    }

    public void setHabilidade(String habilidade) {
        this.habilidade = habilidade;
    }
}
