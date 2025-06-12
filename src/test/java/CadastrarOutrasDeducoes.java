import org.example.IRPF;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CadastrarOutrasDeducoes {

    private IRPF irpf;

    @BeforeEach
    public void setUp(){
        irpf = new IRPF();
    }

    @Test
    public void CadastrarOutraDeducao1(){
        irpf.cadastrarOutraDeducao(200f);
        assertEquals(200f, irpf.getOutraDeducao(),0);
    }

    @Test
    public void CadastrarOutraDeducao2(){
        irpf.cadastrarOutraDeducao(500f);
        assertEquals(500f, irpf.getOutraDeducao(),0);
    }

    @Test
    public void CadastrarOutraDeducao3(){
        irpf.cadastrarOutraDeducao(600f);
        irpf.cadastrarOutraDeducao(700f);
        assertEquals(600f + 700f, irpf.getOutraDeducao(),0);
    }
}