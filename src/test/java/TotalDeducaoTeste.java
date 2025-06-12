import org.example.IRPF;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TotalDeducaoTeste {

    private IRPF irpf;

    @BeforeEach
    public void setUp() {
        irpf = new IRPF();
    }

    @Test
    public void totalDeducoes1(){
        irpf.cadastrarPrevidenciaOficial(500f);
        irpf.cadastrarPensao(200f);
        irpf.CadastrarDependente("Maria");
        irpf.CadastrarDependente("Maria Jose");
        irpf.cadastrarOutraDeducao(1320f);
        assertEquals(500f + 200f + 1320f + 2 * 189.59f,irpf.getTotalDeducao(),0);
    }

    @Test
    public void totalDeducoesVazio(){
        assertEquals(0f,irpf.getTotalDeducao(),0);
    }

}
