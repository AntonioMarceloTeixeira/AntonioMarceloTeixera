import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ArrayList<Personagem> personagem = new ArrayList<>();
        Personagem magoMerlin =  new Mago("Merlin", "Bruxo", 10, 100,90,"Desaparecer");
        Personagem magoCesar = new Mago("Cesar", "Feiticeiro", 80,120,60, "Virar uma bola de fogo");

        Personagem guerreiroBrutos = new Guerreiro("Brutos", "Assassino", 200, 10, 200, "Usar facas");
        Personagem guerreioCaio = new Guerreiro("Caio", "Gladiador", 300, 99, 400, "Matar com as mãos");

        personagem.add(magoMerlin);
        personagem.add(magoCesar);
        personagem.add(guerreiroBrutos);
        personagem.add(guerreioCaio);

        for (var personagem1 : personagem) {
            personagem1.exibirStatus();
            personagem1.usarHabilidade();
            System.out.printf("%n===============================================================%n");
        }
    }
}