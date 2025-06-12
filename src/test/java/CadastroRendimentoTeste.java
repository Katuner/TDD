import org.example.IRPF;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CadastroRendimentoTeste {

    private IRPF irpf;

    @Before
    public void setUp(){
      irpf = new IRPF();
    }

    @Test
    public void testCadastrarSalario(){
        irpf.cadastrarSalario(5000f);
        assertEquals(5000f, irpf.getTotalSalario(),0);
        //fail("Não implementado");
    }

}
