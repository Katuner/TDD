import org.example.IRPF;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CadastrarDeducoesTeste {

    private IRPF irpf;

    @BeforeEach
    public void setup(){
        irpf = new IRPF();
    }

    @Test
    public void testCadastrarPrevidenciaOficial(){
        irpf.cadastrarPrevidenciaOficial(700f);
        assertEquals(700f, irpf.getPrevidenciaOficial(), 0);
    }

    @Test
    public void testPrevidenciaOficial2(){
        irpf.cadastrarPrevidenciaOficial(800f);
        assertEquals(800f, irpf.getPrevidenciaOficial(), 0);
    }

    @Test
    public void testCadastrarPrevidenciaSocial3(){
        irpf.cadastrarPrevidenciaOficial(900f);
    }
}
