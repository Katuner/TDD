import org.example.IRPF;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CadastroPensaoTeste {

    private IRPF irpf;

    @BeforeEach
    public void setUp(){
        irpf = new IRPF();
    }

    @Test
    public void CadastrarPensao1(){
        irpf.cadastrarPensao(200f);
        assertEquals(200f, irpf.getPensao(),0);
    }

    @Test
    public void CadastrarPensao2(){
        irpf.cadastrarPensao(500f);
        assertEquals(500f, irpf.getPensao(),0);
    }

    @Test
    public void CadastrarPensao3(){
        irpf.cadastrarPensao(600f);
        assertEquals(600f, irpf.getPensao(),0);
    }
}
