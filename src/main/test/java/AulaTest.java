import org.junit.Assert;
import org.junit.Test;

public class AulaTest {

    @Test
    public void cadastraAula(){
        //ARRANGE
        Aula aula = new Aula();
        String esperado = "Aula cadastrada!";

        //ACT
        String resultado = aula.cadastrarAula("Aula de Natacao", "Segunda", "Diego Souza");

        //ASSERT
        Assert.assertEquals(resultado, esperado);
    }

    @Test
    public void cadastraAulaSemNomeAula(){
        //ARRANGE
        Aula aula = new Aula();
        String esperado = "Nome da aula obrigatorio!";

        //ACT
        String resultado = aula.cadastrarAula("", "Segunda", "Diego Souza");

        //ASSERT
        Assert.assertEquals(resultado, esperado);
    }

    @Test
    public void cadastraAulaSemDiaAula(){
        //ARRANGE
        Aula aula = new Aula();
        String esperado = "Dia da aula obrigatorio!";

        //ACT
        String resultado = aula.cadastrarAula("Aula de Musculacao", "", "Diego Souza");

        //ASSERT
        Assert.assertEquals(resultado, esperado);
    }

    @Test
    public void cadastraAulaSemProfessor(){
        //ARRANGE
        Aula aula = new Aula();
        String esperado = "Professor obrigatorio!";

        //ACT
        String resultado = aula.cadastrarAula("Aula de Musculacao", "Quarta", "");

        //ASSERT
        Assert.assertEquals(resultado, esperado);
    }

    @Test
    public void verificaTipoAulaNatacao(){
        //ARRANGE
        Aula aula = new Aula();
        String esperado = "Aula de Natacao";

        //ACT
        String resultado = aula.tipoAula('N');

        //ASSERT
        Assert.assertEquals(resultado, esperado);
    }

    @Test
    public void verificaTipoAulaMusculacao(){
        //ARRANGE
        Aula aula = new Aula();
        String esperado = "Aula de Musculacao";

        //ACT
        String resultado = aula.tipoAula('M');

        //ASSERT
        Assert.assertEquals(resultado, esperado);
    }

    @Test
    public void verificaTipoAulaGinastica(){
        //ARRANGE
        Aula aula = new Aula();
        String esperado = "Aula de Ginastica";

        //ACT
        String resultado = aula.tipoAula('G');

        //ASSERT
        Assert.assertEquals(resultado, esperado);
    }

    @Test
    public void verificaTipoAulaDefault(){
        //ARRANGE
        Aula aula = new Aula();
        String esperado = "Tipo de aula nao encontrada!";

        //ACT
        String resultado = aula.tipoAula('P');

        //ASSERT
        Assert.assertEquals(resultado, esperado);
    }

    @Test
    public void verificaAlunosAulaMusculacao(){
        //ARRANGE
        Aula aula = new Aula();
        String esperado = "Aula vazia! Entre 0 e 5 Alunos. Alunos na aula: 4" ;

        //ACT
        String resultado = aula.verificaAlunosAula("Musculacao");

        //ASSERT
        Assert.assertEquals(resultado, esperado);
    }

    @Test
    public void verificaalunosAulaGinastica(){
        //ARRANGE
        Aula aula = new Aula();
        String esperado = "Aula cheia! Entre 11 e 15 Alunos. Alunos na aula: 14" ;

        //ACT
        String resultado = aula.verificaAlunosAula("Ginastica");

        //ASSERT
        Assert.assertEquals(resultado, esperado);
    }

    @Test
    public void verificaalunosAulaNatacao(){
        //ARRANGE
        Aula aula = new Aula();
        String esperado = "Aula quase cheia! Entre 6 e 10 Alunos. Alunos na aula: 8" ;

        //ACT
        String resultado = aula.verificaAlunosAula("Natacao");

        //ASSERT
        Assert.assertEquals(resultado, esperado);
    }

}
