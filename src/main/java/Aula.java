import java.util.Scanner;

public class Aula {
    private int alunosAulaMusculacao, alunosAulaNatacao, alunosAulaGinastica;

    public int getAlunosAulaMusculacao() {
        return alunosAulaMusculacao;
    }

    public int setAlunosAulaMusculacao(int alunosAulaMusculacao) {
        this.alunosAulaMusculacao = alunosAulaMusculacao;
        return alunosAulaMusculacao;
    }

    public int getAlunosAulaNatacao() {
        return alunosAulaNatacao;
    }

    public void setAlunosAulaNatacao(int alunosAulaNatacao) {
        this.alunosAulaNatacao = alunosAulaNatacao;
    }

    public int getAlunosAulaGinastica() {
        return alunosAulaGinastica;
    }

    public void setAlunosAulaGinastica(int alunosAulaGinastica) {
        this.alunosAulaGinastica = alunosAulaGinastica;
    }

    //Constructor
    Aula(){
        setAlunosAulaMusculacao(4);
        setAlunosAulaNatacao(8);
        setAlunosAulaGinastica(14);
    }

    public String cadastrarAula(String nomeAula, String diaAula, String professorAula){
        if(nomeAula.isEmpty()){
            return "Nome da aula obrigatorio!";
        }else if (diaAula.isEmpty()){
            return "Dia da aula obrigatorio!";
        }else if(professorAula.isEmpty()){
            return "Professor obrigatorio!";
        }else{
            return "Aula cadastrada!";
        }
    }

    //Tipos de Aula: Musculacao, Natacao, Ginastica
    public String tipoAula(char charAula){
        String tipo = "";
        switch(charAula){
            case 'M':
                tipo = "Aula de Musculacao";
                break;
            case 'N':
                tipo = "Aula de Natacao";
                break;
            case 'G':
                tipo = "Aula de Ginastica";
                break;
            default:
                tipo = "Tipo de aula nao encontrada!";
                break;
        }
        return tipo;
    }

    public String verificaAlunosAula(String aulaEscolhida){
        String messageVerifica = "";
        if(aulaEscolhida == "Musculacao"){
            messageVerifica = "Aula vazia! Entre 0 e 5 Alunos. Alunos na aula: " + getAlunosAulaMusculacao();
        }else if(aulaEscolhida == "Natacao"){
            messageVerifica = "Aula quase cheia! Entre 6 e 10 Alunos. Alunos na aula: " + getAlunosAulaNatacao();
        }else if( aulaEscolhida == "Ginastica"){
            messageVerifica = "Aula cheia! Entre 11 e 15 Alunos. Alunos na aula: " + getAlunosAulaGinastica();
        }
        return messageVerifica;
    }

}
