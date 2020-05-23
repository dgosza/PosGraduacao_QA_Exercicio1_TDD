import org.junit.Assert;
import org.junit.Test;

public class CalculadoraTest {

    @Test
    public void somarSimplesValor(){
        //ARRANGE
        Calculadora calculadora = new Calculadora();
        int esperado = 2;

        //ACT
        int atual = calculadora.somar(1,1);

        //ASSERT
        Assert.assertEquals(esperado, atual);
    }


}
