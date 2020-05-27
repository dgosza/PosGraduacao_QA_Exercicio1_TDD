import java.util.Scanner;

public class AulaTesteCL {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Aula aula = new Aula();

        //Teste Cadastrar Aula
        System.out.println("Escreva o nome da aula");
        String nomeAula = read.nextLine();

        System.out.println("Escreva o dia da aula");
        String diaAula = read.nextLine();

        System.out.println("Escreva o professor da aula");
        String professorAula = read.nextLine();

        String resposta = aula.cadastrarAula(nomeAula, diaAula, professorAula);

        System.out.println(resposta);

    }
}
