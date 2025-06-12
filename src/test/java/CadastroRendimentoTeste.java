import org.example.IRPF;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CadastroRendimentoTeste {

    private IRPF irpf;

    @BeforeEach
    public void setUp(){
      irpf = new IRPF();
    }

    @Test
    public void testCadastrarSalario(){
        irpf.cadastrarSalario(5000f);
        assertEquals(5000f, irpf.getTotalSalario(),0);
        //fail("Não implementado");
    }

    @Test
    public void testCadastrarSalario2(){
        irpf.cadastrarSalario(6000f);
        assertEquals(6000f, irpf.getTotalSalario(),0);
    }

    @Test
    public void testCadastrarSalario3(){
        irpf.cadastrarSalario(5000f);
        irpf.cadastrarSalario(6000f);
        assertEquals(11000f, irpf.getTotalSalario(),0);
    }

}
