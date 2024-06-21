package test.com.exemplo.animais;

import com.exemplo.animais.Animal;
import com.exemplo.animais.Leao;
import org.junit.Assert;
import org.junit.Test;

public class LeaoTest {
    @Test
    public void testEmitirSom() {
         Animal leao = new Leao("Simba");
         leao.emitirSom();
         Assert.assertEquals("Simba está rugindo!",
                 leao.getNome() + " está rugindo!");
    }
}
